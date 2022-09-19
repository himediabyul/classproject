package chapter05.overload;

public class Member {
	
	String name;
	String number;
	String major;
	String grade;
	String email;
	int birthDay;
	String address;
	
	
	Member(){
		
	}


	Member(String name, String number, String major, String grade, String email, int birthDay, String address){
	
	this.name=name;
	this.number = number;
	this.major = major;
	this.grade = grade;
	this.email = email;
	this.birthDay = birthDay;
	this.address = address;
	}
	
	Member(String name, String number, String major, String grade, String email){
		
		this.name=name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.email = email;
	}
	
	void showInfo(){
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + number );
		System.out.println("전공 : " + major );
		System.out.println("학년 : " + grade );
		System.out.println("email : " + email );
		System.out.println("생일 : " + birthDay );
		System.out.println("주소 : " + address );
		
	}

		
}