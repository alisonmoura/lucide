package com.lucide.view;

import com.lucide.model.User;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class UserController {

    private User user = new User("Alison Moura","alison.oghino@gmail.com","1234");

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
