package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService service;

    public UserService(NotificationService service) {
        this.service = service;
    }

}
