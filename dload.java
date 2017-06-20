package codechef;

import java.util.Scanner;

public class dload {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int N = scn.nextInt();
			int K = scn.nextInt();
			int[] time = new int[N];
			int[] data = new int[N];
			for (int i = 0; i < N; i++) {
				time[i] = scn.nextInt();
				data[i] = scn.nextInt();
			}
			int TC = 0;
			int min = 0;
			int flag = 0;
			for (int i = 0; i < N; i++) {
				min += time[i];
				if (min > K) {
					if (flag == 0) {
						int rem = min - K;
						TC += rem * data[i];
						flag = 1;
					} else {
						TC += time[i] * data[i];
					}
				}
			}
			System.out.println(TC);
		}

	}

}
