package codechef;

import java.util.HashMap;
import java.util.Scanner;

public class La_liga {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			HashMap<String, Integer> scores = new HashMap<>();
			for (int i = 0; i < 4; i++) {
				String team;
				int goal;
				team = scn.next();
				goal = scn.nextInt();
				scores.put(team, goal);
			}
			int barca = scores.get("Barcelona");
			int eibar = scores.get("Eibar");
			int madrid = scores.get("RealMadrid");
			int malaga = scores.get("Malaga");
			if (madrid < malaga && barca > eibar)
				System.out.println("Barcelona");
			else
				System.out.println("RealMadrid");
		}
	}
}
