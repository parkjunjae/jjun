package ex03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,v;
		n=sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		v=sc.nextInt();
		int cnt=0;
		for(int i = 0; i<n; i++) {
			if(arr[i] == v) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}

}