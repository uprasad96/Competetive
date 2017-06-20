package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class quentin {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int n = scn.nextInt();
			System.out.println(print(n));

		}
	}

	public static String print(int n) {

		int chap[] = new int[n];
		int temp[] = new int[n];
		for (int i = 0; i < n; i++) {
			chap[i] = scn.nextInt();
			temp[i] = chap[i];
		}
		Arrays.sort(temp);
		boolean flag = true;
		boolean order = false;
		for (int i = 0; i < n; i++) {
			if (temp[i] != i + 1) {
				flag = false;
				break;
			}
			if (chap[i] != temp[i] && !flag)
				order = true;
		}
		if (flag && order)
			return "YES";
		else
			return "NO";

	}
}
