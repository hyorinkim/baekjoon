package bakjoon1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=1&&n<=100) {
			for(int i=0; i<n;i++) {
				for(int j=0;j<i+1;j++ ) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	
	}

}
