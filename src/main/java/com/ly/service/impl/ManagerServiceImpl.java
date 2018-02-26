package com.ly.service.impl;

import com.ly.entity.ManagerEntity;
import com.ly.entity.UserEntity;
import com.ly.repository.ManagerRepository;
import com.ly.repository.UserRepository;
import com.ly.service.ManagerService;
import com.ly.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public boolean register(UserVo userVo) {
        UserEntity userEntity = userRepository.findByUserName(userVo.getUserName());
        boolean status = false;
        if (userEntity==null) {
            UserEntity entity = new UserEntity();
           String uuid = UUID.randomUUID().toString();
           entity.setUserId(uuid);
            entity.setActive(0);
            BeanUtils.copyProperties(userVo, entity);
            userRepository.save(entity);
            status = true;
            return status;
        }
       return status;
    }

    @Override
    public boolean managerLogin(String username, String password) {
        boolean status = false;
        ManagerEntity managerEntity = managerRepository.findByName(username);
        if (managerEntity == null) {
            return status;
        }
        if(managerEntity.getPassword().equals(password)) {
            status = true;
        } return status;
    }
}
