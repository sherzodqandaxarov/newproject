package com.example.my_new_project.repositor;

import com.example.my_new_project.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositor extends JpaRepository<Users, Integer> {
}
