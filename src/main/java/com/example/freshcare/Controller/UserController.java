package com.example.freshcare.Controller;

import com.example.freshcare.Domain.Machien;
import com.example.freshcare.Domain.User;
import com.example.freshcare.Service.MachienService;
import com.example.freshcare.Service.UserService;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    public final UserService userService;
    public final MachienService machienService;
    @Autowired
    public UserController(UserService userService,MachienService machienService){
        this.userService = userService;
        this.machienService = machienService;
    }



    @GetMapping(value = "/userlist")
    public String users(Model model) {
        List<User> user = userService.findAll();
        model.addAttribute("user", user);
        return "userlist";
    }

    @GetMapping(value = "/api/userJoin")
    @ResponseBody
    public String save(@ModelAttribute UserForm form) {
        User user = new User();
        user.setUserRoom(form.getUSERROOM());
        user.setUserMail(form.getUSEREMAIL());
        user.setUserPhone(form.getUSERPHONE());
        user.setUserPw(form.getUSERPW());
        System.out.println(user.toString());
        System.out.println(user.toString());
        System.out.println(user.toString());
        userService.save(user);
        return user.getUserRoom();
    }

    @GetMapping(value = "/api/findByUserRoom")
    @ResponseBody
    public Long findByUserRoom(@RequestParam(value="room") String room) {
        return userService.findByUserRoom(room).get(0).getUserIdx();
    }

    @GetMapping(value = "/api/joinSlot")
    @ResponseBody
    public void joinSlott(@RequestParam(value="room") String room,
                          @RequestParam(value="pass") String pass,
                          @RequestParam(value="time") int time,
                          @RequestParam(value="MACHIENIDX") Long MACHIENIDX) {

        Long id = userService.findByUserRoom(room).get(0).getUserIdx();
        System.out.println(id);
        if(userService.existsByuserIdx(id)){
         //로그인필요
            System.out.println("존재");
                machienService.joinUser(MACHIENIDX, id);
                Calendar cal1 = Calendar.getInstance();
                cal1.add(Calendar.MINUTE, time);
                machienService.joinDate(MACHIENIDX, new Date(cal1.getTimeInMillis()));
//
        }

    }

    @GetMapping(value = "/api/outSlot")
    @ResponseBody
    public void joinSlott(@RequestParam(value="MACHIENIDX") Long MACHIENIDX) {

            machienService.deleteDate(MACHIENIDX);
            machienService.deleteDate2(MACHIENIDX);
    }

    static class ResponseEntity {
        private int code;
        private String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}