package cn.com.ultrapower.controller;

import cn.com.ultrapower.entity.Meeting;
import cn.com.ultrapower.service.MeetingService;
import cn.com.ultrapower.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meeting")
public class MeetingController {

    @Autowired
    private MeetingService meetingService;

    @GetMapping(value = "/list")
    public R list() {
        List<Meeting> meetings= meetingService.findAll();
        return R.ok().data(meetings);
    }
}
