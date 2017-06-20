package codechef;

import java.util.Scanner;

public class teamform {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			for (int i = 0; i < m; i++) {
				int a = scn.nextInt();
				int b = scn.nextInt();
			}
			if (n % 2 == 0)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

}
