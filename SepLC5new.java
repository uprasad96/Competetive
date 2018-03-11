import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static FastReader scn = new FastReader();

	public static HashMap<Integer, long[]> Map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int N = scn.nextInt();
			int M = scn.nextInt();
			int[][] Comds = new int[M][3];
			for (int i = 0; i < M; i++) {
				Comds[i][0] = scn.nextInt();
				Comds[i][1] = scn.nextInt();
				Comds[i][2] = scn.nextInt();
				Comds[i][1]--;
				Comds[i][2]--;
			}
			long[] result = new long[N];
			for (int i = 0; i < M; i++) {
				long[] temp = execute(Comds, i, N);
				for (int j = 0; j < N; j++) {
					result[j] += temp[j];
					result[j] = result[j] % 1000000007;
				}
			}
			for (int i = 0; i < N; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
			Map.clear();

		}

	}

	private static long[] execute(int[][] Comds, int ind, int size) {
		if (Map.containsKey(ind)) {
			return Map.get(ind);
		}
		long[] rv = new long[size];
		if (Comds[ind][0] == 1) {
			for (int i = Comds[ind][1]; i <= Comds[ind][2]; i++) {
				rv[i]++;
				if (rv[i] == 1000000007) {
					rv[i] = 0;
				}
			}
		} else {
			for (int i = Comds[ind][1]; i <= Comds[ind][2]; i++) {
				long[] temp = execute(Comds, i, size);
				for (int j = 0; j < size; j++) {
					rv[j] += temp[j];
					rv[j] = rv[j] % 1000000007;
				}
			}
		}
		Map.put(ind, rv);
		return rv;
	}
}
