package com.trnet.spring.dao;

import com.trnet.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    MongoTemplate mongoTemplate;

    String collectionName = "mongoTest";

    public void saveUsers(List<User> userList) {
        mongoTemplate.insert(userList, collectionName);

    }

    public List<User> retrieveUsers() {
        return mongoTemplate.findAll(User.class, collectionName);
    }
}
