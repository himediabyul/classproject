package ver02.practice;

import java.util.Scanner;

import ver02.practice.Contact;

public class SmartPhone {

	// ① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
	private Contact[] contacts;

	private int num; // index

	private SmartPhone(int size) {
		contacts = new Contact[num];
		num = 0;
		Scanner c;
	}

	// ② 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다
	static SmartPhone sp = new SmartPhone(10);

	public static SmartPhone getInstance() {

		if (sp == null) {
			sp = new SmartPhone(10);
		}
		return sp;
	}

	Scanner c = new Scanner(System.in);

	// 저장하고
	void saveData() {

		if (num == contacts.length) {
			System.out.println("최대 저장 갯수는 " + contacts + " 개 입니다.");
			return;
		}

		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthDay = null;
		String group = null;

		System.out.println("------------------");
		System.out.println("이름을 입력해주세요>>> ");
		name = c.nextLine();
		System.out.println("전화번호를 입력해주세요>>> ");
		phoneNumber = c.nextLine();
		System.out.println("이메일을 입력해주세요>>> ");
		email = c.nextLine();
		System.out.println("주소을 입력해주세요>>> ");
		address = c.nextLine();
		System.out.println("생일을 입력해주세요>>> ");
		birthDay = c.nextLine();
		System.out.println("그룹을 입력해주세요>>> ");
		group = c.nextLine();

		Contact contact = new Contact(name, phoneNumber, email, address, birthDay, group);

		contacts[num++] = contact;

	}

	// 수정하고
	void editData() {
		System.out.println("변경할 이름을 입력해주세요>>> ");
		String name = c.nextLine();

		int searchIndex = -1;
		for (int i = 0; i < num; i++) {
			if (contacts[i].getName().equals(name)) {
				searchIndex = i;
			}
			break;
		}
		if (searchIndex < 0) {
			System.out.println("찾으시는 데이터가 없습니다.");
			return;
		}
		Contact contact = contacts[searchIndex];
		System.out.print("변경할 이름을 입력해주세요>>> 현재이름: " + contact.getName() + "\n" + "취소하시려면 엔터를 눌러주세요");
		String newName = c.nextLine();
		if (newName != null && newName.length() > 0) {
			contact.setName(newName);
		}
		System.out.print("변경할 전화번호를 입력해주세요>>> 현재번호: " + contact.getPhoneNumber() + "\n" + "취소하시려면 엔터를 눌러주세요");
		String newPhoneNumber = c.nextLine();
		if (newPhoneNumber != null && newPhoneNumber.length() > 0) {
			contact.setPhoneNumber(newPhoneNumber);
		}
		System.out.print("변경할 이메일을 입력해주세요>>> 현재이메일: " + contact.getEmail() + "\n" + "취소하시려면 엔터를 눌러주세요");
		String newEmail = c.nextLine();
		if (newEmail != null && newEmail.length() > 0) {
			contact.setEmail(newEmail);
		}
		System.out.print("변경할 주소를 입력해주세요>>> 현재주소: " + contact.getAddress() + "\n" + "취소하시려면 엔터를 눌러주세요");
		String newAddress = c.nextLine();
		if (newAddress != null && newAddress.length() > 0) {
			contact.setAddress(newAddress);
		}
		System.out.print("변경할 생일을 입력해주세요>>> 현재생일: " + contact.getBirthDay() + "\n" + "취소하시려면 엔터를 눌러주세요");
		String newBirthDay = c.nextLine();
		if (newBirthDay != null && newBirthDay.length() > 0) {
			contact.setBirthDay(newBirthDay);
		}
		System.out.print("변경할 그룹을 입력해주세요>>> 현재그룹: " + contact.getGroup() + "\n" + "취소하시려면 엔터를 눌러주세요");
		String newGroup = c.nextLine();
		if (newGroup != null && newGroup.length() > 0) {
			contact.setGroup(newGroup);
		}

		System.out.println("변경이 완료되었습니다!");

	}

	// 삭제하고
	void deleteData() {
		System.out.println("삭제할 이름을 입력해주세요>>> ");
		String name = c.nextLine();

		// 데이터 찾기

		int searchIndex = -1;
		for (int i = 0; i < num; i++) {
			if (contacts[i].getName().equals(name)) {
				searchIndex = i;
			}
			break;
		}
		if (searchIndex < 0) {
			System.out.println("찾으시는 데이터가 없습니다.");
		} else {
			for (int i = searchIndex; i < num - 1; i++) {
				contacts[i] = contacts[i + 1];

				num--;
				System.out.println("데이터가 삭제되었습니다.");

			}
		}

	}

	void searchInfoPrint() {

		String name = null;

		System.out.println("검색을 시작합니다.");
		System.out.print("검색할 이름을 입력하세요 > ");
		name = c.nextLine();

		Contact contact = null;

		for (int i = 0; i < num; i++) {

			if (contacts[i].getName().equals(name)) {
				contact = contacts[i];
				break;

			}
		}

		// 결과출력
		if (contact == null) {
			System.out.println("검색한 이름 " + name + " 의 정보가 없습니다.");
		} else {
			contact.showContact();
		}

	}

	void printAll() {

		System.out.println("전체 정보를 출력합니다.");

		if (num == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}

		for (int i = 0; i < num; i++) {
			contacts[i].showContact();
		}
	}
}
