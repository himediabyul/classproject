package chapter07.exam;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Male m = new Male("Ha", "940322-1111111", "구름");
		Female f = new Female("Lee", "930213-2222222", "무역", 4);
		
		m.printInfo();
		m.hi();
		
		System.out.println();
		
		f.printInfo();
		
		System.out.println();
		System.out.println();
		
		f.printSchoolInfo();
		
		Person p1 = m;
		Person p2 = f;
		
		// p1.hi(); => hi() 는 Person 클래스의 멤버가 아니기때문에 호출 불가
		// p2.printSchoolInfo();  => printSchoolInfo 도 Person 클래스의 멤버가 아님
		
		System.out.println();
		p2.printInfo();
		
	}

}
