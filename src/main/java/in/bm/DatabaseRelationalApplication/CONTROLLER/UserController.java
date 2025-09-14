package in.bm.DatabaseRelationalApplication.CONTROLLER;

import in.bm.DatabaseRelationalApplication.MODEL.User;
import in.bm.DatabaseRelationalApplication.SERVICE.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/add")
    public ResponseEntity<User> add(@RequestBody User user){
        return userService.saveUser(user);
    }

// SpringBoot use jackson(Object mapper) that create the user obj behind the seen





}
