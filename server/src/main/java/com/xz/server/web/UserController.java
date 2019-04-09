package com.xz.server.web;


import com.xz.server.dao.UserRepo;
import com.xz.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/save")
    public void updateUser(User user){
        userRepo.save(user);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@PathVariable(value = "id") String id){
        userRepo.deleteById(id);
    }

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userRepo.findAll();
    }

}
