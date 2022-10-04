package chapter03;

public class AssignmentOperator {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		num += 5; // num = num +5 => num = 10 + 5
		System.out.println("num : " + num);
		
		num-= 3;  // num = num -3 => num = 15 - 3
		System.out.println("num : "+ num);
		
		num*= 2;  // num = num * 2 => num = 12 * 2
		System.out.println("num : " + num);
		
		num/= 6;  // num = num / 6 => num = 24 / 6
		System.out.println("num : " + num);
		
		num%= 3;  // num = num % 3 => num = 4 / 3 의 나머지
		System.out.println("num : " + num);
		
		String str = "안녕하세요.";
		str += " 저는 이샛별 입니다.";  // "안녕하세요." + " 저는 이샛별 입니다."
		str += " 저는 학생 입니다.";
		
		System.out.println(str);
		
	
		
		
	}

}
