package codechef;

import java.util.ArrayList;
import java.util.Scanner;

public class bearsegm {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			String str = scn.next();
			ArrayList<Integer> al = new ArrayList<>();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '1')
					al.add(i);
			}
			String rv = "YES";
			for (int i = 1; i < al.size(); i++) {
				if (al.get(i) != al.get(i - 1) + 1) {
					rv = "NO";
					break;
				}
			}
			if (al.size() == 0)
				rv = "NO";
			System.out.println(rv);
		}
	}

}
