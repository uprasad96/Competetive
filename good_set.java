import java.util.ArrayList;
import java.util.Scanner;

public class good_set {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int i = 0; i < T; i++) {
			int n = scn.nextInt();
			ArrayList<Integer> goodSet = new ArrayList<>();
			ArrayList<Integer> temp = new ArrayList<>();
			for (int k = 1; k <= 500; k++) {
				if (!temp.contains(k)) {
					int sz=goodSet.size();
					for (int m = 0; m < sz; m++) {
						temp.add(k + goodSet.get(m));
					}
					temp.add(k);
					goodSet.add(k);
					if (goodSet.size() == n)
						break;
				}
			}
			for(int j=0;j<goodSet.size();j++)
				System.out.print(goodSet.get(j)+" ");
			System.out.println();
		}
	}
}
