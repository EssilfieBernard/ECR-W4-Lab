package com.essilfie.ECRLab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ECRController {

    @GetMapping
    public String index() {
        return "index";
    }
}
