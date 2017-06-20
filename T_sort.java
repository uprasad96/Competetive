package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class T_sort {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		int arr[] = new int[t];
		for(int i=0;i<t;i++){
			arr[i]=scn.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<t;i++){
			System.out.println(arr[i]);
		}
	}

}
