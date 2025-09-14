package in.bm.DatabaseRelationalApplication.REPOSITORY;

import in.bm.DatabaseRelationalApplication.MODEL.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRolesRepo extends JpaRepository<Roles,Integer> {
    Roles findByRoles(String roles);
}
