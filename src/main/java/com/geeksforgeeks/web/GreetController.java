package com.geeksforgeeks.web;

import org.springframework
	.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web
	.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web
	.servlet.ModelAndView;

@RestController
public class GreetController {

	@RequestMapping("/greet")
	public ModelAndView showview()
	{

		ModelAndView mv = new ModelAndView();
		mv.setViewName("Result.jsp");
		mv.addObject("result",
					"Test Message!");
		return mv;
	}
	@GetMapping("/test")
	public String testMethod() {
		return "hello";
	}
}
