package chapter06;

public class ArrayTest1 {

	
	public static void main(String[] args) {
		
		// 10명의 국어점수를 저장하는 배열 선언하고 생성
		int[] korScore = new int[10];
		

		//배열 요소의 초기화
		korScore[0] = 93;
		korScore[1] = 50;
		korScore[2] = 90;
		korScore[3] = 41;
		korScore[4] = 70;
		korScore[5] = 92;
		korScore[6] = 90;
		korScore[7] = 85;
		korScore[8] = 90;
		korScore[9] = 30;
		
		System.out.println();
		sum(korScore);
	}
	public static void sum(int[]arr) {
		
		// arr => korScores 의 배열인스턴스 주소
		
		int sum = 0;
		
		// sum = korScore[0]+korScore[1]+...+korScore[9]
		for(int i=0; i<arr.length ; i++) {
			sum += arr[i];
			
		}
		System.out.println("총점 : " + sum);
		System.out.println("반 평균 : " + (float)sum/arr.length);
	}
	
}
