package com.sda.planer.controller;

import com.sda.planer.model.Room;
import com.sda.planer.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public ModelAndView getAllRooms(){
        ModelAndView modelAndView = new ModelAndView("allRooms");
        modelAndView.addObject("rooms", roomService.getAllRooms());
        return modelAndView;
    }

    @PostMapping
    public String saveRoom(@ModelAttribute Room room){
        roomService.addRoom(room);
        return "redirect:/rooms";
    }

    @GetMapping("/{id}")
    public ModelAndView getRoom(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView("room");
        modelAndView.addObject("room", roomService.get(id));
        return modelAndView;
    }
}
