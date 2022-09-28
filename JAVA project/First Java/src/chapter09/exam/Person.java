package chapter09.exam;

import java.util.Scanner;

public class Person {

	String name;
	String personNumber;
	
	

	// 1. 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다.

	@Override
	public boolean equals(Object personNumber) {

		return super.equals(personNumber);
	}

	public static void main(String[] args) {

	

	// 2. 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다.

	long startTime = System.currentTimeMillis();
	long sTime = System.nanoTime();

	for(int i = 1; i<100000000; i++){
		int n1 = i;
		int n2 = i++;
		int sum = n1 + n2;

		long endTime = System.currentTimeMillis();
		long eTime = System.nanoTime();
		System.out.println(endTime);
		System.out.println(eTime);
		long checkTime = endTime - startTime;

		System.out.println("연산 실행 시간 : " + checkTime);
	
	// 3. 사용자에게 이름을 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고, 공백으로 입력되었는지도 판별하는
	// 프로그램을 만들어봅시다.
	Scanner sc = new Scanner(System.in);
	
	System.out.println("이름을 입력해주세요 >> ");
	String name = sc.nextLine();
	
	
	
	}
}
	}

//4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다.
