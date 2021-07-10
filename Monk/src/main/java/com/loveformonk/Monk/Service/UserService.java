package com.loveformonk.Monk.Service;

import com.loveformonk.Monk.Repository.UserRepository;
import com.loveformonk.Monk.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
/*   If somewhere we are autowiring userService into some other layer (like controller layer), we need to mark this as a Spring Bean.
     @Component allows the @Autowired to find the appropriate bean

     @Service and @Component behave in the exact same way, but because of Semantics, it increases transparency
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
