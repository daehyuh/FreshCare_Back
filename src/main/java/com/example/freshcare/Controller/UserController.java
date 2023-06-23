package com.example.freshcare.Controller;

import com.example.freshcare.Domain.User;
import com.example.freshcare.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    public final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

//    @GetMapping(value = "/api/userList")
//    @ResponseBody
//    public List<User> findAll(Model model) {
//        List<User> users = userService.findAll();
//        return users;
//    }

    @GetMapping(value = "/userlist")
    public String users(Model model) {
        List<User> user = userService.findAll();
        model.addAttribute("user", user);
        return "userlist";
    }

    @PostMapping(value = "/api/userJoin")
    public String save(@Valid @ModelAttribute UserForm form) {
        User user = new User();
        user.setUserRoom(form.USERROOM);
        user.setUserMail(form.USEREMAIL);
        user.setUserPhone(form.USERPHONE);
        user.setUserPw(form.USERPW);
        userService.save(user);
        return "index";
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
