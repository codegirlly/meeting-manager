package com.ly.service;

import com.ly.entity.MeetingEntity;
import com.ly.vo.MeetingVo;

import java.util.List;

public interface MeetingService {

    void addMeeting(MeetingVo meetingVo);
    List<MeetingEntity> findAll();

}
