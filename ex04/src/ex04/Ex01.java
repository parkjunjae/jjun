package ex04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {  
		int input;

		System.out.print("숫자를 입력하세요");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");	
		}

		else(input!=0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");		
			System.out.println("�Է��Ͻ� ���ڴ� "+ input +"�Դϴ�.");
	} // main�� ��
}
