package baekjoon2;

import java.util.Scanner;

public class decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strBuffer =new StringBuffer();
		
		Scanner sc= new Scanner(System.in);
		String s;
		 String st="";
		do {
			s= sc.nextLine();
			if(s.length()<=500) {
				strBuffer.append(s);
				st=""+strBuffer.reverse();
				strBuffer.delete(0,st.length());
				if(st.equals("DNE")) {
					break;
				}
				System.out.println(st);
			}
		}while(true);
		
	}

}
