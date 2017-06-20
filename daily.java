package codechef;

import java.util.Scanner;

public class daily {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			String str = scn.next();
			int[] routine = new int[str.length()];
			for (int i = 0; i < routine.length; i++) {
				char curr = str.charAt(i);
				if (curr == 'C')
					routine[i] = 1;
				else if (curr == 'E')
					routine[i] = 2;
				else
					routine[i] = 3;
			}
			String out = "yes";
			for (int i = 0; i < routine.length - 1; i++) {
				int d = routine[i + 1] - routine[i];
				if (!(d == 0 || d == 1 || d == 2)) {
					out = "no";
					break;
				}
			}
			System.out.println(out);
		}

	}

}
