package chapter07.exam;

import java.time.LocalDate;
import java.util.Calendar;

public class Person {
	
//	Person 이라는 클래스를 정의해봅시다. 
//	① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
//	② 인사하는 메소드를 정의해봅시다.
//	- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
	
	String name;
	String personNumber;
	
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}
	
	//나이를 반환하는 메소드  주민번호는 멤버변수인 personNumber값을 이용해서 처리
	int getAge() {
		
		// 반환하는 나이값
		int result =0;
		
		//나이를 계산해서 반환하는 연산
		// 001212-1111111
		// 990203-2222222
		// 0123456789.... 문자열의 index -> 문자들의 위치값
		String tempYear = personNumber.substring(0, 2) ; // "00", "99" 를 뽑기위한 변수
		String tempGender = personNumber.substring(7, 8);  // 1,2,3,4

		// 891212-1111111
		// 010203-3222222
		// 1||2 => 1900 + 89
		// 3||4 => 2000 + 01 
		
		// Integer.parseInt("문자열") => int 정수 반환
		
		// 나이구하기 : 올해년도 - 출생년도
		// int currYear = Calendar.getInstance().get(Calendar.YEAR);
		// Date -> LocalDate, LocalDatetime, LocalTime 
		
		int curYear = LocalDate.now().getYear();  //현재년도
		
		int birthYear = Integer.parseInt(tempYear);
		int genderVal = Integer.parseInt(tempGender);
		
		
		if(genderVal == 1 || genderVal == 2) {
			result = curYear - (1900 + birthYear);
			}else if(genderVal == 3 || genderVal == 4) {
				result = curYear - (2000 + birthYear);
			}
		
	
		return result;
	}
	
	
	void printInfo() {
		
		System.out.printf("안녕하세요. 저는 %s 입니다. %d 살 입니다.", this.name, getAge());
		
		int curYear = LocalDate.now().getYear();
		
		Person p = new Person("lee", "001111-4444444");
		p.printInfo();
		
		
	}


}
