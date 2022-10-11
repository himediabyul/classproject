package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTransferTest1 {

	public static void main(String[] args) {

		// 파일 복사
		// 특정 파일의 데이터를 읽어서 다른 위치에 파일을 쓰면 -> 복사

		// 원본파일
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("c:\\test\\testfile2.txt");
			out = new FileOutputStream("c:\\test\\testfile2Copy.txt");

			while (true) {

				int data = in.read();
				System.out.println(data);
				System.out.println((char)data);
				

				if (data == -1) {
					break;
				}

				out.write(data);
			}
			System.out.println("복사 완료");

		} catch (FileNotFoundException e) {
			System.out.println("해당 경로에 파일이 존재하지않습니다.");
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			if (out != null) {try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			}
		}
	}
}
