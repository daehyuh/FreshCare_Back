package com.example.freshcare.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UrlController {

    @GetMapping(value = "/join")
    public String url2(){
        return "join";
    }
    @GetMapping(value = "/laundryjoin")
    public String url3(){
        return "Laundryjoin";
    }

}
