package ver01;


//Contact 클래스의 용도? => 데이터 저장
//인스턴스 생성 -> 변수의 메모리 생성 -> 데이터 저장
public class ContactFinal {
	
	/*
	 저장 정보
	 이름
	 전화번호
	 이메일
	 주소
	 생일
	 그룹 
	 *변수들은 직접 참조를 막아 캡슐화 처리를 하도록 해봅시다
	 */
	private String name;  //친구의 이름을 저장하는 변수
	private String phoneNumber;  
	private String email;
	private String address;
	private String birthDay;
	private String group;
	
	public ContactFinal(){	
	}
	//인스턴스 생성과 함께 데이터를 초기화 할 수 있도록 생성자를 정의해봅시다
	public ContactFinal(String name, String phoneNumber, String email, String address, String birthDay, String group) {

		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthDay = birthDay;
		this.group = group;
	}
	

	//변수의 직접 참조는 안되지만 변수의 값을 얻을 수 있는 메소드(getter)와
	//변수에 값을 저장할 수 있는 메소드(setter)를 정의합니다.
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

	//위 데이터를 출력하는 기능
	public void printInfo() {
		System.out.println("==== 친구 정보 ====");
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber );
		System.out.println("이메일 : " + this. email);
		System.out.println("주소 : " + this.address);
		System.out.println("생일 : " + this.birthDay);
		System.out.println("그룹 : " + this.group);
	}
	
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", birthDay=" + birthDay + ", group=" + group + "]";
	}
	
	
	
		
	}
	

