package chapter09;

public class SystemTest {
	
	public static void main(String[] args) {
		
		
		//작업시간 체크 : 성능 검사
		long startTime = System.currentTimeMillis();	// 1970.01.01 00:00:00 000-> 현재시간까지의 밀리초 결과값
		long sTime = System.nanoTime();
		for(int i=0 ; i<1000000000 ; i++) {
			int n1 =1;
			int n2 =10;
			int sum = n1+n2;
		}
		
		long endTime = System.currentTimeMillis();
		long eTime = System.nanoTime();
		System.out.println(endTime);
		System.out.println(eTime);
		long checkTime = endTime-startTime;
		
		System.out.println("실행 시간 : " + checkTime);
	}

}
