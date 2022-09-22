package chapter05.modifier;

public class SingletonMain {
	
	public static void main(String[] args) {
		
		Singleton s =null;
		
	//	s = new Singleton();  외부 클래스에서 사용못함
		
		s= Singleton.getInstance();
		
	}

}
