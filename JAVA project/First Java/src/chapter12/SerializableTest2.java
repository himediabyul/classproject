package chapter12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableTest2 {

	public static void main(String[] args) {
		
		String msg = "안녕하세요";
		
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream("instanceData.ser"));
			
			outputStream.writeObject(msg);  //직렬화가 가능한 객체가 와야함
			
			Person p =new Person("안유진", 20);
			
			outputStream.writeObject(p);
			
			ArrayList<Person> list = new ArrayList<>();
			list.add(new Person("안유진1", 21));
			list.add(new Person("안유진2", 22));
			list.add(new Person("안유진3", 23));
			list.add(new Person("안유진4", 24));
			list.add(new Person("안유진5", 25));
			
			outputStream.writeObject(list);
			
			System.out.println("저장 되었습니다.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
