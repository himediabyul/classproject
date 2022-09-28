package chapter10;

import java.util.Scanner;

public class ExceptionTest {  //프로그램 흐름에서 논리적인 오류가 발생할수있음
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1을 입력하세요.>> ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자 2를 입력하세요.>> ");
		int num2 = sc.nextInt();
		
		
		if(num2==0) {
			System.out.println("0으로 나누는것은 불가합니다.");
		}
		System.out.println("num1/num2 =>" + (num1/num2));
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}
