package com.zone.shoppingzone.controller;


	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	@Controller

	public class HomePageController {
		@RequestMapping(value = {"/","/home","/index"})
		public ModelAndView index()
		{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome To Spring WebMVC");
		return mv;
		
		
		}

	}
