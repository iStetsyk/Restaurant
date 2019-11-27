package com.repositories;

import com.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long > {

//    User findByUserName(String userName);

}
