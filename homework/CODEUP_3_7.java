package homework_3_7;

import java.util.Scanner;

public class CODEUP_3_7 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		
		//1151
//		10보다 작은 수가 입력되면 small 을 출력, 10이상이면 아무것도 출력하지 마시오.
//		
//		int a = sc.nextInt();
//		
//		if(a<10) {
//			System.out.println("small");
//		}
		
		//1152
//		10보다 작은 정수가 입력되면 small 을 출력, 그 이상의 수가 입력되면 big 을 출력하시오.
//		
//		int a = sc.nextInt();
//		
//		if(a<10) {
//			System.out.println("small");
//		}else {
//			System.out.println("big");
//		}
		
		
		//1153
		
//		두 정수가 입력된다. 두 정수의 크기를 비교하여 왼쪽 수가 크면 > 를 출력, 오른쪽 수가 크면 < 를 출력, 같으면 = 을 출력하시오.
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if(a>b) {
//			System.out.println(">");
//		}else if(a<b) {
//			System.out.println("<");
//		}else {
//			System.out.println("=");
//		}
		
				
//		1154
//		정수 두개가 입력으로 들어오면 큰수 - 작은수의 값을 출력하시오.
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		if(a>b) {
//			System.out.println(a-b);
//		}else {
//			System.out.println(b-a);
//		}
		
//		1155
//		인학이는 숫자 7을 좋아한다.
//		어떤 정수가 입력되면 그 수가 7의 배수인지 확인하시오.
//		7의 배수일 경우 multiple를 출력하고, 7의 배수가 아니면 not multiple을 출력하시오.
//	
//		int i = sc.nextInt();
//		
//		if(i%7==0) {
//			System.out.println("multiple");
//		}else {
//			System.out.println("not multiple");
//		}
		
		
		//1156
//		용준이와 봉찬이는 공기 놀이로 내기를 하였다.
//		만약 홀수개의 돌을 쥐게 되면 용준이가 이기게 되고, 짝수개의 돌을 쥐게 되면 봉찬이가 이기는 것으로 룰을 정하였다.
//		어떤 자연수가 입력되면  홀수이면 "odd"을 출력하고, 짝수이면 "even"을 출력하시오.
//	
//	
//		int x = sc.nextInt();
//			
//		
//		if(x%2!=0) {
//			System.out.println("odd");
//		}else {
//			System.out.println("even");
//		}
	
	
	
		//1157
//	슬기는 체육 선생님과 공던지기로 아이스크림 내기를 하게 됐다.
//	공을 던져서 50m ~ 60m 사이에 공이 들어가면 슬기가 이기게 되고, 그 외에 공이 떨어지면 체육선생님이 이기게 룰을 정했다.
//	슬기가 던진 공의 위치가 입력으로 주어지면 50이상 60이하이면 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.
//	슬기가 던진 공의 위치가 입력으로 주어진다.(실수)
//
//		double ball = sc.nextDouble();
//		
//		if(ball>=50&&ball<=60) {
//			System.out.println("win");
//		}else {
//			System.out.println("lose");
//		}
	
	
		//1158
//	슬기는 지난 번 공 던지기에서 져서 아이스크림을 사게되었다.
//	얼마 뒤 열받은 슬기는 체육 선생님에게 다시 한번 공던지기를 하여 아이스크림 내기를 하자고 제안하였다.
//	그런데 이번에는 불리한 슬기가 다음 룰을 제안하였다.
//
//	1. 공이 30m~40m나 60m~70m 에 들어오면 슬기가 이김.
//	2. 그 외의 구간에 떨어지면 체육선생님이 이김.
//
//	슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.
//	공의 위치 
//	n이 정수로 입력됨.(이번에는 정수로 입력됨)
//	공이 떨어지는 위치 n이 30≤n≤40이거나 60≤n≤70이면, win을 출력, 그외에는 lose를 출력한다.
	 
		int n =sc.nextInt();
		
		if((n>=30&&n<=40)||(n>=60&&n<=70)){
			 System.out.println("win");
			}else{
				System.out.println("lose");
			}
	 
	 
	 	//1159
//	 슬기는 지난 번에도 공던지기에 져서 아이스크림을 사게되었다.
//	 슬기는 이미 돈이 다 떨어져서 현량이에게 돈을 빌린 상태이다.
//	 이번에는 슬기가 또 다른 조건을 내걸고 체육 선생님에게 도전하게 되었다.
//	 1. 공의 위치가 50m~70m이면 슬기가 이김.
//	 또는
//	 2. 공의 위치가 6의 배수이면 슬기가 이김. 
//	 슬기가 던진 공의 위치가 입력으로 주어지면 슬기가 이기는 구간에는 "win"을 출력하고, 그 외에는 "lose"를 출력하시오.
//	 
//	 슬기가 던진 공의 위치가 입력된다.(정수)
//	 승리 조건을 잘 보고 슬기가 이기는 조건이면 win, 그외에는 lose를 출력하시오.
	
//		int ball = sc.nextInt();
//		
//		if((ball>=50&&ball<=70)||(ball%6==0)) {
//			System.out.println("win");
//		}else {
//			System.out.println("lose");
//		}
	
	
	
	
	 	//1160
//	 주원이는 월, 수, 금, 일 아르바이트를 간다.
//	 다음은 요일의 순서이다.
//
//	1. 월요일
//	2.화요일
//	3.수요일
//	4.목요일
//	5.금요일
//	6.토요일
//	7.일요일
//	 요일의 번호가 입력으로 주어지면 그 날이 아르바이트 가는 날이면 "oh my god"를 가는 날이 아니면 "enjoy"를 출력하시오.
	 
//	int day = sc.nextInt();
//	
//	switch(day) {
//	case 1 :case 3:case 5:case 7:
//		System.out.println("oh my god");
//			break;
//	case 2: case 4:case 6:
//		System.out.println("enjoy");
//			break;
//	}
	
	
	
	}

}
