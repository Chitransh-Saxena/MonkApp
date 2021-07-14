package com.loveformonk.Monk.Controller;

import com.loveformonk.Monk.Service.UserService;
import com.loveformonk.Monk.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                                     // This annotation makes the current class serve as the Rest End Points
@RequestMapping(path = "api/v1/User")               // All the endpoints in this class will have this base URL
public class UserController {

    private final UserService userService;

    @Autowired                                      // By autowiring this, we are saying that userService would be instantiated for us and used here
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){

        return userService.getUsers();
    }

    @PostMapping(value = "/putUsers")
    public void putUsers(@RequestBody User user){               // We take the request body of the APIs JSON, and map it to the User object

        userService.addUser(user);
    }


    // TODO - Implement the functionality to delete a user based on userID
}
