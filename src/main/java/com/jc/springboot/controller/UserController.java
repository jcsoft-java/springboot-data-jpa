package com.jc.springboot.controller;

import com.jc.springboot.entity.User;
import com.jc.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/2/1 20:09
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Integer id) {
        return userRepository.findOne(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User insertUser(User user) {
        return userRepository.save(user);
    }
}
