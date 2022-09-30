package chapter10.exam;

import java.util.regex.Pattern;

public class Exam1Main {
	
	public static void main(String[] args) {
		
		String str = "abc12ABC";
		boolean chk1 = Pattern.matches("^[a-z0-9A-Z]*$", str);  // ^ 패턴의 시작 // $ 패턴의 종료 //패턴과 종료사이에 *또는+해줘야함
		System.out.println(chk1);
		
		try {
				if(!chk1) {
					throw new Exception();
				}
		} catch (Exception e) {
			System.out.println("소문자, 대문자, 숫자 입력만 가능합니다.");
		}
		
		// 숫자만 -> ^[0-9]*$
		// 영문자만 -> ^[a-zA-Z]*$
		// 한글만 ->  ^[가-힣]*$ 
		// 영어+숫자 -> ^[a-z0-9A-Z]*$
		// 이메일: ^[a-zA-Z0-9]+@+[a-zA-Z0-9]\.+[a-zA-Z]+$  => qqq@naver.com
		// 전화번호:  ^\d{2,3} - \d{4} - \d{4}  //정수{자릿수}
		
		// ? : 앞의 문자가 하나이거나 없거나 
		// | : or
		// . 
		// \w : 알파벳+숫자
		// \d : 정수 [0-9]
		
		System.out.println(Pattern.matches("^\\d{3,4} - \\d{4} - \\d{4},+$", "010-8919-5098")); // 문자열 앞에는 \를 하나 더 붙여줘야함
	}

}
