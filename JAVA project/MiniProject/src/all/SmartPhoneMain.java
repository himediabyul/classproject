package all;

public class SmartPhoneMain {

	public static void main(String[] args) {
			
		SmartPhone sp = SmartPhone.getInstance();
		
		while(true) {
		
		printMenu();
		
		int select = Integer.parseInt(sp.in.nextLine());
		
		switch(select) {
			case 1 :
				sp.saveContact();
				break;
			case 2 :
				sp.getIndex();
				break;
			case 3 :
				sp.editContact();
				break;
			case 4 :
				sp.deleteContact();
				break;
			case 5 :
				sp.printAll();
				break;
			case 6 :
				System.out.println("프로그램을 종료합니다.");
				return;
			}	
		
		}
	
	}
	static void printMenu() {
						
		System.out.println("==== 전화번호부 =====");
		System.out.println("1.연락처 저장");
		System.out.println("2.연락처 검색");
		System.out.println("3.연락처 수정");
		System.out.println("4.연락처 삭제");
		System.out.println("5.전체 출력");
		System.out.println("6.프로그램 종료");
		
		
	}
}

