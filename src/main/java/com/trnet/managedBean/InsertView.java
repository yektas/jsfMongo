package com.trnet.managedBean;

import com.trnet.spring.dao.IUserDao;
import com.trnet.spring.model.Item;
import com.trnet.spring.model.User;
import com.trnet.spring.service.IUserService;
import com.trnet.spring.utils.Generator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "insertView")
public class InsertView {

    int count;

    @ManagedProperty(value = "#{userService}")
    IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void startInserting(){

        List<Item> items = new ArrayList<Item>();
        List<User> userList = new ArrayList<User>();
        Generator gen = new Generator();
        FacesContext context = FacesContext.getCurrentInstance();

        items.add(new Item(gen.getRandomInt(1, 1000), gen.getRandomInt(10, 300)));
        items.add(new Item(gen.getRandomInt(1, 1000), gen.getRandomInt(10, 300)));

        for(int i=0; i < getCount(); i++){
            User user = new User();
            user.setUsername("davar" + gen.getRandomInt(1, 6200));
            user.setItems(items);
            userList.add(user);
        }
        long startTime = System.nanoTime();
        getUserService().addUsers(userList);
        long elapsedTime = (System.nanoTime() - startTime) / 1000000;
        context.addMessage(null, new FacesMessage("Process is done.", "It took " + elapsedTime + " ms to insert " + getCount() + " documents"));

    }
}