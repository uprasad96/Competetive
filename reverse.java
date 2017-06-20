package codechef;

import java.util.Scanner;

public class reverse {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int num = scn.nextInt();
			int rev = 0;
			while (num != 0) {
				int rem = num % 10;
				rev = (10 * rev) + rem;
				num = num / 10;
			}
			System.out.println(rev);
		}
	}
}
