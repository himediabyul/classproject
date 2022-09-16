package chapter04;

public class WhileLoop2 {
	
	public static void main(String[] args) {
		
		//5번 "JAVA"를 출력하는 코드 작성
		//5번 출력문 실행
		
		//System.out.println("JAVA");
		//System.out.println("JAVA");
		//System.out.println("JAVA");
		//System.out.println("JAVA");
		//System.out.println("JAVA");
		/*
		 반복 체크할 변수
		 while(반복의 조건: 변수 체크){
		 반복 해야할 코드
		 변수 증감 연산식
		 
		 }
		 */
		
		int count = 0; // 0 1 2 3 4 까지 다섯번 5 부터는 여섯번
		
		while(count++<5) { //0
			System.out.println("JAVA");
			
			// 반복문을 끝낼 수 있는 증감 식이 필요
			// count = count +1;
			// count += 1;
			// count++;
			// ++count;
	
		}
		
		
		
	}

}
