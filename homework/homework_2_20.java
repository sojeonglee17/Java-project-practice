package homework;

import java.util.Scanner;


public class homework_2_20 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	
//	//1	번 문제
//	정수 2개를 입력받아서 큰 수와 작은 수를 차례로 
//	출력하는 프로그램을 작성하시오.
	
/*	int a = sc.nextInt();
	int b = sc.nextInt();
	
	if(a>b) {
		System.out.println("입력받은 두 수 중 큰 수는 "+a+"이고 "+"작은 수는 "+b+"입니다.");
	}else {
		System.out.println("입력받은 두 수 중 큰 수는 "+b+"이고 "+"작은 수는 "+a+"입니다.");
	}
	
	
*/	
	
//	or Max.math(a,b)사용
	
	
	//2번 문제
	
//	long a = sc.nextLong();
//	long b = sc.nextLong();
//	long c = sc.nextLong();

	
	//1번째 방법	
	
//	if(a%2==0) {
//		System.out.println(a);}
//	if(b%2==0) 
//	{System.out.println(b);}
//	if(c%2==0)
//	{System.out.println(c);}
	
	//2째 방법
//	if(a%2==0&&b%2==0&&c%2==0) {
//	System.out.println(a);
//	System.out.println(b);
//	System.out.println(c);
//	}else if(a%2==0&&b%2==0&&c%2!=0) {
//		System.out.println(a);
//		System.out.println(b);	
//	}else if(a%2==0&&b%2!=0&&c%2==0) {
//		System.out.println(a);
//		System.out.println(c);	
//	}else if(a%2!=0&&b%2==0&&c%2==0) {
//		System.out.println(b);
//		System.out.println(c);	
//	}
	
	
	
	//3번 문제
	
	
//	int a = sc.nextInt();
//	int b = sc.nextInt();
//	int c = sc.nextInt();
//	
//	
//	if(a%2==0) {
//		System.out.println("even");
//	}else {
//		System.out.println("odd");
//	}
//	
//	if(b%2==0) {
//		System.out.println("even");
//	}else {
//		System.out.println("odd");
//	}
//	
//	if(c%2==0) {
//		System.out.println("even");
//	}else {
//		System.out.println("odd");
//	}	
//	

	
	//4번 문제
	
	
//	int a = sc.nextInt();
//	
//	if(a<0) {
//		System.out.println("minus");
//		}else {
//		System.out.println("plus");
//		}
//	
//	if(a%2==0) {
//		System.out.println("even");
//	}else {
//		System.out.println("odd");
//	}
//	

	
	//5번 문제
	
//	int grade = sc.nextInt();
//	
//	if(grade>=90) {
//		System.out.println("A");
//	}else if(grade>=70) {
//		System.out.println("B");
//	}else if(grade>=40) {
//		System.out.println("C");
//	}else {
//		System.out.println("D");
//	}

	
	//	반복문 while 복습 문제
	//1
	
//	int i = 1;
//	int sum = 0;
//	
//	while(i<11) {
//		sum+=i;
//		i++;
//		}
//	

	
	//2
	
//	int i = 1;
//	
//	while(i<11) {
//		if(i==4) {
//			break;
//			}
//		System.out.println(i);
//		i++;
//	}
	
	//3
	
	
	
//	while(true) {
//		System.out.println("숫자 입력 : ");
//		int i =sc.nextInt();
//		
//		if(i>=0) {
//			System.out.println("입력된 숫자 : "+i);
//		}else {
//			System.out.println("종료");
//			
//			break;
//		}
//	}
	
	sc.close();
	}

}
