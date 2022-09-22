package ver01;

import java.util.Scanner;

public class ContactMain {
	
	// main()메소드를 정의합니다.
	public static void main(String[] args) {

			
		
		Scanner in = new Scanner(System.in);
	
	//인스턴스의 출력메소드를 다시 실행합니다.	
		while (true) {
	System.out.println("입력 1, 종료 0");
	String input = in.nextLine();
		
			if(input.equals("0") ) {
				break;
			}

		System.out.println("이름을 입력해주세요>>> ");
		String name = in.nextLine();
		
		System.out.println("전화번호를 입력해주세요>>> ");
		String phoneNumber = in.nextLine();
		
		System.out.println("이메일을 입력해주세요>>> ");
		String email = in.nextLine();
		
		System.out.println("주소를 입력해주세요>>> ");
		String address = in.nextLine();
		
		System.out.println("생일을 입력해주세요>>> ");
		String birthDay = in.nextLine();
		
		System.out.println("그룹을 입력해주세요>>> ");
		String group = in.nextLine();
	
		Contact m1 = new Contact(name, phoneNumber, email, address, birthDay, group);
		m1.showContact();
	
	
			}
	}
	}
