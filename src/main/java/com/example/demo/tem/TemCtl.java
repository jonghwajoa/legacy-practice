package com.example.demo.tem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class TemCtl {

	
	@GetMapping("/tem")
	public String tem(Model model) {
//		Model model = new ExtendedModelMap();
        model.addAttribute("message", "Hello, World!");
        model.addAttribute("userId", "JJONG");
        model.addAttribute("userName", "JJONG TTang");
        model.addAttribute("isLogin", "true");
        
        List<String> names = new ArrayList<>();
        names.add("hong");
        names.add("jong");
        names.add("tang");
        names.add("jjang");
        model.addAttribute("names", names);
        
		return "tem/tem";
//        return new ModelAndView("tem/tem", (ExtendedModelMap) model);
	}
	
	
	@GetMapping("/header")
	public String header(Model model) {
		return "tem/header";
	}
	
}
