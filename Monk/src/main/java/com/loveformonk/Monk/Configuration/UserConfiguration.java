package com.loveformonk.Monk.Configuration;

import com.loveformonk.Monk.Repository.UserRepository;
import com.loveformonk.Monk.User.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User Chitransh = new User("Chitransh",
                    LocalDate.of(1996, Month.NOVEMBER, 22),
                    "chitransh.aang@gmail.com",
                    "Software Engineer",
                    "Work pressure, expectations from myself");

            User Julian = new User("Julian",
                    LocalDate.of(1980, Month.SEPTEMBER, 15),
                    "julian.003@gmail.com",
                    "Lawyer",
                    "Work pressure");

            repository.saveAll(
                    List.of(Chitransh, Julian)
            );
        };
    }
}
