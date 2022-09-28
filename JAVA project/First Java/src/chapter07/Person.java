package chapter07.exam;

import java.time.LocalDate;

public abstract class Person {

//	Person 이라는 클래스를 정의해봅시다. 
//	① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
	String name;
	String psNumber;

//	 ④ Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
	public Person(String name, String psNumber) {
		this.name = name;
		this.psNumber = psNumber;
	}
	
	int getAge() {
		
		int result = 0;
		
		
		String tempYear = psNumber.substring(0, 2); // "00", "99"
		String tempGender = psNumber.substring(7, 8);	// 1, 2, 3, 4
		
	
		int curYear = LocalDate.now().getYear();  
		
		int birthYear = Integer.parseInt(tempYear);
		int genderVal = Integer.parseInt(tempGender);	
		
		if(genderVal == 1 || genderVal == 2) {
			result = curYear - (1900 + birthYear) +1;
		}else if(genderVal == 3 || genderVal == 4) {
			result = curYear - (2000 + birthYear) +1;
		}
		
		return result;
	}

	
//② 인사하는 메소드를 정의해봅시다.
//- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
	void hello() {

		System.out.printf("안녕하세요. 저는 %s입니다. %d살 입니다.", this.name, getAge());
	}

}
