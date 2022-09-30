package chapter11.exam;

import java.util.HashMap;
import java.util.Map;

public class ExamMain4 {

//	4. 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다.
	
	public static void main(String[] args) {
		
		Map<Integer, FootballPlayer> player = new HashMap<>();
		
		//저장 : put
		player.put(1, new FootballPlayer("이동국", 1, "전북FC", 40));
		player.put(1, new FootballPlayer("이동국", 1, "전북FC", 30));

//		System.out.println(player.get(1));
		
		FootballPlayer list = player.get(1);
	
	}
}
