package chapter05.test;

import java.util.Date;
import java.util.Scanner;

public class Candy {
	
	static int width = 100;  //고정
	static int height = 100;  //고정
	String type;
	
	Candy(String type){
		this.type = type;
		//width = 100;  변수생성
		//height =100;
	
	}
	
	public static void main(String[] args) {
		
		Scanner sd = null;
		Date date = null;
		
		
		//인스턴스 8개 생성시 -> 변수 24개 생성
		//인스턴스 8개 생성시 -> 변수 8+2개 생성
		
		Candy c1 = new Candy("허브");
		Candy c2 = new Candy("레몬");
		Candy c3 = new Candy("소다");
		Candy c4 = new Candy("초코");
		Candy c5 = new Candy("딸기");
		Candy c6 = new Candy("사과");
		Candy c7 = new Candy("콜라");
		Candy c8 = new Candy("포도");
	}

}
