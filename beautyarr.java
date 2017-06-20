package codechef;

import java.util.HashMap;
import java.util.Scanner;

public class beautyarr {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int n = scn.nextInt();
			for (int i = 0; i < n; i++) {
				map.put(scn.nextInt(), 1);
			}
			System.out.println(isBeautiful(map));
		}
	}

	public static String isBeautiful(HashMap<Integer, Integer> map) {
		for (int i : map.keySet()) {
			for (int j : map.keySet()) {
				if (j == i)
					continue;
				if (!map.containsKey(map.get(i) * map.get(j))) {
					return "no";
				}
			}
		}
		return "yes";
	}
}