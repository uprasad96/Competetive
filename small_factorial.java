package codechef;

import java.util.HashMap;
import java.util.Scanner;

public class small_factorial {
	public static Scanner scn = new Scanner(System.in);
	public static HashMap<Long, Long> facs = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			factorial(n);
			System.out.println();
		}
	}

	public static void factorial(int n) {
		int arr[] = new int[200];
		int size = 1;
		arr[0] = 1;
		int i = 1;
		int temp = 0;
		int j;
		while (i <= n) {
			for (j = 0; j < size; j++) {
				int x = arr[j] * i + temp;
				arr[j] = x % 10;
				temp = x / 10;
			}
			while (temp != 0) {
				int x = temp % 10;
				arr[j] = x;
				j++;
				temp = temp / 10;
				size++;
			}
			i++;
		}

		for (int k = size - 1; k >= 0; k--) {
			System.out.print(arr[k]);
		}
	}

}
