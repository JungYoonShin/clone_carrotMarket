package com.example.carrotmarket;

import com.example.carrotmarket.entity.User;
import com.example.carrotmarket.entity.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class controller {
    private final UserRepository userRepository;

    @GetMapping("/hi")
    public String hi() {
//        User user = new User();
//        userRepository.save(user);
        return "djlksjdlf";
    }
}
