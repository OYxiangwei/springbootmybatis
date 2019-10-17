package com.test.springbootmybatis.controller;

import com.test.springbootmybatis.entity.User;
import com.test.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public String save(User user){
        userService.save(user);
        return "save success";
    }
    @PutMapping("{id}")
    public String update(User user, @PathVariable int id){
        if(userService.findById(id) == null){
            return "Not Exist";
        }
        if(user.getId() != id){
            return "Unmatched parameters";
        }
        userService.update(user);
        return "update success";
    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        userService.delete(id);
        return "delete success";
    }
    @GetMapping
    public List<User> list(){
        return userService.list();
    }
    @GetMapping("{id}")
    public User findById(@PathVariable int id){
        return userService.findById(id);
    }
}
