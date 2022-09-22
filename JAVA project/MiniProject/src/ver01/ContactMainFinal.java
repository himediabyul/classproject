package ver01;

import java.util.Scanner;

public class ContactMainFinal {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Contact 인스턴스 생성 : 생성자를 이용한 데이터 초기화
		ContactFinal c1 = new ContactFinal("강동원","010-1234-7894", "tuna@handsome.com", "서울시 강남구", "1981.01.16", "배우");
		
		//변수 값을 반환하는 각각의 메소드를 호출해서 각 데이터를 출력문으로 출력합니다.
		//private 되어있기때문에 getter 메소드로 가져올수있음
		
		  System.out.println("이름 : " + c1.getName()); 
		  System.out.println("전화번호 : " + c1.getPhoneNumber()); 
		  System.out.println("이메일 : " + c1.getEmail());
		  System.out.println("주소 : " + c1.getAddress()); 
		  System.out.println("생일 : " + c1.getBirthDay()); 
		  System.out.println("그룹 : " + c1.getGroup());
		  
		  System.out.println();
		  
		  //생성된 인스턴스의 정보 출력 메소드를 호출합니다. c1.printInfo();
		  
		  //인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터를 수정합니다 
		  c1.setName("하성운");
		  c1.setPhoneNumber("010-4687-5855"); 
		  c1.setEmail(null); 
		  c1.setAddress(null);
		  c1.setBirthDay(null); 
		  c1.setGroup(null);
		  
		  System.out.println(); 
		  c1.printInfo();
		  
		  ////////////////////////////
		 
		while(true) {
			System.out.println("1. 입력 시작 | 0. 종료");
			String select = in.nextLine();
			if(select.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!select.equals("1")) {
				System.out.println("올바른 요청이 아닙니다.");
				continue;
			}
			// 저장할 데이터를 콘솔에서 사용자의 입력 값으로 인스턴스를 생성해봅시다
			
			System.out.println("데이터 입력을 시작합니다.");
			
			System.out.println("이름 >>> ");
			String name = in.nextLine();
			
			System.out.println("전화번호 >>> ");
			String phoneNumber = in.nextLine();
			
			System.out.println("이메일 >>> ");
			String email = in.nextLine();
			
			System.out.println("주소 >>> ");
			String address = in.nextLine();
			
			System.out.println("생일 >>> ");
			String birthDay = in.nextLine();
			
			System.out.println("그룹 >>> ");
			String group = in.nextLine();
			
			ContactFinal c = new ContactFinal(name,phoneNumber,email,address,birthDay,group);
			
			System.out.println(); 
			  c.printInfo();

		}
		
		
		
		
		
		
	}

}
