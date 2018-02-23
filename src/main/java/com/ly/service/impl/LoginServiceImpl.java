package com.ly.service.impl;

import com.ly.entity.UserEntity;
import com.ly.repository.UserRepository;
import com.ly.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean judge(String username, String password) {
        UserEntity userEntity = userRepository.findByUserName(username);

        boolean status = false;
        if(userEntity == null){
            return status;
        }
        String pwd = userEntity.getUserPassword();
        if (pwd.equals(password)) {
            status = true;
        }
        return status;

    }
}
