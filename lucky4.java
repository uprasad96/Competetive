package codechef;

import java.util.Scanner;

public class lucky4 {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int num = scn.nextInt();
			int count = 0;
			while (num != 0) {
				int rem = num % 10;
				if (rem == 4)
					count++;
				num = num / 10;
			}
			System.out.println(count);

		}
	}

}
