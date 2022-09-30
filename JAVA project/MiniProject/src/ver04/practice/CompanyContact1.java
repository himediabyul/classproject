package ver04.practice;

public class CompanyContact1 extends Contact {
	
//	① CompanyContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//	- 회사이름, 부서이름, 직급 변수 추가
//	- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력

	String company;
	String part;
	String position;
	
	public CompanyContact1(String name, String phoneNumber, String email, 
						String address, String birthDay, String group, 
						String company, String part, String position) {
		super(name, phoneNumber, email, address, birthDay, group);
		this.company = company;
		this.part = part;
		this.position = position;
	}
	
	@Override
	public void showContact() {
		super.showContact();
		System.out.println("회사 이름: " + this.company);
		System.out.println("부서 이름: " + this.part);
		System.out.println("직급 : " + this.position);
		
	}
	
	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getPart() {
		return part;
	}


	public void setPart(String part) {
		this.part = part;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}

	public static void main(String[] args) {
		Contact contact = new CompanyContact1("An","010-8888-9999","an@naver.com","서울", "2001-01", "가수", "아이브",
				"메보", "언니");
		
		contact.showContact();
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		
	}




}
