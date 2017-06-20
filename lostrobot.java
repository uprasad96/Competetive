package codechef;

import java.util.Scanner;

public class lostrobot {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int x1 = scn.nextInt();
			int y1 = scn.nextInt();
			int x2 = scn.nextInt();
			int y2 = scn.nextInt();
			int x = x2 - x1;
			int y = y2 - y1;
			if (x == 0 && y > 0)
				System.out.println("up");
			else if (x == 0 && y < 0)
				System.out.println("down");
			else if (y == 0 && x > 0)
				System.out.println("right");
			else if (y == 0 && x < 0)
				System.out.println("left");
			else
				System.out.println("sad");
		}
	}
}
