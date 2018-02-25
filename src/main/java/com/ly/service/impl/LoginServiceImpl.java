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
    public int judge(String username, String password) {
        UserEntity userEntity = userRepository.findByUserName(username);

        int status = 0;
        if(userEntity == null){
            return status;
        }

        String pwd = userEntity.getUserPassword();
        if (!pwd.equals(password)) {
            return status;
        }

        Integer active = userEntity.getActive();
        if(active==0){
            status=2;
        }else{
            status = 1;
        }
        return status;
    }

}
