package bakjoon1;

import java.util.Scanner;

public class cal_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
		Scanner sc= new Scanner (System.in);
		int A =sc.nextInt();
		int B =sc.nextInt();
		int C =sc.nextInt();
		
		int sum=0, first=0 ;
		int [] count;
		count =new int [10];
		
		sum=A*B*C;
		String s=""+sum;
		for(int i=0; i<s.length();i++) {
			first=Integer.parseInt(s.substring(i,i+1));
			switch(first) {
			case 0: count[0]++;
			     break;
			case 1: count[1]++;
		     break;
			case 2: count[2]++;
		     break;
			case 3: count[3]++;
		     break;
			case 4: count[4]++;
		     break;
			case 5: count[5]++;
		     break;
			case 6: count[6]++;
		     break;
			case 7: count[7]++;
		     break;
			case 8: count[8]++;
		     break;
			case 9: count[9]++;
		     break;
			}
		}
		for(int i=0; i<10;i++) {
			System.out.println(count[i]);
		}
	}
}
