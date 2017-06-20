package codechef;

import java.util.Scanner;

public class beauty_crayon {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			String crayons = scn.next();
			int i = 0;
			int consecU = 0;
			int consecD = 0;
			while (i < crayons.length()) {
				boolean Upres = false;
				boolean Dpres = false;
				while (i < crayons.length() && crayons.charAt(i) == 'U') {
					i++;
					Upres = true;
				}
				if (Upres)
					consecU++;
				while (i < crayons.length() && crayons.charAt(i) == 'D') {
					i++;
					Dpres = true;
				}
				if (Dpres)
					consecD++;
			}
			System.out.println(Math.min(consecU, consecD));
		}
	}

}
