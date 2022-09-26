package chapter06;

public class ArrayTest5 {

	public static void main(String[] args) {
		
		int[] numbers = {2, 6, 14, 90, 40};
		for(int num : numbers) {  //num은 각각의 요소를 받을 수 있는 변수
			System.out.print(num + "\t");
		}
	
		int[][] scores = {
				{100, 90, 40}, {40, 100, 90}, {52, 50, 68}
		};
		
		System.out.println();
		System.out.println();
		
		for(int[] temp : scores) { //1차원배열 temp 
			
			for(int num : temp) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
		
	}
}
