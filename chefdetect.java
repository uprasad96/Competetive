package codechef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class chefdetect {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		Set<Integer> All = new HashSet<>();
		for (int i = 0; i <= N; i++) {
			All.add(i);
		}
		for (int i = 0; i < N; i++) {
			int R = scn.nextInt();
			All.remove(R);
		}
		ArrayList<Integer> S = new ArrayList<>();
		S.addAll(All);
		Collections.sort(S);
		for (int i : S)
			System.out.print(i+" ");
	}

}
