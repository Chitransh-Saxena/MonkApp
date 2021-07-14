package com.loveformonk.Monk.Service;

import com.loveformonk.Monk.Repository.UserRepository;
import com.loveformonk.Monk.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void addUser(User user){
        Optional<User> u = userRepository.findUserByEmail(user.getEmail());

        if(!u.isEmpty()) {
            System.out.println("User already exists.");
        }
        else{
            userRepository.save(user);
            System.out.println("USer = " + user + "\nsaved to repository");
        }
    }
}
