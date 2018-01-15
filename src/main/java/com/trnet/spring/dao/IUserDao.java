package com.trnet.spring.dao;

import com.trnet.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

public interface IUserDao {

    public void saveUsers(List<User> user);
    public List<User> retrieveUsers();

}
