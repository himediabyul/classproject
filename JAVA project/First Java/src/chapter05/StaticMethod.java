package chapter05;

public class StaticMethod {
	
	static int num1 = 10; //클래스 변수
	int num2;//인스턴스 변수
	
	static void staticMethod() {
		System.out.println("staticMethod");
		//System.out.println(num2); 인스턴스 생성 없이는 불가
		// 클래스 멤베어 인스턴스 멤버는 사용 불가
		StaticMethod sm = new StaticMethod();
		
		sm.instanceMethod();
		
	}
	
	void instanceMethod() {
		System.out.println("instanceMethod");
		System.out.println(num1);
		staticMethod();
	}

}
