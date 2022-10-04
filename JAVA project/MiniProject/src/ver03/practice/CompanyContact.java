package ver03.practice;

public class CompanyContact extends Contact {
	
//	① CompanyContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//	- 회사이름, 부서이름, 직급 변수 추가
//	- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력

	String company;
	String part;
	String position;
	
	public CompanyContact(String name, String phoneNumber, String email, 
						String address, String birthDay, String group, 
						String company, String part, String position) {
		super(name, phoneNumber, email, address, birthDay, group);
		this.company = company;
		this.part = part;
		this.position = position;
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


	@Override
	public void showContact() {
		super.showContact();
		System.out.println("회사 이름: " + this.company);
		System.out.println("부서 이름: " + this.part);
		System.out.println("직급 : " + this.position);
		
	}


	@Override
	public String toString() {
		return "CompanyContact1 [company=" + company + ", part=" + part + ", position=" + position + "]";
	}
	
	
}
