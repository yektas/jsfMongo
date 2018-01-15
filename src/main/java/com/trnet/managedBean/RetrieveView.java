package com.trnet.managedBean;

import com.trnet.spring.model.User;
import com.trnet.spring.service.IUserService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "retrieveView")
@SessionScoped
public class RetrieveView {

    List<User> users;

    @ManagedProperty(value = "#{userService}")
    IUserService userService;


    @PostConstruct
    public void init(){
        users = new ArrayList<User>();
        setUsers(getUserService().getUsers());
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String show(){
        return "data";
    }

}
