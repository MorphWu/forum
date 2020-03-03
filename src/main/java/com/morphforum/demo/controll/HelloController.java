package com.morphforum.demo.controll;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
	@GetMapping("/hello")
	public String NewFile(@RequestParam(name = "name")String name,Model model) {
		model.addAttribute("name", name);
		return "hello";
	}

}
