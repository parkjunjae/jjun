package ex02;

public class Ex01 {

	public static void doA() {
		int c = 30;
		int d = 40;
		System.out.println(c + d);
	}

	public static void main(String[] args) {

		final int a = 10;
		final int b = 20;
		System.out.println(a + b);

	doA();
		System.out.println("종료됩니다.");
		// 아래 구문을 먼저 출력 doA 구문을 해석
	}
}
