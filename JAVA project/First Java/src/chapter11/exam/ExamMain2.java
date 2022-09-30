package chapter11.exam;

import java.util.HashSet;
import java.util.Set;

public class ExamMain2 {
	
	//Set<E> : 중복 허용 안함, 저장 순서도 유지 하지 않음
	//중복검사 : hashCode 검사 -> equals를 통해 중복 검사
	
//	Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다. 
	public static void main(String[] args) {
		
		Set<FootballPlayer> player = new HashSet<FootballPlayer>();
		
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