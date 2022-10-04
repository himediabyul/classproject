package ver05.practice;

public class CustomerContact extends Contact {
	
//	 CustomerContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다.
//	 - 거래처회사이름, 거래품목, 직급 변수 추가
//	 - 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력

	String company;
	String product;
	String position;
	
	public CustomerContact(String name, String phoneNumber, String email, 
						String address, String birthDay, String group, 
						String company, String product, String position) {
		super(name, phoneNumber, email, address, birthDay, group);
		this.company = company;
		this.product = product;
		this.position = position;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
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
		
		System.out.println("거래처 이름 : " + this.company);
		System.out.println("거래 품목 : " + this.product);
		System.out.println("직급 : " + this.position);
	}

	@Override
	public String toString() {
		return "CustomerContact [company=" + company + ", product=" + product + ", position=" + position + "]";
	}
	

}
