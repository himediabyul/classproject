package chapter12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) {

		String str = "kim\n";
		char ch = 'A';
		char[] charArr = { 'B', 'C', 'D' };

		Writer writer = null;

		try {
			writer = new FileWriter("c:\\test\\text1.txt");

			writer.write(str);
			writer.write(ch);
			writer.write(charArr);

			System.out.println("파일에 텍스트 문자열 쓰기 완료");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
