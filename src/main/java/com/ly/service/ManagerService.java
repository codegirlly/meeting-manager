package com.ly.service;

import com.ly.vo.UserVo;

public interface ManagerService {

    boolean register(UserVo userVo);
    boolean managerLogin(String username,String password);
}
