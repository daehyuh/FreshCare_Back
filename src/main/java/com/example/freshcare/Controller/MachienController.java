package com.example.freshcare.Controller;

import com.example.freshcare.Domain.Machien;
import com.example.freshcare.Service.MachienService;
import com.example.freshcare.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MachienController {
    public final MachienService machienService;
    @Autowired
    public MachienController(MachienService machienService){
        this.machienService = machienService;
    }
    

    @GetMapping(value = "/api/machinelist")
    @ResponseBody
    public List<Machien> save2(@RequestParam(value="roomNumber") Long idx, @RequestParam(value="machineType") Long type) {
        System.out.println(idx);
        System.out.println(type);
        return machienService.selectByLaundryIdx(idx, type);
    }

    @GetMapping(value = "/api/machienlist2")
    @ResponseBody
    public List<Machien> save3(Model model) {
        return machienService.findAll();
    }

    @GetMapping(value = "/api/getTime")
    @ResponseBody
    public String save4(@RequestParam(value="machineid") Long id) {
        return machienService.getTime(id);
    }

}
