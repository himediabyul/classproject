package chapter09.exam;

public class Person {

	String name;
	String personNumber;
	
	public Person(String name, String personNumber) {

		this.name = name;
		this.personNumber = personNumber;
	}

	// 1. 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다.

	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		//매개변수로 전달받은 객체와 비교 : 주민번호
		if(obj != null && obj instanceof Person) {
			//object -> Person
			Person person = (Person)obj;
			result = this.personNumber.equals(person.personNumber);
		}
		
			return result;
	}

	public static void main(String[] args) {

	Person p1 = new Person("son", "000000-1100000");
	Person p2 = new Person("park", "000000-1100000");
	Person p3 = new Person("son", "111111-1542874");
	
	System.out.println("p1과 p2는 같은 사람인가? " + p1.equals(p2));
	System.out.println("p1과 p3는 같은 사람인가? " + p1.equals(p3));
		
	
	// 2. 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다.

	long startTime = System.currentTimeMillis();
	long sTime = System.nanoTime();

	for(int i = 1; i<=100000000; i++){
		int n1 = i;
		int n2 = i++;
		int sum = n1 + n2;
					
		long endTime = System.currentTimeMillis();
		long eTime = System.nanoTime();
		System.out.println(endTime);
		System.out.println(eTime);
		long checkTime = endTime - startTime;

		System.out.println("연산 실행 시간 : " + checkTime);
		
		break;
	

		
//		4. 자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다.
}
	
	}
	
}
	
