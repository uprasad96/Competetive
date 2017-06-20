package codechef;

import java.util.Scanner;

public class receipt {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int p = scn.nextInt();
			System.out.println(Receipt(p));
		}
	}

	public static int Receipt(int n) {
		if (n == 0)
			return 0;
		int i = 0;
		while (Math.pow(2, i + 1) <= n && i + 1 < 12) {
			i++;
		}
		n -= Math.pow(2, i);
		return 1 + Receipt(n);
	}

}
