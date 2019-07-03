package baekjoon3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int stn,sum=0,count=0;
		double percent,result=0;
		int score;
		int scorearray[];
		for (int i = 0; i < c; i++) {
			stn = sc.nextInt();
			sum=0;
			if (stn >= 1 && stn <= 1000) {
				scorearray = new int[stn];
				for (int j = 0; j < stn; j++) {
					
					score = sc.nextInt();
					if (score >= 0 && score <= 100) {
						scorearray[j] = score;
					}
					sum+=scorearray[j];
				}
				result=sum/stn;//평균
				count=0;
				for(int a=0;a<stn;a++) {
					if(scorearray[a]>result) {
						count++;
					}
				}
				percent=(double)count/stn;
				System.out.println(String.format("%.3f", percent*100)+"%");
			}

		}

	}

}
