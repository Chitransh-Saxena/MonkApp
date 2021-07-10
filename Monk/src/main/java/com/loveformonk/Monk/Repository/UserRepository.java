package com.loveformonk.Monk.Repository;

import com.loveformonk.Monk.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long>    {      // The JpaRepository class here takes 2 identifiers - T, ID {T = Type of Object we are dealing with, ID = data type of the primary key of this object}


}
