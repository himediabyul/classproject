package all;

import java.util.Scanner;
import all.Contact;

public class SmartPhone {

//	① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
//	② 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다

	Contact[] contacts;
	int num;
	static Scanner in;

	SmartPhone(int size) {
		contacts = new Contact[size];
		num = 0;
		in = new Scanner(System.in);
	}

	static SmartPhone sp = new SmartPhone(10);

	static SmartPhone getInstance() {
		if (sp == null) {
			sp = new SmartPhone(10);
		}
		return sp;
	}

	// ② 사용자로부터 입력을 받아 Contact 인스턴스를 생성해서 SmartPhone 클래스의 인스턴스가 가지고 있는 배열에 추가합니다.
	void saveContact() {

		if (num == contacts.length) {
			System.out.println("저장공간이 부족합니다.");
			return;
		}

		System.out.println("입력할 그룹을 선택해주세요.");
		System.out.println("1. 회사 \t 2. 거래처");
		int select = Integer.parseInt(in.nextLine());

		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthday = null;
		String group = null;

		System.out.print("이름 > ");
		name = getString();

		System.out.print("전화번호 > ");
		phoneNumber = getString();

		System.out.print("이메일 > ");
		email = getString();

		System.out.print("주소 > ");
		address = getString();

		System.out.print("생일 > ");
		birthday = getString();

		System.out.print("그룹 > ");
		group = getString();

		Contact contact = null;

		if (select == 1) {
			System.out.print("회사명 > ");
			String company = getString();
			System.out.print("부서명 > ");
			String part = getString();
			System.out.print("직급 > ");
			String position = getString();

			CompanyContact companyContact = new CompanyContact(name, phoneNumber, email, address, birthday, group,
					company, part, position);
		} else {
			System.out.print("거래처명 > ");
			String company = getString();
			System.out.print("거래품목 > ");
			String product = getString();
			System.out.print("직급 > ");
			String position = getString();

			CustomerContact customerContact = new CustomerContact(name, phoneNumber, email, address, birthday, group,
					company, product, position);

		}
		// ③ 10번 반복해서 배열에 추가합니다.
		contacts[num++] = contact;

	}

	// ⑤ 배열의 모든 요소를 검색합니다.
	int getIndex() {

		String name = in.nextLine();

		int searchIndex = -1;

		for (int i = 0; i < num; i++) {
			if (contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;

	}

	// ⑦ 배열의 요소를 수정해 봅시다.
	void editContact() {
		
		System.out.print("수정할 대상의 이름을 입력해주세요> ");
		int searchIndex = getIndex();
		Contact contact = contacts[searchIndex];
		
		System.out.println("변경할 이름을 입력해주세요> ");
		String newName = in.nextLine();
		
		if(contacts[searchIndex]!=null) {
			contact.setName(newName);
		}
		System.out.println("변경할 전화번호를 입력해주세요> ");
		String newPhoneNumber = in.nextLine();
		
		if(contacts[searchIndex]!=null) {
			contact.setName(newPhoneNumber);
		}
		System.out.println("변경할 이메일을 입력해주세요> ");
		String newEmail = in.nextLine();
		
		if(contacts[searchIndex]!=null) {
			contact.setEmail(newEmail);
		}
		System.out.println("변경할 주소를 입력해주세요> ");
		String newAddress = in.nextLine();
		
		if(contacts[searchIndex]!=null) {
			contact.setAddress(newAddress);
		}
		
		if(contact instanceof CompanyContact) {
			CompanyContact companyContact = (CompanyContact) contact;
			
			System.out.println("변경할 회사명을 입력해주세요> ");
			String newCompany = in.nextLine();
			
			if(contacts[searchIndex]!=null) {
				((CompanyContact) contact).setCompany(newCompany);
			}
			System.out.println("변경할 부서명을 입력해주세요> ");
			String newPart = in.nextLine();
				
			if(contacts[searchIndex]!=null) {
				((CompanyContact) contact).setPart(newPart);
			}	
			System.out.println("변경할 직급을 입력해주세요> ");
			String newPosition = in.nextLine();
			
			if(contacts[searchIndex]!=null) {
				((CompanyContact) contact).setPosition(newPosition);
			}
			} else if(contact instanceof CustomerContact) {
				CustomerContact customerContact = (CustomerContact) contact;
				
				System.out.println("변경할 거래처명을 입력해주세요> ");
				String newCompany = in.nextLine();
				if(contacts[searchIndex]!=null) {
					((CustomerContact) contact).setCompany(newCompany);
				}
				System.out.println("변경할 거래품목을 입력해주세요> ");
				String newProduct = in.nextLine();
				if(contacts[searchIndex]!=null) {
					((CustomerContact) contact).setProduct(newProduct);
			}
				System.out.println("변경할 직급을 입력해주세요> ");
				String newPosition = in.nextLine();
				if(contacts[searchIndex]!=null) {
					((CustomerContact) contact).setPosition(newPosition);
				}
		
		}
		
	}

	// ⑥ 배열의 요소를 삭제해 봅시다.
	void deleteContact() {
		System.out.print("삭제할 대상의 이름을 입력하세요>");

		int searchIndex = getIndex();

		Contact contact = contacts[searchIndex];

		if (searchIndex < 0) {
			System.out.println("찾으시는 대상이 없습니다.");
		} else {
			for (int i = searchIndex; i < num - 1; i++) {
				contacts[i] = contacts[i + 1];
			}
			num--;
			System.out.println("데이터가 삭제되었습니다.");
		}
	}
//	 입력 또는 수정할 때 공백 문자열을 입력 받으면 다시 입력 받도록 흐름을 만들어봅시다. 
	static String getString() {
		
		String str = null;
		while(true) {
			
		str = in.nextLine();
		if(str!=null && str.trim().length()!=0) {
			break;
		}else {
			System.out.println("공백은 허용하지 않습니다. 다시 입력해주세요.");
		}
		
		}return str;
	}
//	입력할 때 전화번호가 같은 데이터가 입력되면 입력이 되지 않도록 흐름을 만들어봅시다.
	String getPhoneNumber() {
		String phoneNumber = null;
		
		while(true) {
		phoneNumber = in.nextLine();
		if(phoneNumber!=null && phoneNumber.trim().length()!=0) {
			boolean chk = false;
			for(int i=0; i<num; i++) {
			if(phoneNumber.equals(contacts[i].getPhoneNumber())) {
				chk = true;
				break;
				}
			}if(chk) {
				System.out.println("중복된 데이터가 존재합니다.\n다시입력해주세요. >");
			}else {
				break;
			}
		}else {
			System.out.println("공백은 허용하지 않습니다.");
		}
		}
		return phoneNumber;
	}


	// ④ 배열의 모든 요소를 출력합니다.
	void printAll() {

		System.out.println("전체 정보를 출력합니다.");

		if (num == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}

		for (int i = 0; i < num; i++) {
			contacts[i].printContact();
		}
	}
}

//2. main()메소드를 아래의 요구조건을 정의해봅니다. 
//① SmartPhone 클래스의 인스턴스를 생성합니다.
