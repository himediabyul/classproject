package chapter11;

import java.util.TreeSet;

public class SmartPhoneSetTest {
	
	public static void main(String[] args) {
		
		TreeSet<SmartPhone> set = new TreeSet<>();
		
		set.add(new SmartPhone("JAVA", "010-1111-1111"));
		set.add(new SmartPhone("HA", "010-4566-9988"));
		set.add(new SmartPhone("SUMMER", "010-0000-0000"));
		set.add(new SmartPhone("VENUS", "010-4586-9988"));
		set.add(new SmartPhone("LOVE", "010-4576-9988"));
		set.add(new SmartPhone("FRIEND", "010-1361-1111"));
		
		System.out.println("요소의 개수 : " + set.size());
		
		for(SmartPhone sp : set) {
			System.out.println(sp);
		}
	}

}
