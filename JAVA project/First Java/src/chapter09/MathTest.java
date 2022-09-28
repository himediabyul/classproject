package chapter09;

public class MathTest {
	
	public static void main(String[] args) {
		
		//PI
		System.out.println(Math.PI);
		
		//난수 생성
		System.out.println(Math.random());
		
		//1~45까지의 난수
		int num = (int)(Math.random()*45)+1;   //1을 더하지 않을경우 0~44.99999999
		System.out.println(num);
		
		//절사
		System.out.println(Math.floor(3.6002));
		
		//반올림
		System.out.println(Math.round(3.4002));
		
		//큰 값
		System.out.println(Math.max(10, 20));
		
		//작은 값
		System.out.println(Math.min(10, 20));
	}

}
