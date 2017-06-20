package codechef;

import java.util.Scanner;

public class sumdigit {
public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T =scn.nextInt();
		for(int t=0;t<T;t++){
			int N=scn.nextInt();
			System.out.println(digitsum(N));
		}
	}
	public static int digitsum(int n){
		int sum=0;
		while(n!=0){
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

}
