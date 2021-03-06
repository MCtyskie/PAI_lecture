package com.pai.application.Repositories;

import com.pai.application.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByEmail (String email);
    Optional<User> findUserByUserId(Integer userId);
    Optional<User> findUserByEmailAndPassword(String email, String password);
}
