package com.java.test.svc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevatorSvc {

	Scanner sc = new Scanner(System.in);
	// 층수
	String floor[] = { "1층", "2층", "3층" };
	// 현재층
	int now = 0;
	// 탑승자 상태
	List<Integer> ev = new ArrayList<Integer>();
	// 방향 전환
	int pos = -1;
	// 최대 인원
	int max = 4;

	public void run() {
		boolean r = true;
		System.out.println("===========ELEVATOR============");

		while (r) {
			System.out.println("===============================");
			System.out.println("현재 " + floor[now] + "입니다.");
			System.out.println("===============================");
			System.out.println("1.탑승 2.이동 3.탑승인원 9.종료");
			switch (sc.nextLine()) {
			case "1":
				join();
				break;
			case "2":
				move();
				break;
			case "3":
				status();
				break;
			case "9":
				System.out.println("!!!!!!!!!!!!!!!종료!!!!!!!!!!!!!!!");
				r = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}

	public void move() {
		if (now == floor.length - 1 || now == 0) {
			pos *= -1;
		}
		now += pos;
		System.out.println();

		int cnt = 0;
		for (int i = 0; i < ev.size(); i++) {
			if (ev.get(i) == now) {
				ev.remove(i);
				i--;
				cnt++;
			}
		}

		if (cnt > 0)
			System.out.println(cnt + "명이 내렸습니다.");
	}

	public void join() {
		System.out.println("몇 층으로 가시겠습니까");
		for (int i = 0; i < floor.length; i++) {
			System.out.print(floor[i] + " ");
		}
		System.out.println();

		String dest = sc.nextLine();
		int a = Integer.parseInt(dest) - 1;

		if (ev.size() > max - 1) {
			System.out.println();
			System.out.println("다음 엘리베이터를 이용해 주세요.");
		} else {
			if (a == now) {
				System.out.println();
				System.out.println("현재 층과 동일합니다. 다시 선택해 주세요.");
			} else
				ev.add(a);
		}
	}

	public void status() {
		System.out.println();
		System.out.println("탑승인원(최대 4명)");

		for (int i = 0; i < ev.size(); i++) {
			System.out.print(floor[ev.get(i)] + " ");
		}
		System.out.println();
	}
}