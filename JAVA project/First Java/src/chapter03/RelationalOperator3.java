package chapter03;

public class RelationalOperator3 {

	
	public static void main(String[] args) {
		
		
		// 관계연산자 ( 비교연산자)
		// > < >= <= == !=
		
		// 참조변수 : 주소를 가지는 변수
		// 주소 : 객체를 가르키는 주소 값.
		// 같은 주소를 가지는지 확인하는 연산이 주로 사용된다.
		
		String str1 = "JAVA";
		String str2 = "HTML";
		String str3 = "JAVA";
		System.out.println(str1 == str2);  // 주소값 == 주소값 
		System.out.println(str1 != str2);  // 주소값 != 주소값
		System.out.println("str1 == str3 =>" + ( str1 == str3));
		
		//System.out.println(str1 > str2); -> 같거나 같지않은것만 확인됨, 크다 작다는 안됨
		
			
		}
		
		
	}

