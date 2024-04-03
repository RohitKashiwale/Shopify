package com.kips.backend.service;

import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("http://localhost:3000/")
public interface EmailService {
    void send(String to, String email);
}
