package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class notcommon {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[] A = new int[n];
			int[] B = new int[m];
			for (int i = 0; i < n; i++) {
				A[i] = scn.nextInt();
			}
			for (int i = 0; i < m; i++) {
				B[i] = scn.nextInt();
			}
			Arrays.sort(B);
			int throwaway=0;
			for(int i=0;i<n;i++){
				if(Arrays.binarySearch(B, A[i])>=0)
					throwaway++;
			}
			System.out.println(throwaway);
		}

	}

}
