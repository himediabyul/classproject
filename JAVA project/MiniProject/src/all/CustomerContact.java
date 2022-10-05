package all;

public class CustomerContact extends Contact{
	
	String company;
	String product;
	String position;
	
	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday, String group,
			String company, String product, String position) {
		super(name, phoneNumber, email, address, birthday, group);
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
	public void printContact() {
		super.printContact();
		
		System.out.println("거래처명 : " + this.company);
		System.out.println("거래품목 : " + this.product);
		System.out.println("직급 : " + this.position);
		
		
	}
	
	

}
