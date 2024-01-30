package com.firstproject.web.controller;

import ch.qos.logback.core.model.Model;
import com.firstproject.web.model.FormInfo;
import com.firstproject.web.repository.ProgrammerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@ControllerAdvice
public class MainController {

    @Autowired
    ProgrammerRepo pr;

    @ModelAttribute
    public void welcome(ModelMap m) {

        m.addAttribute("msg", "welcome to home page");
    }
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
    @PostMapping("/userinfo")
//    @RequestMapping(value = "/userinfo", method = RequestMethod.POST)
    public String userinfo(@ModelAttribute("f") FormInfo f) {
        pr.save(f);
        return "userinfo.html";
    }

    @GetMapping("/pInfo")
    public ModelAndView allProgrammer() {
        ModelAndView mv = new ModelAndView();
        List<FormInfo> f = new ArrayList<FormInfo>();
        f.add(new FormInfo(1, "Asik", "Django"));
        f.add(new FormInfo(2, "Sala vai", "Python"));
        f.add(new FormInfo(3, "Mahir", "Java"));
        mv.addObject("f", f);
        mv.setViewName("programmersInfo.html");
        return mv;
    }
}
