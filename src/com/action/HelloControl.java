package com.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.UserDTO;

@Controller
public class HelloControl {

	@RequestMapping(value="/byyy2", method=RequestMethod.GET)
	public void hello(){
		System.out.println("123");
	}
	
	@RequestMapping(value = "/byyy", method=RequestMethod.GET)
	@ResponseBody
	public String hello(Model model){
		return "hello";
	}
	
	@RequestMapping(value = "/byyy", method=RequestMethod.POST)
	public String hello(UserDTO pageDTO, Model model) {
		model.addAttribute("user", pageDTO);
		return "hello";
	}
	
	@RequestMapping(value="/byyy/{message}")
	public ModelAndView hello(@PathVariable("message")String message){
		ModelAndView mv = new ModelAndView();
		System.out.println(message);
		mv.setViewName("hello");
		return mv;
	}
}
