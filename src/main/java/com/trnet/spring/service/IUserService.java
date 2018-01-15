package com.trnet.spring.service;

import com.trnet.spring.model.User;

import java.util.List;

public interface IUserService {

    public void addUsers(List<User> user);
    public List<User> getUsers();

}
