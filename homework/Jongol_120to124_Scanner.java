package homework;

import java.util.Scanner;

public class Jongol_120to124_Scanner {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
	//120
		//두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
		
//
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//
//		if(a>b){
//		System.out.println(a-b);
//		}else {
//		System.out.println(b-a);
//		}
		
		
	//121
		//정수를 입력받아 0이면 "zero" 양수이면 "plus" 음수이면 "minus"라고 출력하는 프로그램을 작성하시오.
		
//		int a = sc.nextInt();
//
//		if(a==0){
//		System.out.println("zero");
//		}else if(a>0){
//		System.out.println("plus");
//		}else if(a<0){
//		System.out.println("minus");
//		}
		
	//122
		//년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.

		//*윤년>4년마다 돌아옴

		
//		int year = sc.nextInt();
//
//		if(year%4==0){
//		System.out.println("leap year");
//		}else {
//		System.out.println("common year");
//		}
		
		
	//123
		//1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오.
		//해당 번호가 없으면 "I don't know."라고 출력한다.

//		개-dog
//		고양이-cat
//		병아리-chick 


//		System.out.print("Number?");
//
//		int a = sc.nextInt();
//
//		if(a==1){
//		System.out.println("dog");
//		}else if(a==2){
//		System.out.println("cat");
//		}else if(a==3){
//		System.out.println("chick");
//		}else{
//		System.out.println("I don't know.");
//		}

		//124
		//1~12사이의 정수를 입력받아 평년의 경우 입력받은 월의 날수를 출력하는 프로그램을 작성하시오.
	
//			String month = sc.nextLine();
//			
//			switch(month){
//			case "1":
//			case "3" :
//			case "5" :
//			case "7" :
//			case "8" :
//			case "10" :
//			case "12" : System.out.println("31");
//				break;
//			
//			case "2" : System.out.println("28");
//				break;
//				
//			case "4" :
//			case "6" :
//			case "9" :
//			case "11" : System.out.println("30");
//				break;
//		}
		
//		char c1 = sc.next().charAt(0);
//		
//		if(c1=='A') {
//			System.out.println("best!!!");
//		}else if(c1=='B') {
//			System.out.println("good!!!");
//		}else if(c1=='C') {
//			System.out.println("run!");
//		}else if(c1=='D') {
//			System.out.println("slowly~");
//		}else {
//			System.out.println("what?");
//		}

		
//		double grade =sc.nextDouble();
//		
//		switch((int)grade){
//		case 4 :
//			System.out.println("scholarship");
//			break;
//		case 3 :
//			System.out.println("next semester");
//			break;
//		case 2 :
//			System.out.println("seosonal semester");
//			break;
//		default :
//			System.out.println("retake");
//			
//			break;
//		}
		

//		
//		System.out.println("1.삽입");
//		System.out.println("2.수정");
//		System.out.println("3.삭제");
//		System.out.println("숫자를 입력하세요");
//		
//		int a =sc.nextInt();
//		
//	switch(a) {
//	case 1 : 
//		System.out.println("1.삽입");
//		break;
//	case 2 :
//		System.out.println("2.수정");
//		break;
//	case 3 :
//		System.out.println("3.삭제");
//		break;
//	}
	
	int a =sc.nextInt();
	
	if(a==0){
		System.out.println("zero");
	}else{
		System.out.println(a>0 ? "plus" : "minus");
	}
		sc.close();
	}

}
