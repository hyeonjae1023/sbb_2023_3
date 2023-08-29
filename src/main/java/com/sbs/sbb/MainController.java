package com.sbs.sbb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class MainController {
    @RequestMapping("/sbb")
    @ResponseBody
    public String index() {
        return "index";
    }
}
