package com.ly.repository;

import com.ly.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private MeetingRepository meetingRepository;

    @Autowired
    private RelationRepository relationRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private SuperManagerRepository superManagerRepository;

    @Test
    public void drink(){
        UserEntity ue = new UserEntity();
        ue.setUserId(2012);
        ue.setUserName("fzj");
        ue.setUserPassword("1994");
        userRepository.save(ue);
    }
    @Test
    public void managerTest(){
        ManagerEntity me = new ManagerEntity();
        me.setId(23);
        me.setName("asd");
        me.setPassword("abcd");
        managerRepository.save(me);
    }
    @Test
    public void meetingTest(){
        MeetingEntity meetingEntity = new MeetingEntity();
        meetingEntity.setId(12);
        meetingEntity.setName("sunday");
        meetingEntity.setbeginTime(new Date());
        meetingEntity.setDescription("huiyi");
        meetingEntity.setendTime(new Date());
        meetingEntity.setpeopleNum(60);
        meetingEntity.setmanagerId(23);
        meetingEntity.setroomId(3);
        meetingEntity.setStatus(1);
        meetingRepository.save(meetingEntity);

    }

    @Test
    public void relationTest(){
        RelationEntity relationEntity = new RelationEntity();
        relationEntity.setmeetingId(12);
        relationEntity.setuserId(3);
        relationRepository.save(relationEntity);
    }

    @Test
    public void roomTest() {

        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setRoomId(34);
        roomEntity.setRoomName("办公室");
        roomRepository.save(roomEntity);

    }

    @Test
    public void superManagerTest(){

        SuperManagerEntity superManagerEntity = new SuperManagerEntity();
        superManagerEntity.setId(1);
        superManagerEntity.setName("ly");
        superManagerEntity.setPassword("123456");
        superManagerRepository.save(superManagerEntity);

    }
}
