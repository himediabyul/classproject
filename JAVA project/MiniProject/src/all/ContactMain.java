package all;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact c = new Contact("안유진","010-1234-56789","an@naver.com","서울시 강남구","2001-01-16","가수");
		
		c.printContact();
		
		System.out.println("이름 : " + c.getName());
		System.out.println("전화번호 : " + c.getPhoneNumber());
		System.out.println("이메일 : " + c.getEmail());
		System.out.println("주소 : " + c.getAddress());
		System.out.println("생일 : " + c.getBirthday());
		System.out.println("그룹 : " + c.getGroup());
		
		c.setName("");
		c.setPhoneNumber("");
		c.setEmail("");
		c.setAddress("");
		c.setBirthday("");
		c.setGroup("");
		
		c.printContact();
		
			Scanner in = new Scanner(System.in);
			
			while(true) {
				System.out.println("입력-> 1, 종료 ->2");
				String select = in.nextLine();
				if(select.equals("2")) {
					System.out.println("프로그램을 종료합니다.");
					break;
	
				} else if(select.equals("1")){
				
	
			System.out.print("이름을 입력해주세요 > ");
			String name = in.nextLine();
			
			System.out.print("전화번호를 입력해주세요 > ");
			String phoneNumber = in.nextLine();
			
			System.out.print("이메일을 입력해주세요 > ");
			String email = in.nextLine();
			
			System.out.print("주소를 입력해주세요 > ");
			String address = in.nextLine();
			
			System.out.print("생일을 입력해주세요 > ");
			String birthday = in.nextLine();
			
			System.out.print("그룹을 입력해주세요 > ");
			String group = in.nextLine();
			
			
			Contact contact = new Contact(name, phoneNumber, email, address, birthday, group);
			contact.printContact();
			
				}
			}			
		}
	}

