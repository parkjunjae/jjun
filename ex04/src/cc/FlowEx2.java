package cc;

import java.util.Scanner; // ScannerŬ������ ����ϱ� ���� �߰�

class FlowEx2 {
	public static void main(String[] args) {
		int input;

		System.out.println("숫자를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		if (input == 0) {
			System.out.println("입력하신 숫자는 0 입니다.");
		}

		if(input != 0){
		System.out.println("입력하신 숫자는 0이 아닙니다.");
		System.out.println("입력하신 숫자는" + input+ "입니다.");
			}	
		} // main�� ��
}
