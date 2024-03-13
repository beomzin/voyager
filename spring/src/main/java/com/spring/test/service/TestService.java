package com.spring.test.service;

import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {

	@Override
	public void test() {
		System.out.println("TestService메소드 호출");
	}

}
