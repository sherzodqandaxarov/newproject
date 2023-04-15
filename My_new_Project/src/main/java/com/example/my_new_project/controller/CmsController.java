package com.example.my_new_project.controller;

import com.example.my_new_project.repositor.CmcRepository;
import com.example.my_new_project.users.Cmc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/sms")
public class CmsController {

    @Autowired
    CmcRepository cmcRepository;

    @GetMapping
    public HttpEntity<?> getCmc() {
        return ResponseEntity.ok(cmcRepository.findAll());
    }

    @PostMapping
    public HttpEntity<?> postCms(@RequestBody Cmc cmc) {
        cmcRepository.save(cmc);
        return ResponseEntity.ok(cmcRepository.save(cmc));
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteCms(@PathVariable Integer id) {
        cmcRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
