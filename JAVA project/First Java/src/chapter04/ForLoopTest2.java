package chapter04;

public class ForLoopTest2 {

	public static void main(String[] args) {
		
		//2단 
		//2*1=2
		//2*2=4
		//...
		//2*9=18
		//3*1=3
		//3*2=6
		//...
		//3*9=27
		//...
		//9*1=9
		//9*2=18
		//...
		//9*9=81		
		
		
		//단의반복 : 2~9
		for(int i=2; i<=9 ; i++) {
			System.out.println(i + "단");
			System.out.println("----------------");
			for(int e=1 ; e<=9 ; e++) {
				System.out.println(i + " X " + e + " = " + i*e);
			}
			System.out.println("----------------");
		}
		
		
		
//		for(int i=1 ; i<=9 ; i++) {
//			System.out.println("2 X "+i + " = " + 2*i);
			
//		}
		
		
	}
}
