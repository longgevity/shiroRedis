package com.zzyu.zzyushiroredis.sysconfig;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping("test")
    public String test(Model model){
        model.addAttribute("name","学习测试");
        return "test";
    }


}
