package chapter12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTransferTest2 {

	public static void main(String[] args) {

		// 파일 복사
		// 특정 파일의 데이터를 읽어서 다른 위치에 파일을 쓰면 -> 복사

		// 원본파일
		InputStream in = null;
		// 복사본 파일
		OutputStream out = null;
		
		int copyByte = 0; //총 복사한 데이터 사이즈
		int byteDataSize = 0;
		byte[] bufData = new byte[1024];
		
		try {
			in = new FileInputStream("c:\\test\\test.zip");
			out = new FileOutputStream("c:\\test\\testCopy2.zip");
			
			System.out.println("복사가 시작되었습니다.");

			while (true) {

				byteDataSize = in.read(bufData);

				if (byteDataSize == -1) {
					break;
				}

				out.write(bufData, 0, byteDataSize);
				copyByte += byteDataSize;
			}
			System.out.println("복사 완료");
			System.out.println("복사한 파일의 size : " + copyByte);

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
