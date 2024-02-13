package day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class day8_BufferedReader_Restudy {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());

		System.out.println("두 수를 입력하시오.");
		System.out.flush();
		int a =Integer.parseInt(st.nextToken());
		int b =Integer.parseInt(st.nextToken());
System.out.println(a+" + "+b+" = "+(a+b));
System.out.println(a+" * "+b+" = "+(a*b));




	}

}

