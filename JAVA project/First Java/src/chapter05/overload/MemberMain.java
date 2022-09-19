package chapter05.overload;

public class MemberMain {
	
	public static void main(String[] args) {
		
		Member mb1 = new Member("이샛별", "010-****-****", "Trade", "졸업", "himedia.byul@gmail.com", 930213, "***");
		mb1.showInfo();
		
		System.out.println();
		
		Member mb2 = new Member("이샛별", "010-****-****", "Trade", "졸업", "himedia.byul@gmail.com");
		mb2.showInfo();
		
		System.out.println();
		
		Member mb3 = new Member("이예진", "010-****-****", "Trade", "졸업", "himedia.byul@gmail.com");
		mb3.showInfo();
	}

}
