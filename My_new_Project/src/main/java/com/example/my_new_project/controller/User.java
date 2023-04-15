package com.example.my_new_project.controller;


import com.example.my_new_project.repositor.UserRepositor;
import com.example.my_new_project.users.Cmc;
import com.example.my_new_project.users.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.Optional;

@RestController
@RequestMapping("/user")
public class User {
    @Autowired
    UserRepositor userRepositor;

    @GetMapping
    public HttpEntity<?> getUser() {
        return ResponseEntity.ok(userRepositor.findAll());
    }
    @PostMapping
    public HttpEntity<?> postUser(@RequestBody Users users) {
        userRepositor.save(users);
        return ResponseEntity.ok(userRepositor.save(users));
    }
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteUser(@PathVariable Integer id) {
        userRepositor.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
