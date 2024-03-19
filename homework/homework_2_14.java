package homework;

import java.util.Scanner;

public class homework_2_14 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	
// 과제1
	
//		int car_height =170;
//		
//		int terminal_1 = sc.nextInt();
//		int terminal_2 = sc.nextInt();
//		int terminal_3 = sc.nextInt();
//				
//		if((car_height<terminal_1)&&
//				(car_height<terminal_2)&&
//				(car_height<terminal_3)){
//			System.out.println("pass");
//		}else {
//			System.out.println("crash");
//		}
//	}

	
//과제 2
	
//	int grade = sc.nextInt();
//	
//	if(grade>=90) {
//		System.out.println("A");
//		}else if(grade>=80) {
//		System.out.println("B");
//		}else if(grade>=70) {
//			System.out.println("C");
//		}else if(grade>=60) {
//		System.out.println("D");
//		}else{
//			System.out.println("F");
//		}
//	}
	
	
//과제 3
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	if(A>B) {
		System.out.println(">");
	}else if(A<B) {
		System.out.println("<");
	}else {
		System.out.println("==");
	}
}	
}



