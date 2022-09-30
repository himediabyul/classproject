package ver03.practice;

import java.util.Scanner;

import ver03.CompanyContact;

import ver03.CustomerContact;

public class SmartPhone {
	
	/*
	 * 전화번호부
		클래스 3개
	1. 정보를 저장하는 용도 클래스: 인스턴스 마다 각각 다른 속성가진다.
	2. 기능을 처리하는 클래스: 기능만 정의->하나의 인스턴스만 생성 사용
	3. 프로그램을 정의하는 클래스
	 */
	
	
	
	
	// 기능 클래스 : 속성을 가지지 않고 메소드들로만 정의된 클래스
	// 여러개의 인스턴스가 생성 될 필요가 없다.=> 싱글톤 패턴
	// 1. private 생성자
	// 2. 클래스 내부에서 인스턴스를 생성 static, private
	// 3. 내부에서 생성한 참조값을 반환해주는 메소드 static public
	
	//요구사항
	//이 클래스는 연락처 정보를 관리하는 클래스입니다.
	//① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
	// => 10개 정보를 저장할수 있다. - 배열 인스턴스를 생성 Contact[]
	// 	  Contact 클래스 기반의 인스턴스를 최대 10개까지 만들어 배열의 참조값을 저장할 수 있다.
	
	private Contact[] contacts; //초기화. 외부에서 접근하지 못하는 변수, 메서드를 외부에서 보여지도록 하자
	private int numofContact;  // 입력된 정보의 개수, 배열의 index 값으로 사용
	
	Scanner sc; // 모든 인스턴스에서 사용할 수 있도록 초기변수선언
	
	private SmartPhone(int size){  //생성자
		contacts = new Contact[size]; // 10개로 지정해도 되지만 유연하게 하기위해 size로 지정
		numofContact = 0; // 초기화
		sc = new Scanner(System.in); //초기화
	}
	//10개로 설정하는 인스턴스 싱글톤으로..
	private static SmartPhone sp = new SmartPhone(10);
	
	public static SmartPhone getInstance() {
		if(sp==null) {
			sp = new SmartPhone(10);//처리해야할게 1개면 {} 생략가능
			// System.out.println(); 처리해야할게 2개이상이면 반드시 {} 써야함
		}
		return sp;
		
	}
		
	//② 기능
	//  배열에 인스턴스를 저장하고, ->정보저장
	//				 수정하고, (이름으로 검색)
	//				 삭제, (이름으로 검색)
	//				 검색 후 결과 출력, (이름으로 검색)
	//				 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.
	
