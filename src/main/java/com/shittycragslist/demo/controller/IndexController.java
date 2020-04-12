package com.shittycragslist.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@GetMapping("subcategory/{name}")
	public String getSubCategory(@PathVariable("name") final String name, Model model) {
		final List<String> posts = Arrays.asList("post-1","post-2","post-3");
		
		model.addAttribute("name", name);
		model.addAttribute("posts",posts);
		return "subcategory";
	}
	
	@GetMapping("post/{name}")
	public String getPost(@PathVariable("name") final String name, Model model) {
		model.addAttribute("name", name);
		return "post";
	}
}
