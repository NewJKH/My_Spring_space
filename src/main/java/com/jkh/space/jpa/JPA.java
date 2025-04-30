package com.jkh.space.jpa;


import com.jkh.space.jpa.domain.User;
import com.jkh.space.jpa.domain.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class JPA {
    private final UserRepository userRepository;

    public JPA(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {
        getName();
    }

    private void getName(){
        User user = new User();
        user.setName("ZZ");
        userRepository.save(user);

        User found = userRepository.findById(user.getId()).orElseThrow();
    }
}
