package com.loveformonk.Monk.Repository;

import com.loveformonk.Monk.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long>    {      // The JpaRepository class here takes 2 identifiers - T, ID {T = Type of Object we are dealing with, ID = data type of the primary key of this object}

    // Below function will translate into a query such as select * from user where email = ???
    @Query("SELECT u from User u where u.email = ?1")
    Optional<User> findUserByEmail(String email);

}
