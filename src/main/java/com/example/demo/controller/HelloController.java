package com.example.demo.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello(Model model,
		Principal principal ) {

		//ログインしているユーザーの「username」を取得
		String username = principal.getName();
		model.addAttribute("greet", "hello!");
		model.addAttribute("loginuser", username);

		return "hello";
	}

}
