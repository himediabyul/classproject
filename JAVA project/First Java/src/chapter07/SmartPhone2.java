package chapter07;

public class SmartPhone2 extends Phone { //상속
	
	String model;
	
	SmartPhone2(String phoneNumber, String model){ 
		super(phoneNumber); //상위클래스의 변수
		this.model = model;  //초기화
				
	}
	//오버라이딩
	//상위 클래스에서 정의한 메소드를 재 정의
	//선언부는 동일하게 정의하고 처리블록 내부의 코드만 재 정의
	
	@Override
	void call() { //선언부는 동일하게, public은 가능하지만 private은 불가
		super.call();
		System.out.println("이어팟을 이용해서 통화합니다.");
		//System.out.println("하위 클래스에서 재정의");
		
	}
	
	public static void main(String[] args) {
		SmartPhone2 phone2 = new SmartPhone2("010-3333-4555","삼성");
		
		//call 호출
		phone2.call();
		
	}
}
