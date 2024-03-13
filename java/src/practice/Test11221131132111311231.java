package practice;

public class Test11221131132111311231 {

	public static void main(String[] args) {

//		1		
//		11				
//		12				
//		1121				
//		122111		
//		112213		
//		12221131
//		1123123111
//		12213111213113
//		11221131132111311231

		String number = "1"; // "122111"
		System.out.println(number);

		for (int row = 1; row < 10; row++) {
			String result = "";
			int cnt = 1;
			char target = number.charAt(0); // target = 1

			result = result + target; // result = "" + 1 = "1"

			for (int i = 1; i < number.length(); i++) { // i = 4
				if (number.charAt(i) == target) { // 1 == 1 true;
					cnt++; // cnt = 3
				} else {
					result = result + cnt; // result "112" = "112" + 2 = "1122"
					target = number.charAt(i); // target = 1
					result = result + target; // result "1122" + 1 = "11221"
					cnt = 1;
				}

			}

			result = result + cnt; // "112213"
			number = result;
			System.out.println(result);
		}

	}

}
