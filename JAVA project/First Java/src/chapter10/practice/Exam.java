package chapter10.practice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam {
	
	public static void main(String[] args) {
		
	
//	1. 콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다. 
//	① 사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.
//	② 예외 클래스 이름은 BadIdInputException이라고 정의합시다.
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("아이디를 입력해주세요 >> ");
	String userID = sc.nextLine();
	
	boolean checkID = Pattern.matches("^[a-zA-Z0-9]*$",userID);
	
	try {
		if(!checkID) {
			throw new Exception();
		}
	} catch (Exception BadIdInputException) {
		System.out.println("아이디는 영문자와 숫자만 입력가능합니다.");
	}
	
	
	
//	2. Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
//	이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.

	System.out.print("태어난 년도를 입력해주세요 >> ");

	try {
		int birthYear = sc.nextInt();
		System.out.println("출생년도 : " + birthYear);
		
	} catch (InputMismatchException e) {
		System.out.println("정상적인 년도를 입력해주세요");
	}
	
	}


}
