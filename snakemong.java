package codechef;

import java.util.Scanner;

public class snakemong {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			String str;
			str = scn.next();
			StringBuilder sb = new StringBuilder(str);
			int s = 0, m = 0;
			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) == 'm') {
					if (i > 0 && sb.charAt(i - 1) == 's') {
						sb.setCharAt(i - 1, 'o');
					} else if (i < sb.length() - 1 && sb.charAt(i + 1) == 's') {
						sb.setCharAt(i + 1, 'o');
					}
				}
			}

			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) == 'm')
					m++;
				if (sb.charAt(i) == 's')
					s++;
			}
			if (s > m)
				System.out.println("snakes");
			else if (m > s)
				System.out.println("mongooses");
			else
				System.out.println("tie");

		}
	}

}

