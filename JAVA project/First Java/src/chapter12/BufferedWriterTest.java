package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) {
		
	
		//BufferedWriter out = null;
		
				try(BufferedWriter out = new BufferedWriter(new FileWriter("c:\\test\\text2.txt"));) {
					//out = new BufferedWriter(new FileWriter("c:\\test\\text2.txt"));
		
		out.write("안유진");
		out.newLine();
		out.write("스타쉽엔터테인먼트 소속 6인조 걸그룹 IVE의 리더.");
		out.newLine();
		out.write("2018년 엠넷에서 주관하는 걸그룹 서바이벌 오디션 프로듀스 48에 참가한 뒤 최종 선발되어 걸그룹 IZ*ONE으로 2021년 4월까지 활동하였다");
		out.newLine();
		out.newLine();
		out.write("나무위키 참조");
		
		System.out.println("작성완료");
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
