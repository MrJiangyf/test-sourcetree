package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class First_controller {
    @RequestMapping("/test1")
    public ModelAndView test1(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "hello wo shi");
        mv.setViewName("test");

        return mv;
    }

    @RequestMapping("/baidu")
    public String baidu() throws Exception {
        return "www0725";
    }
}