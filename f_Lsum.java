package codechef;

import java.util.Scanner;

public class f_Lsum {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T=scn.nextInt();
		for(int t=0;t<T;t++){
			String num=scn.next();
			int f=num.charAt(0);
			int l=num.charAt(num.length()-1);
			System.out.println(f+l-96);
		}
	}
}
