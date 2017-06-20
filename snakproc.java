package codechef;

import java.util.Scanner;

public class snakproc {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int L = scn.nextInt();
			String report = scn.next();
			String O = "Valid";
			int i = 0;
			char shudbe = 'H';
			int hds=0;
			int tls=0;
			while (i < L) {
				char curr=report.charAt(i);
				if (curr == '.') {
					i++;
				} 
				else if (curr == shudbe) {
					if (shudbe == 'H') {
						hds++;
						shudbe = 'T';
						i++;
					} 
					else {
						tls++;
						shudbe = 'H';
						i++;
					}
				} 
				else {
					O= "Invalid";
					break;
				}
			}
			if(hds==tls)
				System.out.println(O);
			else
				System.out.println("Invalid");
		}
	}

}
