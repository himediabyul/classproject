package chapter11;

import java.util.HashSet;

public class SmartPhoneTreeSetTest {
	
	public static void main(String[] args) {
		
		HashSet<SmartPhone> set = new HashSet<>();
		
		set.add(new SmartPhone("test1", "010-1111-1111"));
		set.add(new SmartPhone("test1", "010-4566-9988"));
		set.add(new SmartPhone("test1", "010-0000-0000"));
		set.add(new SmartPhone("test1", "010-4566-9988"));
		set.add(new SmartPhone("test1", "010-4566-9988"));
		set.add(new SmartPhone("test1", "010-1111-1111"));
		
		System.out.println("요소의 개수 : " + set.size());
		
		for(SmartPhone sp : set) {
			System.out.println(sp);
		}
	}

}
