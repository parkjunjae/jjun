package ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 출력");
		String str = scan.next();
		System.out.println("반복횟수 입력");
		int i = scan.nextInt();

		System.out.println("str =" + str);
		System.out.println("i =" + i);
		
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
			
		}
	

	}
}
