package baekjoon2;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		if(n>=1&&n<=9) {
			for(int i=1;i<10;i++) {
				System.out.println(n+" * "+i+" = "+n*i);
			}
		}
	}

}
