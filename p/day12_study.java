package day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class day12_study {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
//
//	int i = Integer.parseInt(br.readLine());
//	
//	
//	if(i>10) {
//		System.out.println(i);
//		System.out.println("10보다 큰 수를 입력하셨습니다.");
//	}else{System.out.println(i);
//	}
//	
//	

//		int i = Integer.parseInt(br.readLine());
//		
//		if(i<0) {
//			System.out.println(i);
//			System.out.println("minus");
//		}else {
//			System.out.println(i);
//		}

		
//		int i =1;
//		int sum =0;//누적해서 넣어줄 
//		
//		
//		while(i<11) {
//			sum += i;//sum=sum+1;
//			i++;
//			
//			}
//			System.out.println("1부터 10까지의 합은 "+sum);			
		
		
//	}
	
//	while(true) {
//		System.out.println("숫자 입력 : ");
//		int n = Integer.parseInt(br.readLine());
//		
//	
//		if(n==0) {
//			System.out.println("입력된 숫자는 0 입니다.");
//			break;//반복문 즉시 탈출
//		}
//		}
//		
		
		
		//
//		int i =0; 
//		
//		while(i<11) {
//		if(i==4) {
//			break;
//		}else {
//			System.out.println(i);
//		}
//		i++;
//		}
		
		
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int a = Integer.parseInt(br.readLine());//안에다 써줘야 함
			if(a>=0) {
				System.out.println(a);
			}else {
				System.out.println("종료");
				break;
			}
		}
		
		
	}
	
}
