package com.work.WorkshopMongoDB.Service;

import com.work.WorkshopMongoDB.Model.User;
import com.work.WorkshopMongoDB.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

}
