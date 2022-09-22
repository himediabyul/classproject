package chapter05.exam;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m1 = new Member("강동원", "010-1234-9876", "배우" , 12, "tuna@handsome.com", 860205,"강남구 논현동");
		m1.showMemberInfo();
		
		Member m2 = new Member("하성운", "010-5667-9876", "가수" , 6, "cloud@handsome.com");
		m2.showMemberInfo();
	}
}
