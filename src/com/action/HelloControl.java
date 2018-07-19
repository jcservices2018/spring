package com.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControl {

	@RequestMapping(value = "/byyy")
	public String hello(Model model) { // user:视图层传给控制层的表单对象；model：控制层返回给视图层的对象
		model.addAttribute("user", "123");
		return "hello";
	}
}
