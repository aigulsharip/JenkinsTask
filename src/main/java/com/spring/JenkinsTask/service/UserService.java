package com.spring.JenkinsTask.service;


import com.spring.JenkinsTask.entity.User;

import java.util.List;

public interface UserService {

    public User getUserById(Integer id);

    public User saveUser(User user);

    public List<User> getAllUsers ();
}
