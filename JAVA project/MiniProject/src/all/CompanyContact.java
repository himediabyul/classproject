package all;
import all.Contact;
public class CompanyContact extends Contact {
	
	String company;
	String part;
	String position;
	
	public CompanyContact(String name, String phoneNumber, String email, String address, String birthday, String group,
			String company, String part, String position) {
		super(name, phoneNumber, email, address, birthday, group);
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
	public void printContact() {
		super.printContact();
		
		System.out.println("회사명 : " + this.company);
		System.out.println("부서명 : " + this.part);
		System.out.println("직급 : " + this.position);
	}

	

}
