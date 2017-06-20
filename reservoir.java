package codechef;

import java.util.Scanner;

public class reservoir {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itr = scn.nextInt();
		int m, n;
		int i = 1;
		while (i <= itr) {
			n = scn.nextInt();
			m = scn.nextInt();
			String[] str = new String[n];
			int j = 1;
			while (j <= n) {
				str[j] = scn.next();
				j++;
			}
			i++;
		}
	}

}
