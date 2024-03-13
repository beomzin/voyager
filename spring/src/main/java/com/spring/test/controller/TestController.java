package com.spring.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	// @RequestMapping(value = "주소") : 해당 주소가 들어올 경우 아래 메소드 실행
	@RequestMapping(value = "/test")
	public ModelAndView test(ModelAndView mav) {
		// ModelAndView : 데이터를 보관하며, 뷰 정보나 뷰가 담기는 객체
		// Spring에서 Controller의 메소드 인자는 Spring에서 자동 생성 해서 제공한다.

		// addObject(키, 값) : Model에 해당 키와 값을 담는다.
		// 값으로 담길수 있는 것은 Object이기 때문에 무엇이든 담긴다.
		mav.addObject("msg", "Hello");

		// setViewName(값) : 뷰의 정보(위치 또는 주소)를 보관한다
		mav.setViewName("test/a");

		return mav;
	}

	@RequestMapping(value = "/test2")
	public ModelAndView test2(
			// HttpServletRequest : 요청에 대한 정보가 담긴 객체
			HttpServletRequest req,
			// @RequestParam : 넘어오는 값 중 변수명과 이름이 같은 것을 받음
			@RequestParam String txt,
			// @RequestParam(value ="값") : RequestParam에서 value옵션의 경우 변수명이 일치하지 않아도 value가
			// 넘어오는 키와 같으면 넣어준다
			@RequestParam(value = "txt") String s,
			// RequestParam에 Collection형태를 제공할 경우 해당 형태에 맞추어 자동으로 값을 집어 넣음
			// Map의 경우 키, 값의 형태로 제공되며, List나 배열의 경우 같은 이름으로 여러개가 넘어오면 순차적으로 보관
			@RequestParam HashMap<String, String> m, ModelAndView mav) {
		// getParameter(값) : 넘어오는 값 중 키가 지정한 값과 같은 경우 해당 값을 가져옴.
		System.out.println(req.getParameter("txt"));
		System.out.println(txt);
		System.out.println(s);
		System.out.println(m.get("txt"));

		mav.setViewName("test/test2");

		return mav;
	}

	// 구구단
	@RequestMapping(value = "/gugu")
	public ModelAndView gugu(ModelAndView mav) {

		mav.setViewName("test/gugu");

		return mav;
	}

	@RequestMapping(value = "/gugures")
	public ModelAndView gugures(@RequestParam(value = "dan") int d, ModelAndView mav) {
		String result = "";

		for (int i = 1; i < 10; i++) {
			result += d + " X " + i + " = " + d * i + "<br/>";
		}

		mav.addObject("result", result);

		mav.setViewName("test/gugures");

		return mav;
	}

	@RequestMapping(value = "/test3")
	public ModelAndView test3(ModelAndView mav) {
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

		for (int i = 10; i > 0; i--) {
			HashMap<String, String> data = new HashMap<String, String>();
			data.put("no", Integer.toString(i));
			data.put("title", "Test" + i);

			list.add(data);
		}

		mav.addObject("list", list);

		mav.setViewName("test/test3");

		return mav;
	}

	@RequestMapping(value = "/test4")
	public ModelAndView test4(ModelAndView mav) {

		mav.setViewName("test/test4");

		return mav;
	}

	@RequestMapping(value = "/test5")
	public ModelAndView test5(@RequestParam int num, ModelAndView mav) {
		int com = (int) Math.floor(Math.random() * 3) + 1;

		switch (com) {
		case 1:
			mav.addObject("com", "가위");
			break;
		case 2:
			mav.addObject("com", "바위");
			break;
		case 3:
			mav.addObject("com", "보");
			break;
		}

		switch (num) {
		case 1:
			mav.addObject("num", "가위");
			break;
		case 2:
			mav.addObject("num", "바위");
			break;
		case 3:
			mav.addObject("num", "보");
			break;
		}

		if (com == num) {
			mav.addObject("result", "DRAW");
		} else if (com == 1 && num == 2 || com == 2 && num == 3 || com == 3 && num == 1) {
			mav.addObject("result", "WIN!");
		} else {
			mav.addObject("result", "LOSE");
		}

		mav.setViewName("test/test5");

		return mav;
	}

}
