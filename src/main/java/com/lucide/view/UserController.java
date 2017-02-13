package com.lucide.view;

import com.lucide.model.User;
import com.lucide.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class UserController {

    @Autowired
    private UserRepository userRepository;

    private User user = new User();
    private List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){
        users = userRepository.findAll();
    }

    public void save(){
        userRepository.save(user);
        users = userRepository.findAll();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
