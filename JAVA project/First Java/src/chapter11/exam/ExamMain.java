package chapter11.exam;

import java.util.ArrayList;
import java.util.List;

public class ExamMain {
	
//	1. 축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
	
	public static void main(String[] args) {
		
		List<FootballPlayer> player = new ArrayList<>();
		
		FootballPlayer list = new FootballPlayer("이동국", 1, "전북FC", 40);
		player.add(list);		
		player.add(new FootballPlayer("박지성", 40, "토트넘" , 35));
		player.add(new FootballPlayer("손흥민", 18, "맨유", 29));
		player.add(new FootballPlayer("이강인", 33, "서울FC",30));
		

		for(FootballPlayer p : player) {
			System.out.println(p);
		}
				
	}
}
