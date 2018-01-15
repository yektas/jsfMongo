package com.trnet.spring.service;

import com.trnet.spring.dao.IUserDao;
import com.trnet.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    public void addUsers(List<User> user) {
        userDao.saveUsers(user);
    }

    public List<User> getUsers() {
        return userDao.retrieveUsers();
    }
}
