package ver01;

	class Contact {  //public을 지워서 다른패키지의 같은 클래스에서 나타나지 않게 함
	
	private String name;
	private String phoneNumber;
	private String email;
	private String address;
	private String birthDay;
	private String group;
	
	public Contact(){
		
	}
	
	//연락처 데이터를 저장하는 인스턴스를 생성합니다.
	public Contact(String name, String phoneNumber, String email, String address, String birthDay, String group) {
		
		//this(name, phoneNumber, email, address, birthDay, group);
		
	
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthDay = birthDay;
		this.group = group;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}


		
	public void showContact() {
		
		
		System.out.println("------------------");
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("이메일 : " + this.email);
		System.out.println("주소 : " + this.address);
		System.out.println("생일 : " + this.birthDay);
		System.out.println("그룹 : " + this.group);
					
	}


	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", birthDay=" + birthDay + ", group=" + group + "]";
	}
	
	
	

	
}