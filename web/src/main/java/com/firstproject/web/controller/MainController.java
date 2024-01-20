package com.firstproject.web.controller;

import ch.qos.logback.core.model.Model;
import com.firstproject.web.model.FormInfo;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String index () {
        return "index.html";
    }
//    @RequestMapping("/userinfo")
//    public String userinfo (@RequestParam int id,
//                            @RequestParam String name, @RequestParam String lang, ModelMap model) {
////        System.out.println(id + " " + name + " " + lang);
//        model.addAttribute("id", id);
//        model.addAttribute("name", name);
//        model.addAttribute("lang", lang);
//        return "userinfo.html";
//    }

//    @RequestMapping("/userinfo")
//    public ModelAndView userinfo(@RequestParam("id") int Id, @RequestParam("name") String Name,
//                                 @RequestParam("lang") String Lang) {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("id", Id);
//        mv.addObject("name", Name);
//        mv.addObject("lang", Lang);
//        mv.setViewName("userinfo.html");
//        return mv;
//    }

//    @RequestMapping("/userinfo")
//    public ModelAndView userinfo(@ModelAttribute("f") FormInfo form) {
//        ModelAndView mv = new ModelAndView();
////        mv.addObject("form", form);
//        mv.setViewName("userinfo.html");
//        return mv;
//    }
    @RequestMapping("/userinfo")
    public String userinfo(@ModelAttribute("f") FormInfo f) {
        return "userinfo.html";
    }
}
