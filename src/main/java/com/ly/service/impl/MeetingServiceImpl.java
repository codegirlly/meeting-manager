package com.ly.service.impl;

import com.ly.entity.MeetingEntity;
import com.ly.repository.MeetingRepository;
import com.ly.service.MeetingService;
import com.ly.vo.MeetingVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;

    @Override
    public void addMeeting(MeetingVo meetingVo) {

        MeetingEntity meetingEntity = new MeetingEntity();
        BeanUtils.copyProperties(meetingVo,meetingEntity);
        //todo 根据开始结束时间判断会议状态
        meetingEntity.setStatus(0);
        meetingEntity.setmanagerId(1);
        meetingRepository.save(meetingEntity);
    }

    @Override
    public List<MeetingEntity> findAll() {
      return  meetingRepository.findAll();

    }


}
