package chapter11;

public class SmartPhone implements Comparable<SmartPhone> {

	private String name;
	private String phoneNumber;
	
	public SmartPhone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	//값을 변경하지 못하도록 getter만 
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	

	//HashSet 중복저장을 하지않는다
	//HashCode 참조 -> equals 메소드로 비교
	
	@Override
	public int hashCode() {
		return phoneNumber.charAt(phoneNumber.length()-1);
		//0 ~ 9 사이의 값
				
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj != null && obj instanceof SmartPhone) {
			SmartPhone phone = (SmartPhone)obj;
			result = phoneNumber.equals(phone.getPhoneNumber());
		}
		return result;
	}
	
	
	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	@Override
	public int compareTo(SmartPhone o) {
		return name.compareTo(o.getName())*-1;
	}
}
