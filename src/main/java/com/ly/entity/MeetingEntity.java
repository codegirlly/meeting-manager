package com.ly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name="t_meeting")
@Entity
public class MeetingEntity {

    @Id
    private Integer id;
    private String name;
    private Integer peopleNum;
    private Date beginTime;
    private Date endTime;
    private Integer roomId;
    @Column(columnDefinition = "tinyint")
    private Integer status;
    private Integer managerId;
    @Column(columnDefinition = "text")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getpeopleNum() {
        return peopleNum;
    }

    public void setpeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    public Date getbeginTime() {
        return beginTime;
    }

    public void setbeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getendTime() {
        return endTime;
    }

    public void setendTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getroomId() {
        return roomId;
    }

    public void setroomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getmanagerId() {
        return managerId;
    }

    public void setmanagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
