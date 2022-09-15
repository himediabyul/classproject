package chapter03;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		/*① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
          ② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
          ③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
		  ④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
		  ⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
		  ⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
			원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
		  ⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
	      ⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드
			에 추가해봅시다.
		 */
	
	
	Scanner in = new Scanner(System.in);
	
	
	System.out.println("숫자를 입력해주세요>> ");
	int num1 = in.nextInt();
		
	System.out.println("숫자를 입력해주세요>> ");
	int num2 = in.nextInt();

	
	int add = num1 + num2;
	int substract = num1 - num2;
	long multifly = num1 * num2;
	double devide = num1 / num2;
    

	System.out.println("더하기 값 = " + add);
	System.out.println("빼기 값 = " + substract);
	System.out.println("곱하기 값 = "+ multifly);
	System.out.println("나눈 값 = " + devide);
	
	System.out.println();
	
	System.out.println("원의반지름을 입력해주세요>> ");
	double rad = in.nextDouble();
	
	System.out.println("원의 둘레 = " + circle(rad));
	
	System.out.println("원의 넓이 = " + area(rad));
	
	
	
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;

		
	}
	public static int substract(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}


	public static long multifly(long num1, long num2) {
		long result = num1 * num2;
		return result;
	
	}
	public static double devide(double num1, double num2) {
		double result = num1 / num2;
		return result;
	
	}
	public static double circle(double r) {
		double result = r*3.14*2;
		return result;
		
	}
	public static double area(double r) {
		double result = r*r*3.14;
		return result;
		
	}
}

