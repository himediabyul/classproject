package chapter05.overload;


//클래스는 인스턴스를 생성하기위한 설계도 역할을 한다.
//클래스에서 정의한 변수, 메소드는 바로 사용이 불가하다.
//클래스로 인스턴스를 만들어서 사용한다.
//클래스 정의는 클래스 키워드를 사용해서 정의한다.
public class SmartPhone {
	
	//클래스는 변수와 메소드로 구성한다.
	//생성자 : 필수이지만 생략 가능
	
	//클래스의 멤버 : 변수, 메소드
	//클래스 내부에 정의된 변수 : 멤버 변수, 인스턴스 변수
	//클래스 내부에 정의된 메소드 : 멤버 메소드, 인스턴스 메소드
	
	//스마트폰의 속성 : 컬러, 사이즈, 제조사, 볼륨사이즈
	// 속성 => 변수
	String color; //인스턴스 변수, 초기화 생략 가능 => 인스턴스 생성시에 초기값으로 할당
	float size;
	String company;
	int volumeSize;  //초기값 0
	
	
	//생성자 : 인스턴스 생성시에 단 한번 실행하는 초기화 메소드
	//클래스이름 (매개변수들){
	//초기화 코드작성
	//}
	SmartPhone(){
		//매개변수 없고, 처리 내용이 없는 생성자=> 기본생성, 생략가능
	}
	
	//생성자의 오버로딩 : 같은 이름의 생성자 정의
	
	SmartPhone(String color, float size, String company, int volumeSize){
		// 인스턴스를 생성하면 this 참조변수도 생성
		// this는 현재 인스턴스 자신의 주소값을 가지는 변수
			this.color = color;
			this.size = size;
			this.company = company;
			this.volumeSize = volumeSize;
			
	}
	
	SmartPhone(String company, float size){
//		this.company = company;
//		this.size = size;
//		this.color = "Black";
//		this.volumeSize = 10;
		this("black", size, company, 10);
	}
	SmartPhone(String company){
		this.company = company;
		this.size = 5.3f;
		this.color = "Green";
		this.volumeSize = 2;
	}
	
	
	
	
	
	
	//전화걸기
	void call() {
		System.out.println("전화걸기");
	}
	
	//볼륨키우기
	void volumeUp() {
		System.out.println("볼륨을 키웁니다.");
		volumeSize++;
	}
	//볼륨줄이기
	void volumeDown() {
		System.out.println("볼륨을 낮춥니다.");
		volumeSize--;
	}
	//속성값 출력
	void showInfo() {
		//String color="";
		System.out.println("폰정보");
		System.out.println("제조사 : " + company);
		System.out.println("색상 : "+ this.color); //인스턴스의 멤버를 가르키는 키워드 this. 메소드의 color와 구분하기위해
		System.out.println("사이즈 : " + size);
	}
	
	
	}
