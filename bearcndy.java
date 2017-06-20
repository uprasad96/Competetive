package codechef;

import java.util.Scanner;

public class bearcndy {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int limLimit = scn.nextInt();
			int bobLimit = scn.nextInt();
			int limTurn = 0, bobTurn = 0;
			int limSum = 0, bobSum = 0;
			for (int i = 1; limSum + i <= limLimit; i += 2) {
				limTurn++;
				limSum += i;
			}
			for (int i = 2; bobSum + i <= bobLimit; i += 2) {
				bobTurn++;
				bobSum += i;
			}
			if (limTurn <= bobTurn)
				System.out.println("Bob");
			else
				System.out.println("Limak");
		}
	}

}
