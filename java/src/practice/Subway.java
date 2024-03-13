//package practice;
//
//public class Subway {
//
//	public static void main(String[] args) {
//		while (true) {
//			System.out.println("1.1호차 2.2호차 3.3호차 4.4호차");
//			System.out.print("몇 호차에 탑승하시겠습니까? >> ");
//
//			if (train[b] == "") { // 1호차가 인덱스로는 0이기 때문
//				while (true) {
//					System.out.println("------------------------");
//					System.out.println("목적지를 선택해주세요");
//					for (int i = 0; i < stnt.length; i++) {
//						System.out.print((i + 1) + "." + stnt[i] + " ");
//					}
//					System.out.println();
//
//					dest_temp = Integer.parseInt(sc.nextLine());
//					if (dest_temp >= 1 && dest_temp <= 5) {
//						break;
//					} else
//						System.out.println("!!!!잘못 입력하였습니다!!!!");
//				}
//
//				String desPassenger = "";
//				switch (dest_temp) {
//				case 1:
//					desPassenger = "구로디지털단지역";
//					break;
//				case 2:
//					desPassenger = "신대방역";
//					break;
//				case 3:
//					desPassenger = "신림역";
//					break;
//				case 4:
//					desPassenger = "봉천역";
//					break;
//				case 5:
//					desPassenger = "서울대입구역";
//					break;
//				}
//				// passengerList[칸 index] = 탑승여부
//				// passengerList[enter-1]="O";
//				passengerList[enter - 1] = desPassenger;
//
//				System.out.println("<<" + enter + "호차 탑승 완료>>\n");
//				System.out.println("---------------------");
//				System.out.println("1호차 : " + passengerList[0]);
//				System.out.println("2호차 : " + passengerList[1]);
//				System.out.println("3호차 : " + passengerList[2]);
//				System.out.println("4호차 : " + passengerList[3]);
//				System.out.println("---------------------");
//				break;
//			} else {
//				System.out.println("!!!!해당 칸에는 승객이 이미 탑승되어있습니다!!!!");
//			}
//		}
//	}
//
//}
//
////
////if (b >= 0 && b < 4) {
////	train[b] = hope;
////	System.out.println("탑승");
////} else {
////	System.out.println("다음열차를 이용해 주세요.");
////}
