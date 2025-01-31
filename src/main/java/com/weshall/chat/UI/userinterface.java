package com.weshall.chat.UI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userinterface {
    @GetMapping("/")
    public String loginUi(){
        return "index";
    }
}
