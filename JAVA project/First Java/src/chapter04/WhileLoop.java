package chapter04;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		
		int cnt = 0;
		
		// 무한 반복을 이용해서 5번 출력
		while(true) { //무조건 무한반복
			System.out.println("JAVA");
			
			if(++cnt>4) {
				break;
			}
			
		}
		
		
		//짝수 이면서 : num%2 == 0
		//7의 배수인 수 : num%7 == 0
		
		int num = 1; // 0은 안됨!
		
		while(true) {

			if(num%2==0 && num%7==0) {
				System.out.println("짝수이면서 7의배수인 0과 가장 가까운 수 : " + num);  // 1이 나오니 결과값이 아님
				break;
			}else {
				num++; //1+1+1+...하다가 결과값이 나오면 break!
			}
		}
		
	
		}
		
		
		
	}


