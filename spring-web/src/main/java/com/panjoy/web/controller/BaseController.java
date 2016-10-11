package com.panjoy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.panjoy.web.common.Article;

@Controller
public class BaseController {
	@RequestMapping(value = "/hello", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String index(Model view) {
		view.addAttribute("articles", Article.values());
		return "index";
	}

	@RequestMapping(value = "/upload")
	public String upload() {
		return "upload";

	}
}
