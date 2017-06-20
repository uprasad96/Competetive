package codechef;

import java.util.Scanner;

public class cupcake {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int n = scn.nextInt();
			System.out.println(n / 2 + 1);
		}
	}
}
