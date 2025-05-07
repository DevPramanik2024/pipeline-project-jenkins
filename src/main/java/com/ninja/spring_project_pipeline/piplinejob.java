package com.ninja.spring_project_pipeline;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class piplinejob 
{
@RequestMapping("/test")
	public String test()
	{
	return "this is test return page";
	}
}
