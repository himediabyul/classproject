package chapter07.exam;

public class Female extends Person {
	
// 	① Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다.
//	 ② 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//	 ③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.

	String address;


public Female(String name, String psNumber, String address) {
	super(name, psNumber);
	this.address = address;
}


@Override
void hello() {
	super.hello();
	
	System.out.println("주소지는 " + this.address + "입니다.");
}
	

}
