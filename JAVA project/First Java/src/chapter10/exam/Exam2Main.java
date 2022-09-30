package chapter10.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요>> ");
		
		int num = 0;
		
		try {
			num= sc.nextInt(); // <= 예외처리 포인트
			System.out.println("num = " + num); // 예외처리 전 정상적인 숫자 출력시점
		} catch (InputMismatchException	e) { //예외발생 경우 
			System.out.println("예외발생");
			System.out.println("정상적인 숫자를 입력해주세요.");
		}

		
		
		
		
	}
	

}
