package chapter09.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.regex.Pattern;

import chapter09.LocalDateTest;

public class Person {
	
	String name;
	String personNumber;
	
	
	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}

//	1. 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다. 
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
							//형변환 가능한지 판별
		if(obj != null && obj instanceof Person) {
		Person person = (Person) obj;
		
		result = this.personNumber.equals(person.personNumber);
		
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("안","000116-3456789");
		Person p2 = new Person("유진","000116-3456789");
		Person p3 = new Person("장원영","011105-3678412");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		
		
	


//	2. 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다.
	
	long startTime = System.currentTimeMillis();

	int sum = 0;
	
	for(int i=1; i<=100000000; i++) {
		sum += i;
	}
	long endTime = System.currentTimeMillis();
	
	System.out.println("1~100,000,000 연산의 값 : " + sum);
	
	System.out.println("연산의 실행 시간 : " + (startTime-endTime));
	
	
	
//	3. 사용자에게 이름을 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고, 공백으로 입력되었는지도 판별하는 
//	프로그램을 만들어봅시다.

	Scanner sc = new Scanner(System.in);
	
	System.out.print("이름을 입력해주세요 >> ");
	String name = sc.nextLine();

	if(name.trim().isEmpty()) {
		System.out.println("공백은 허용하지 않습니다.");
	}else {
		boolean checkName = Pattern.matches("^[a-zA-Z가-힣]*$",name);
		try {
			if(checkName) {
				System.out.println("이름 : " + name);
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("이름은 영소문자,영대문자, 한글만 입력가능합니다.");
			}
		}
	
//	4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다.
	
	LocalDate birthday = LocalDate.of(1993, 02, 13);
	LocalDate now = LocalDate.now();
	
	long days = ChronoUnit.DAYS.between(now, birthday);
	System.out.println("내가 살아온 일 수" + days);
	
//	LocalDate birthDay = now.minusDays(10825);
//	System.out.println(birthDay);
	
	}
	
}