	//이름 검색후 데이터 수정
	void editContact() {
		System.out.println("데이터 수정을 진행합니다.");
		System.out.println("변경하고자 하는 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		
		
		int searchIndex = -1;  //'현재 검색의 결과는 없다' 로 초기화한것...
		
		
		//데이터 찾기
		for(int i=0; i<numofContact ; i++) {
			if(contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}
		if(searchIndex<0) {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
			return;
		}
		System.out.println();
		Contact contact = contacts[searchIndex];
		System.out.println("데이터 수정을 진행합니다.");
		System.out.println("변경하고자 하는 이름을 입력해주세요(현재값:" +contact.getName()+"\n"+"변경하지 않으려면 엔터를 치세요");
		String newName = sc.nextLine();
		
		if(newName != null && newName.trim().length()>0) {  //trim 은 양쪽 공백을 없애줌 " abd " -> "abd"
			contact.setName(newName);
		}
		System.out.println("변경하고자 하는 전화번호를 입력해주세요(현재값:" +contact.getPhoneNumber()+"\n"+"변경하지 않으려면 엔터를 치세요");
		String newPhoneNumber = sc.nextLine();
				
		if(newPhoneNumber != null && newPhoneNumber.trim().length()>0) { 
			contact.setPhoneNumber(newPhoneNumber);
		}
		System.out.println("변경하고자 하는 이메일을 입력해주세요(현재값:" +contact.getEmail()+"\n"+"변경하지 않으려면 엔터를 치세요");
		String newEmail = sc.nextLine();
				
		if(newEmail != null && newEmail.trim().length()>0) { 
			contact.setEmail(newEmail);
		}
		System.out.println("변경하고자 하는 주소를 입력해주세요(현재값:" +contact.getAddress()+"\n"+"변경하지 않으려면 엔터를 치세요");
		String newAddress = sc.nextLine();
				
		if(newAddress != null && newAddress.trim().length()>0) { 
			contact.setAddress(newAddress);
		}
		System.out.println("변경하고자 하는 생일을 입력해주세요(현재값:" +contact.getBirthDay()+"\n"+"변경하지 않으려면 엔터를 치세요");
		String newBirthDay = sc.nextLine();
		
		if(newBirthDay != null && newBirthDay.trim().length()>0) {
			contact.setBirthDay(newBirthDay);
		}
		System.out.println("변경하고자 하는 그룹을 입력해주세요(현재값:" +contact.getGroup()+"\n"+"변경하지 않으려면 엔터를 치세요");
		String newGroup = sc.nextLine();
		
		if(newGroup != null && newGroup.trim().length()>0) {
			contact.setGroup(newGroup);
		}
		
		if(contact instanceof CompanyContact1) {  // 중간 수정 추가
			CompanyContact1 companyContact = (CompanyContact1) contact;
			
			System.out.println("변경하고자 하는 회사 이름을 입력해주세요(현재값:" +companyContact.getCompany()+"\n"+"변경하지 않으려면 엔터를 치세요");
			String newCompany = sc.nextLine();
			
			if(newCompany != null && newCompany.trim().length()>0) {  
				companyContact.setCompany(newCompany);
			}
			
			System.out.println("변경하고자 하는 부서 이름을 입력해주세요(현재값:" +companyContact.getPart()+"\n"+"변경하지 않으려면 엔터를 치세요");
			String newPart = sc.nextLine();
			
			if(newPart != null && newPart.trim().length()>0) {
				companyContact.setPart(newPart);
			}
			System.out.println("변경하고자 하는 직급을 입력해주세요(현재값:" +companyContact.getPosition()+"\n"+"변경하지 않으려면 엔터를 치세요");
			String newPosition = sc.nextLine();
			
			if(newPosition != null && newPosition.trim().length()>0) {
				companyContact.setPosition(newPosition);
			}
		} else if(contact instanceof CustomerContact1) {
			CustomerContact1 customerContact = (CustomerContact1) contact;
			
			System.out.println("변경하고자 하는 거래처 이름을 입력해주세요(현재값:" +customerContact.getCompany()+"\n"+"변경하지 않으려면 엔터를 치세요");
			String newCompany = sc.nextLine();
			
			if(newCompany != null && newCompany.trim().length()>0) {  
				customerContact.setCompany(newCompany);
			}
			
			System.out.println("변경하고자 하는 거래 품목을 입력해주세요(현재값:" +customerContact.getProduct()+"\n"+"변경하지 않으려면 엔터를 치세요");
			String newProduct = sc.nextLine();
			
			if(newProduct != null && newProduct.trim().length()>0) { 
				customerContact.setProduct(newProduct);
			}
			
			System.out.println("변경하고자 하는 직급을 입력해주세요(현재값:" +customerContact.getPosition()+"\n"+"변경하지 않으려면 엔터를 치세요");
			String newPosition = sc.nextLine();
			
			if(newPosition != null && newPosition.trim().length()>0) {  
				customerContact.setPosition(newPosition);
			}
		}
		

		System.out.println("정보가 변경되었습니다!");
		System.out.println();
		
	}
	
	
	//삭제
	void deleteContact() {
		
		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.println("삭제하고자 하는 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		
		//삭제하고자 하는 index를 찾아야한다 -> 시프트
		int searchIndex = -1;  //'현재 검색의 결과는 없다' 로 초기화한것...
		
		
		//데이터 찾기
		for(int i=0; i<numofContact ; i++) {
			if(contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}
		//검색한 index 값으로 분기 : 시프트를 하거나 검색결과이름이 존재하지않는다.
		if(searchIndex<0) {
			System.out.println("삭제하고자하는 이름의 데이터가 존재하지않습니다.");
		}else {
			for(int i=searchIndex ; i<numofContact-1; i++) {
				contacts[i] = contacts[i+1];
			}
			
			numofContact--;
			System.out.println("데이터가 삭제되었습니다.");
			}
	}

	
	//검색 후 결과 출력 (이름으로 검색)
	void searchInfoPrint() {
		
		
		//1. 사용자에게 검색할 키워드 입력받는다.
		//2. 배열에서 이름검색
		//3. 결과출력 : "검색한 이름의 정보가 없습니다." or 정보출력
		
		String name = null; //검색할 이름
		
		System.out.println("검색을 시작합니다.");
		System.out.print("검색할 이름을 입력하세요 > ");
		name = sc.nextLine();
		
		Contact contact = null;
		//배열에서 검색할 이름을 가지는 인스턴스의 데이터 출력 메소드를 실행
		for(int i=0; i<numofContact; i++) {
			//각 요소의 참조변수로 객체를 참조해서 이름을 비교
			if(contacts[i].getName().equals(name)) {
				contact = contacts[i];
				break;
				
			}
		}
		
		// 결과출력
		if(contact == null) {
			System.out.println("검색한 이름 "+ name + " 의 정보가 없습니다.");
		}else {
			contact.showContact();
		}
		
		
	
		
	}
	
	//전체 입력 데이터의 출력
	void printAllData() {
		
		System.out.println("전체 정보를 출력합니다.");
		
		//배열에 저장된 데이터를 모두 출력
		if(numofContact==0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}
		
		for(int i=0; i<numofContact; i++) {
			contacts[i].showContact();
		}
	}
	
	
	void insertContact() {
		//1.데이터를 받고
		//2.인스턴스 생성
		//3.배열에 인스턴스의 참조값을 저장
		
		if(numofContact==contacts.length) {
			System.out.println("최대 저장 갯수는 " + contacts + " 개 입니다.");
			return;
		}
		
		System.out.println("입력하고자 하는 그룹을 선택해주세요");
		System.out.println("1.회사 \t 2.거래처");
		int select = Integer.parseInt(sc.nextLine());
		
		
		//데이터받기
		Scanner sc = new Scanner(System.in);
		
		String name = null;  //지역변수
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthDay = null;
		String group = null;
				
		System.out.println("입력을 시작합니다.");
		System.out.print("이름 > ");
		name = sc.nextLine();
		
		System.out.print("전화번호 > ");
		phoneNumber = sc.nextLine();
		
		System.out.print("이메일 > ");
		email = sc.nextLine();
		
		System.out.print("주소 > ");
		address = sc.nextLine();
		
		System.out.print("생일 > ");
		birthDay = sc.nextLine();
		
		System.out.print("그룹 > ");
		group = sc.nextLine();
		
		Contact contact = null;
		
		if(select == 1) {
			System.out.print("회사 이름 > ");
			String company = sc.nextLine();
			System.out.println("부서 > ");
			String part = sc.nextLine();
			System.out.println("직급 > ");
			String position = sc.nextLine();
			
			contact = new CompanyContact1(name, phoneNumber, email, address, birthDay, group, company, part, position);
			
		} else {
				System.out.println("거래처 이름 > ");
				String company = sc.nextLine();
				System.out.println("거래 품목 > ");
				String product = sc.nextLine();
				System.out.println("직급 > ");
				String position = sc.nextLine();
				
			contact = new CustomerContact1(name, phoneNumber, email, address, birthDay, group, company, product, position);
			}
		
		
		//인스턴스 생성
//		Contact contact = new Contact(name, phoneNumber, email, address, birthDay, group);
		
		
		//배열에 저장
		//처음 입력 : numofContact => 0
		contacts[numofContact++] = contact;
				//numofContact++;
		
		
	}
	

	
	
	

}
