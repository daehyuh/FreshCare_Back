package com.example.freshcare.Controller;

import com.example.freshcare.Domain.LaundryRoom;
import com.example.freshcare.Service.LaundryRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LaundryController {
    public final LaundryRoomService laundryRoomService;
    @Autowired
    public LaundryController(LaundryRoomService laundryRoomService){
        this.laundryRoomService = laundryRoomService;
    }

    @GetMapping(value = "/")
    public String users(Model model) {
        List<LaundryRoom> LaundryRoom = laundryRoomService.findAll();
        model.addAttribute("LaundryRoom", LaundryRoom);
        return "selectRoom";
    }

    @GetMapping(value = "/api/roomList")
    @ResponseBody
    public List<LaundryRoom> users() {
        return laundryRoomService.findAll();
    }

    @PostMapping(value = "/api/laundryJoin")
    public String laundryJoin(@Valid @ModelAttribute LaundryForm form) {
        LaundryRoom laundryRoom = new LaundryRoom();
        laundryRoom.setLaundryName(form.LAUNDRYNAME);
        laundryRoomService.save(laundryRoom);
        return "index";
    }

}
