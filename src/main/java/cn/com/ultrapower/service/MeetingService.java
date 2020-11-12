package cn.com.ultrapower.service;

import cn.com.ultrapower.entity.Meeting;

import java.util.List;

public interface MeetingService {
    List<Meeting> findAll();
    int add(Meeting meeting);
}
