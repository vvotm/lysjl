package com.lianying.shangjialian.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luowen on 2017/2/10.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping
    public String home() {
        return "home";
    }

}
