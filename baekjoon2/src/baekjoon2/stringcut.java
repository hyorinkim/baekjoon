package baekjoon2;

import java.util.Scanner;

public class stringcut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();// 문자 입력
		if (s.length() <= 100) {
			//System.out.println(s.substring(0, 10));
			for ( i = 0; i < s.length() / 10; i++) {
				System.out.println(s.substring(i*10,(i+1)*10));
			}
			System.out.println(s.substring((i)*10,s.length()));
		}

	}

}
