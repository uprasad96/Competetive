package codechef;

import java.util.Scanner;

public class lead_game {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R = scn.nextInt();
		int one[] = new int[R];
		int two[] = new int[R];
		for (int i = 0; i < R; i++) {
			one[i] = scn.nextInt();
			two[i] = scn.nextInt();
		}
		int MaxLead1 = Integer.MIN_VALUE;
		int MaxLead2 = Integer.MIN_VALUE;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < R; i++) {
			sum1 += one[i];
			sum2 += two[i];
			int lead1 = sum1 - sum2;
			if (lead1 > MaxLead1)
				MaxLead1 = lead1;
			int lead2 = sum2 - sum1;
			if (lead2 > MaxLead2)
				MaxLead2 = lead2;
		}
		if (MaxLead1 > MaxLead2)
			System.out.println(1 + " " + MaxLead1);
		else
			System.out.println(2 + " " + MaxLead2);
	}

}
