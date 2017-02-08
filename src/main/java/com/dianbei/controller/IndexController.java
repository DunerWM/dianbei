package com.dianbei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wm on 17/2/8.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String showIndex(HttpServletRequest request) {
        return "index";
    }

}
