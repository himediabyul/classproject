package chapter06.exam;

public class Exam1 {
	
	public static void main(String[] args) {
		
		// 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고
		int[][] scores = new int[10][3];
		
		for(int i=0; i < scores.length; i++) {
			for (int j=0; j < scores[i].length; j++) {
				//System.out.print(scores[i][j]);
				int num = (int)(Math.random()*51) +50;  //0+50 <= num <= 50+50
				scores[i][j]=num;
				
				}
		}
		// 점수를 모두 출력하고, 
		System.out.println("성적표");
		System.out.println("-----------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------");
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		
		for(int i=0; i < scores.length; i++) {
			
			int sum=0; //평균구하기위한 sum초기화
			
			//점수구하기 			
			for (int j=0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				sum += scores[i][j]; //총점구하기
				// 국어 점수일떄
				if(j==0) {
					korTotal += scores[i][j];
				}
				
				// 영어 점수일떄
				if(j==1) {
					engTotal += scores[i][j];
				}
				
				// 수학 점수일떄
				if(j==2) {
					mathTotal += scores[i][j];
				}
			}
			// 평균 점수를 출력하는 프로그램을 작성해봅시다. 
			System.out.print(sum + "\t" + (float)sum/scores[i].length);//총점,평균구하기
			
			System.out.println();
		}	
		System.out.println("-----------------------------------------");
		System.out.print(korTotal + "\t" + engTotal + "\t" + mathTotal);
		System.out.println();
		System.out.print(
						(float)korTotal/scores.length + "\t" 
						+ (float)engTotal/scores.length + "\t" 
						+ (float)mathTotal/scores.length);

	}			
			
			
}
