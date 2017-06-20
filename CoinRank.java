import java.util.Scanner;

public class CoinRank {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			long U = scn.nextLong();
			long V = scn.nextLong();
			long n=U+V+1;
			long rank=((n*n)-n+2)/2;
			System.out.println(rank+U);
		}
	}
}
