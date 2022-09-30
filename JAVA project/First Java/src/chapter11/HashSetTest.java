package chapter11;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetTest {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		//저장
		set.add("안유진");
		set.add("장원영");
		set.add("아이브");
		set.add("장원영");
		set.add("안유진");
	
		System.out.println("저장된 요소의 개수 : " + set.size());  //중복되는 건 출력안됨
		
		Iterator<String> itr = set.iterator();  
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
