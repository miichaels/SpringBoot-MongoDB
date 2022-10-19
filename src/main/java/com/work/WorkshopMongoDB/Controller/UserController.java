package com.work.WorkshopMongoDB.Controller;

import com.work.WorkshopMongoDB.Model.User;
import com.work.WorkshopMongoDB.Repository.UserRepository;
import com.work.WorkshopMongoDB.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserService service;

    @GetMapping("/usuarios")
    public ResponseEntity<List<User>> GetAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/test")
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }



    @PostMapping
    public ResponseEntity<User> post (@Valid @RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(user));
    }

}
