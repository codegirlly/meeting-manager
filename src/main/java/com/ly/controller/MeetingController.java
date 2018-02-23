package com.ly.controller;

import com.ly.entity.ManagerEntity;
import com.ly.entity.MeetingEntity;
import com.ly.service.MeetingService;
import com.ly.vo.MeetingVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/meeting")
public class MeetingController {

    @Autowired
    private MeetingService meetingService;

    @RequestMapping("/add")
    @ResponseBody
    public void addMeeting(@Valid MeetingVo meetingVo, BindingResult bindingResult){

        meetingService.addMeeting(meetingVo);

    }
    @RequestMapping("/page/add")
    public String add(){
        return "/increase";
    }


}
