package chapter11;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, SmartPhone> hashMap = new HashMap<>();
		
		hashMap.put("SUMMER", new SmartPhone("SUMMER","010-1111-7777"));
		hashMap.put("LOVE", new SmartPhone("LOVE","010-4444-7777"));
		hashMap.put("Friend", new SmartPhone("Friend","010-1234-7777"));
		
		System.out.println(hashMap.get("LOVE"));
		System.out.println(hashMap.get("FRIEND")); //null
		System.out.println(hashMap.get("SUMMER"));
		
		System.out.println("--------------");
		
		hashMap.put("SUMMER", new SmartPhone("SUMMER","010-3456-7777"));
		System.out.println(hashMap.get("SUMMER")); //데이터값 덮어씀
		
		System.out.println("--------------");
		//키 값들을 Set 객체로 받는다.
		Set<String> keySet = hashMap.keySet();
		
		for(String key : keySet) {
			System.out.println(key + " = " + hashMap.get(key));
		}
	}
}
