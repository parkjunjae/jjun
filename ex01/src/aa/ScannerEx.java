package aa;


import java.util.*;    // Scanner�� ����ϱ� ���� �߰�

class ScannerEx { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.");

		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ

		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n", num);
	} 
}
