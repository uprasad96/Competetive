package codechef;

import java.util.Scanner;

public class gcd_lcm {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long T = scn.nextLong();
		for (long t = 0; t < T; t++) {
			long A = scn.nextLong();
			long B = scn.nextLong();
			long dvdnd, dvsr;
			if (A > B) {
				dvdnd = A;
				dvsr = B;
			} else {
				dvdnd = B;
				dvsr = A;
			}
			long rem=dvdnd%dvsr;
			while(rem!=0){
				rem=dvdnd%dvsr;
				dvdnd=dvsr;
				dvsr=rem;
			}
			System.out.println(dvdnd+" "+(A*B)/dvdnd);

		}
	}

}
