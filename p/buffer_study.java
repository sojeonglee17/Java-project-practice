package day5_2;

import java.io.BufferedReader;//^^외워...
import java.io.InputStreamReader;//외워...
import java.io.IOException;

public class buffer_study {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//int 변수명 =Integer.parseInt
		
		
	/*	int a=Integer.parseInt(br.readLine());//입력
		System.out.println(a);//출력
		*/
		
/*나이 입력
		
		System.out.println("당신의 나이는 몇 살 입니까? ");
		int age=Integer.parseInt(br.readLine());
	
		System.out.println("당신은 "+age+"살 입니다.");	
		
*/

		
/*		System.out.print("사과 : ");
		int apple =Integer.parseInt(br.readLine());
		System.out.print("복숭아 : ");
		int peach =Integer.parseInt(br.readLine());
		
	System.out.println("[쇼핑 리스트]");
	System.out.println("사과 : "+apple);
	System.out.print("복숭아 : "+peach);	
*/
		
/*	System.out.println("[1반 학생들의 나이]");
		System.out.print("1번 학생 : ");
		int age1=Integer.parseInt(br.readLine());
		System.out.print("2번 학생 : ");
		int age2=Integer.parseInt(br.readLine());
		System.out.print("3번 학생 : ");
		int age3=Integer.parseInt(br.readLine());
		
		System.out.println();
		System.out.println("학생들은 총 3명");
		System.out.println("1번 학생의 나이는 "+age1);
		System.out.println("2번 학생의 나이는 "+age2);
		System.out.println("3번 학생의 나이는 "+age3);
		
*/
		
		//실수 입력받기
		//double 변수명 =Double.paraseDouble(br.readLine));
		//float 변수명=Float.parseFolat(br.readLine());
		
/*		double a =Double.parseDouble(br.readLine());
		System.out.println(a);
*/		

		System.out.print("Tom height : ");
		double height=Double.parseDouble(br.readLine());
		System.out.print("Tom weight : ");
		double weight=Double.parseDouble(br.readLine());
		
		System.out.println();
		System.out.println("Tom List");
		System.out.println("heigt : "+height);
		System.out.println("whight : "+weight);
		
	}

}
