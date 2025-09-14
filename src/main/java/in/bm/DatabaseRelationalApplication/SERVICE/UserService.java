package in.bm.DatabaseRelationalApplication.SERVICE;

import in.bm.DatabaseRelationalApplication.MODEL.Order;
import in.bm.DatabaseRelationalApplication.MODEL.Roles;
import in.bm.DatabaseRelationalApplication.MODEL.User;
import in.bm.DatabaseRelationalApplication.REPOSITORY.UserRolesRepo;
import in.bm.DatabaseRelationalApplication.REPOSITORY.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private UserRolesRepo roleRepo;

    public ResponseEntity<User> saveUser(User user) {


        if (user.getOrder() != null) {
            for (Order order : user.getOrder()) {
                order.setUser(user);
            }
        }


        if (user.getRoles() != null) {
            List<Roles> rolesToAttach = new ArrayList<>();
            for (Roles role : user.getRoles()) {
                Roles existingRole = roleRepo.findByRoles(role.getRoles());
                if (existingRole != null) {
                    rolesToAttach.add(existingRole);
                } else {
                    Roles newRole = roleRepo.save(role);
                    rolesToAttach.add(newRole);
                }
            }
            user.setRoles(rolesToAttach);
        }


        User savedUser = repo.save(user);

        return ResponseEntity.ok(savedUser);
    }


}
