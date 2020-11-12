package cn.com.ultrapower.service.impl;

import cn.com.ultrapower.entity.Meeting;
import cn.com.ultrapower.mapper.MeetingMapper;
import cn.com.ultrapower.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly=false,rollbackFor = Exception.class)
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingMapper meetingMapper;

    public List<Meeting> findAll() {
        return meetingMapper.findAll();
    }

    @Transactional(readOnly=true)
    public int add(Meeting meeting) {
        return 0;
    }
}
