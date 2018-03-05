package com.ly.service.impl;

import com.ly.controller.LoginController;
import com.ly.entity.UserEntity;
import com.ly.repository.UserRepository;
import com.ly.service.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private UserRepository userRepository;

    private static Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Override
    public int judge(String username, String password) {

        int status = 0;//登录失败
        if(StringUtils.isBlank(username) || StringUtils.isBlank(password)){
            LOGGER.info("账号密码为空");
            return status;

        }
        UserEntity userEntity = userRepository.findByUserName(username);


        if(userEntity == null){
            return status;
        }

        String pwd = userEntity.getUserPassword();
        if (!pwd.equals(password)) {
            return status;
        }

        Integer active = userEntity.getActive();
        if(active==0){
            status=2;//未激活
        }else{
            status = 1;//成功
        }
        return status;
    }

}
