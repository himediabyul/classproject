package chapter09;

import java.util.Objects;

public class Car extends Object {
	
	String name;
	
	Car(String name){
		this.name = name;
	}
	

//	@Override
//	public String toString() {
//		return name;
//	}

	
	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}


//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}


	@Override
	public boolean equals(Object obj) {
	
		boolean result = false;
		
		if(obj != null && obj instanceof Car) {
			Car car = (Car)obj;  //obj를 Car 타입으로 형변환, Object는 name을 가지고있지않음
			result = this.name.equals(car.name);
			}
		
		return result;
	}


	public static void main(String[] args) {
		
		Car car1 = new Car("GV80");
		Car car2 = new Car("GV80");
		
		System.out.println(car1);  //Object 클래스의 toString() 메서드가 풀네임@해시코드16진수로 나오게 정의
//		System.out.println(car1.hashCode());
		System.out.println(car2);
		
		System.out.println("car1 == car2 => " + (car1 == car2));
		System.out.println("car1.equals(car2) => " + car1.equals(car2));
		
		//Object 클래스의 equals() 메소드는 참조값 비교하고 결과를 반환하도록 정의
		
		if(car1.equals(car2)) {
			System.out.println("같은 차종 입니다.");
		}else {
			System.out.println("다른 차종 입니다.");
		}

	}
}
