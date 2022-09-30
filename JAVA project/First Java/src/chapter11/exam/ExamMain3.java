package chapter11.exam;

import java.util.TreeSet;

public class ExamMain3 {
	
	public static void main(String[] args) {
		
//		3. TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 같은 이름의 선수는 번호 순으로 저장하는 프로
//		그램을 만들어 봅시다. 
		
		
		TreeSet<FootballPlayer> player = new TreeSet<FootballPlayer>();
		
		FootballPlayer list = new FootballPlayer("이동국", 1, "전북FC", 40);
		player.add(list);		
		player.add(new FootballPlayer("박지성", 40, "토트넘" , 35));
		player.add(new FootballPlayer("손흥민", 18, "맨유", 29));
		player.add(new FootballPlayer("이강인", 33, "토트넘",30));
		
		System.out.println("==== 보유 선수 리스트 =====");
		
		for(FootballPlayer p : player) {
			System.out.println(p);
		}
		
	}
}
