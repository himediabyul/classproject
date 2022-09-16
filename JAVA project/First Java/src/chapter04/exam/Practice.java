package chapter04.exam;

import java.util.Calendar;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while (true) {

			System.out.println("출생년도를 입력해주세요.(0을 입력하면 종료됩니다.)>>> ");
			int year = in.nextInt();

			if (year == 0) {
				return;
			}

			Vaccine(year);
			Medical(year);

		}

	}
	// 독감예방 접종이 가능한지 여부를 확인하는 메소드를 정의합니다.
	// 매개변수로 태어난 해(년도)를 전달받습니다.
	// 15세 미만의 경우와 65세 이상의 경우 “무료예방접종이 가능합니다.” 메시지가 콘솔에 출력하도록 합니다.
	// 위에서 정의한 조건의 범위가 아닌 나머지의 경우 “무료접종 대상이 아닙니다.”라고 출력하도록 합니다.

	public static void Vaccine(int birthYear) {

		int currYear = Calendar.getInstance().get(Calendar.YEAR);
		int age = currYear - birthYear + 1;
		if (age < 15 || age >= 65) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료접종 대상이 아닙니다.");
		}

	}

	/*
	 * 건강검진 대상 여부를 판별하고 어떤 검진이 가능한지 확인하는 메소드를 정의합니다. - 매개변수로 태어난 해(년도)를 전달받습니다. -
	 * 대한민국 성인( 20세 )의 경우 무료로 - 2년마다 건강검진을 받을 수 있습니다. - 짝수 해에 태어난 사람은 올해가 짝수년이라면 검사
	 * 대상이 됩니다. : 태어난해의 %2의 결과 값과 올해 년의 %2 한 값이 일치한다 - 40 이상의 경우는 암 검사도 무료로 검사를 할 수
	 * 있습니다. : if 중첩
	 */
	public static void Medical(int birthYear) {
		int currYear = Calendar.getInstance().get(Calendar.YEAR);
		int age = currYear - birthYear + 1;
		if (age >= 20) {
		}
		if (currYear % 2 == birthYear % 2) {
			System.out.println("무료 검사 대상입니다.");
		}
		if (age >= 40) {
			System.out.println("암 검사 무료 대상입니다.");
		} else {
			System.out.println("무료 검사 대상이 아닙니다.");
		}

	}

}
