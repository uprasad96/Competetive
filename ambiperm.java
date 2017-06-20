package codechef;

import java.util.Scanner;

public class ambiperm {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			int n = scn.nextInt();
			if (n == 0)
				break;
			else {
				int arr[] = new int[n];
				int temp[] = new int[n];
				for (int i = 0; i < n; i++) {
					arr[i] = scn.nextInt() - 1;
					temp[i] = arr[i];
				}
				inverse(arr, 0);
				boolean ambi = true;
				for (int i = 0; i < n; i++) {
					if (arr[i] != temp[i]) {
						ambi = false;
						break;
					}
				}
				if(ambi==false)
					System.out.println("not ambiguous");
				else
					System.out.println("ambiguous");

			}
		}

	}

	public static void inverse(int[] arr, int si) {
		if (si == arr.length)
			return;
		int temp = arr[si];

		inverse(arr, si + 1);

		arr[temp] = si;

	}

}
