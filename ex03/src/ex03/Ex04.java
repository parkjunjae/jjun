package ex03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		int input = 15;
//		System.out.println(a < input && b > input);
//		System.out.println(30%5==0 || 30%7==0);

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char str[] = a.toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] > 90)
				str[i] = (char) (str[i] - 32);
			else
				str[i] = (char) (str[i] + 32);
		}
		System.out.println(new String(str));

	}

}
