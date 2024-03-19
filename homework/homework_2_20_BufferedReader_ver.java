package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class homework_2_20_BufferedReader_ver {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//1번 문제
		
//		int a =Integer.parseInt(br.readLine());
//		
//	if(a>10) {
//		System.out.println(a);
//		System.out.println("10보다 큰 수를 입력하셨습니다.");
//	}else {
//		System.out.println(a);
//	}

		
		//2번 문제
		int a =Integer.parseInt(br.readLine());
		
		if(a<0) {
			System.out.println(a);
			System.out.println("minus");
		}else{
			System.out.println(a);
		}
		
		
		
	}

}
