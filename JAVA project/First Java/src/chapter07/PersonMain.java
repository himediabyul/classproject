package chapter07.exam;

public class PersonMain {
	
	public static void main(String[] args) {
//		main()메소드를 정의해봅시다. 
//		① Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.
//		② 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다
		
		Male m = new Male("하성운", "940322-1111111", "cloud@gmail.com");
		Female f = new Female("안유진", "030901-4444444", "서울시 강남구");
	
		m.hello();
		f.hello();
		
	}

}
