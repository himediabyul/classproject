package ver02;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone smartPhone = SmartPhone.getInstance();
		
		
		
		//입력 출력
		smartPhone.insertContact();
		
		System.out.println();
		
		//전체 출력
		smartPhone.printAllData();
		
		System.out.println();
		
		//이름 검색후 결과 출력
//		smartPhone.searchInfoPrint();

//		System.out.println();
		
		//이름 검색후 수정
		smartPhone.editContact();
		
		System.out.println();
		
		smartPhone.searchInfoPrint();

		System.out.println();
		
		smartPhone.searchInfoPrint();

		System.out.println();
		
		smartPhone.printAllData();

		System.out.println();
		
		//이름 검색후 삭제
//		smartPhone.deleteContact();

//		System.out.println();
//		smartPhone.searchInfoPrint();

//		System.out.println();
//		smartPhone.printAllData();

//		System.out.println();
		
		//실제 삭제후 결과값이 바뀐걸 확인
//		smartPhone.deleteContact();

//		System.out.println();
//		smartPhone.searchInfoPrint();

//		System.out.println();
//		smartPhone.printAllData();

//		System.out.println();
		
	}
}
