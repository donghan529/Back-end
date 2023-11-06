package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
//    @GetMapping("/hi")
//    public String nicetoMeetyou(){
//        return "greetings";
//    }
    @GetMapping("/hi")
    public String nicetoMeetyou(Model model){
        model.addAttribute("username", "donghan");
        return "greetings";
    }

    @GetMapping("/bye")
    public String goodBye(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }
}
