package com.fcfm.repository;

import java.io.Serializable;

import com.fcfm.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable> {

    public abstract User findByUsername(String username);

}