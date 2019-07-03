package baekjoon3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		if((line.length()+1) % 2 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
