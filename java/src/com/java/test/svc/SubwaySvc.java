package com.java.test.svc;

import java.util.Scanner;

public class SubwaySvc {
	public Scanner sc = new Scanner(System.in);

	public void run() {
		System.out.println("=========SUBWAY=========");
		System.out.println("신도림-까치산행 열차 출발합니다.");
		System.out.println("========================");
		move();
		// 구동 체크용
		boolean runFlag = true;
		while (runFlag) {

			switch (sc.nextLine()) {
			case "1":
				in();
				break;
			case "2":
				System.out.println("출입문 닫습니다.");
				move();
				break;
			case "3":
				detail();
				break;
			case "9":
				System.out.println("운행종료");
				runFlag = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

	String[] stnt = { "신도림역", "도림천역", "양천구청역", "신정네거리역", "까치산역" };
	String[] train = { "", "", "", "" };
	String hope = "";

//	탑승

	public void in() {
		System.out.println("------------------------");
		System.out.println("몇 호차에 탑승하시겠습니까?");
		System.out.println("1호차 2호차 3호차 4호차");
		switch (sc.nextLine()) {
		case "1":
			dstnt();
			train[0] = hope;
			break;
		case "2":
			dstnt();
			train[1] = hope;
			break;
		case "3":
			dstnt();
			train[2] = hope;
			break;
		case "4":
			dstnt();
			train[3] = hope;
			break;
		default:
			System.out.println("입력하신 호차는 존재 하지 않습니다.");
			System.out.println("------------------------");
			System.out.println("1.탑승 2.이동 3.상태 9.종료");
		}
	}

//	목적지
	public void dstnt() {
		System.out.println("------------------------");
		System.out.println("목적지를 선택해주세요");
		for (int i = 0; i < stnt.length; i++) {
			System.out.print((i + 1) + "." + stnt[i] + " ");
		}
		System.out.println();

		switch (sc.nextLine()) {
		case "1":
			hope = stnt[0];
			System.out.println("------------------------");
			System.out.println("1.탑승 2.이동 3.상태 9.종료");
			break;
		case "2":
			hope = stnt[1];
			System.out.println("-------------------------");
			System.out.println("1.탑승 2.이동 3.상태 9.종료");
			break;
		case "3":
			hope = stnt[2];
			System.out.println("-------------------------");
			System.out.println("1.탑승 2.이동 3.상태 9.종료");
			break;
		case "4":
			hope = stnt[3];
			System.out.println("------------------------");
			System.out.println("1.탑승 2.이동 3.상태 9.종료");
			break;
		case "5":
			hope = stnt[4];
			System.out.println("------------------------");
			System.out.println("1.탑승 2.이동 3.상태 9.종료");
			break;
		default:
			System.out.println("다른열차를 이용해주세요.");
			System.out.println("------------------------");
			System.out.println("1.탑승 2.이동 3.상태 9.종료");
		}
	}

//	하차
	public void out() {
		int cnt = 0;
		for (int i = 0; i < train.length; i++) {
			if (stnt[num] == train[i]) {
				train[i] = "";
				cnt++;
			}
		}
		System.out.println(cnt + "명 하차");
		System.out.println("------------------------");
	}

//	이동
	boolean flag = true;
	int num = 0;

	public void move() {
		if (flag) {
			System.out.println("------------------------");
			System.out.println("이번역은 " + stnt[num] + "입니다.");
			System.out.println("------------------------");
			out();
			System.out.println("1.탑승 2.이동 3.상태 9.종료");
			num++;
			if (num == 5) {
				num -= 2;
				flag = false;
			}
		} else if (!flag) {
			System.out.println("------------------------");
			System.out.println("이번역은 " + stnt[num] + "입니다.");
			System.out.println("------------------------");
			out();
			System.out.println("1.탑승 2.이동 3.상태 9.종료");
			num--;
			if (num <= 0) {
				flag = true;
			}
		}
	}

//	상태
	public void detail() {
		System.out.println("------------------------");
		for (int i = 0; i < train.length; i++) {
			System.out.println((i + 1) + "호차 : " + train[i]);
		}
		System.out.println("------------------------");
		System.out.println("1.탑승 2.이동 3.상태 9.종료");
	}
}
