package chapter07.exam;

public class Male extends Person {

	
//	 ① Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.
//	 ② 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//	 ③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.


	
	String email;
	

	public Male(String name, String psNumber, String email) {
	super(name, psNumber);
	this.email = email;
}
	

	@Override
	void hello() {

		super.hello();
		System.out.println("제 이메일은 " + this.email + " 입니다.");
}


}
