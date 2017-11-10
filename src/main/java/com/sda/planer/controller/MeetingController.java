package com.sda.planer.controller;

import com.sda.planer.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/meetings")
public class MeetingController {

    private MeetingService meetingService;

    @Autowired
    public MeetingController(MeetingService meetingService) {
        this.meetingService = meetingService;
    }

    public ModelAndView getAll(){
        ModelAndView modelAndView = new ModelAndView("allMeetings");
        modelAndView.addObject("meetings", meetingService.getAll());
        return modelAndView;
    }


}
