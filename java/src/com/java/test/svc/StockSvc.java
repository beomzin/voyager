package com.java.test.svc;

import java.util.Scanner;

public class StockSvc {
	int d = 1;
	int bank = 500;
	String[] comp = { "삼성", "카카오", "넷플릭스" };
	float[] price = { 100, 80, 150 };
	float[] p = new float[3];
	int[] cnt = { 0, 0, 0 };

//	int tt = 0; // 총 평가금액

	Scanner sc = new Scanner(System.in);

	public void run() {

		System.out.println("===========STOCKK===========");

		boolean runFlag = true;
		while (runFlag) {
			System.out.println("----------------------------");
			show();
			switch (sc.nextLine()) {
			case "1":
				buy();
				break;
			case "2":
				sell();
				break;
			case "3":
				date();
				break;
			case "4":
				detail();
				break;
			case "9":
				System.out.println("!!!!!!!!!!!! 종료 !!!!!!!!!!!");
				runFlag = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

	public void per() {
		for (int i = 0; i < p.length; i++) {
			float pp = ((float) (Math.floor(Math.random() * 101) - 50) / 10);
			p[i] = pp;
		}
	}

	public void price() {
		price[0] += (price[0] / 100) * p[0];
		price[1] += (price[1] / 100) * p[1];
		price[2] += (price[2] / 100) * p[2];
	}

	public void buy() {
		System.out.println("------------ 매수 -----------");
		System.out.println("1.삼성 2.카카오 3.넷플릭스");
		moneyB();
	}

	public void sell() {
		System.out.println("------------ 매도 -----------");
		System.out.println("1.삼성 2.카카오 3.넷플릭스");
		moneyS();
	}

	public void moneyB() {
		int c = 1;
		switch (sc.nextLine()) {
		case "1":
			if (bank >= price[0]) {
				bank -= price[0] + (price[0] / 100);
				cnt[0] += c;
//				tt += price[0];
			} else {
				System.out.println("출금 가능금액이 부족합니다.");
			}
			break;
		case "2":
			if (bank >= price[1]) {
				bank -= price[1] + (price[1] / 100);
				cnt[1] += c;
//				tt += price[1];
			} else {
				System.out.println("출금 가능금액이 부족합니다.");
			}
			break;
		case "3":
			if (bank >= price[2]) {
				bank -= price[2] + (price[2] / 100);
				cnt[2] += c;
//				tt += price[2];
			} else {
				System.out.println("출금 가능금액이 부족합니다.");
			}
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void moneyS() {
		int c = 1;
		switch (sc.nextLine()) {
		case "1":
			if (cnt[0] > 0) {
				bank += price[0] - (price[0] / 100) * 4;
				cnt[0] -= c;
//				tt -= price[0];
			} else {
				System.out.println("선택한 종목의 주식을 보유하고 있지 않습니다.");
			}
			break;
		case "2":
			if (cnt[1] > 0) {
				bank += price[1] - (price[1] / 100) * 4;
				cnt[1] -= c;
//				tt -= price[1];
			} else {
				System.out.println("선택한 종목의 주식을 보유하고 있지 않습니다.");
			}
			break;
		case "3":
			if (cnt[2] > 0) {
				bank += price[2] - (price[2] / 100) * 4;
				cnt[2] -= c;
//				tt -= price[2];
			} else {
				System.out.println("선택한 종목의 주식을 보유하고 있지 않습니다.");
			}
			break;

		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void date() {
		d++;
		per();
		price();
	}

	public void detail() {
		System.out.println("---------- 보유현황 ----------");
		for (int i = 0; i < comp.length; i++) {
			System.out.println(comp[i] + " : " + cnt[i]);
		}
	}

	public void show() {
		System.out.println(d + "일차");
		System.out.println("----------------------------");
		System.out.println("출금 가능금액 : " + bank + "원");
//		System.out.println("총 평가금액 : " + tt + "원");
		System.out.println("----------------------------");
		System.out.println("번호\t종목명\t시세\t등락률");
		for (int i = 0; i < comp.length; i++) {
			System.out.println((i + 1) + "\t" + comp[i] + "\t" + Math.round(price[i]) + "\t" + p[i] + "%");
		}
		System.out.println("----------------------------");
		System.out.println("1.매수 2.매도 3.장마감 4.보유현황\t9.종료");
	}

}
