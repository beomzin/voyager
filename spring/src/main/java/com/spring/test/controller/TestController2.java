package com.spring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.test.service.ITestService;

@Controller
public class TestController2 {

	// 객체 의존성 주입 요청 : 다음 지정된 객체 의존성 주입 요청
	@Autowired
	public ITestService iTestService;

	@RequestMapping(value = "/test6")
	public ModelAndView test6(ModelAndView mav) {

		iTestService.test();

		mav.setViewName("test/test6");

		return mav;
	}

}
