package baekjoon3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n >= 0 && n <= 100) {
			for (int i = 0; i < n; i++) {
				for (int j = n-1; j >i; j--) {
					System.out.print(" ");
				}
				for (int w = 0; w <= i; w++) {
					System.out.print("*");
				}
				System.out.println("");
			}

		}
	}

}
