package chapter15;

import java.net.MalformedURLException;
import java.net.URL;

public class URLtest {
	
	public static void main(String[] args) {
	
		String urlStr = "https://entertain.naver.com/read?oid=311&aid=0001509170";
		
		try {
			URL url = new URL(urlStr);
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getFile());
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
