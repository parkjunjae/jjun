package com.git.ex03.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Membercontroller {
    @GetMapping("aa")
    public String aa(){
        return "aa";
    }
}
