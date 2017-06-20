import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class triplets {
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
	public static final long d = 1000000007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int i = 0; i < T; i++) {
			int p = scn.nextInt();
			int q = scn.nextInt();
			int r = scn.nextInt();

			long[] A = new long[p];
			long[] B = new long[q];
			long[] C = new long[r];

			for (int l = 0; l < p; l++)
				A[l] = scn.nextLong();
			for (int m = 0; m < q; m++)
				B[m] = scn.nextLong();
			for (int n = 0; n < r; n++)
				C[n] = scn.nextLong();

			quick_sort(A, 0, A.length - 1);
			quick_sort(B, 0, B.length - 1);
			quick_sort(C, 0, C.length - 1);

			long sum = 0, sumX = 0, sumZ = 0, countX = 0, countZ = 0;
			int stX = -1, stZ = -1;
			for (int m = 0; m < q; m++) {
				for (int l = stX + 1; l < p && A[l] <= B[m]; l++) {
					sumX += A[l];
					countX++;
					stX = l;
				}
				for (int n = stZ + 1; n < r && C[n] <= B[m]; n++) {
					sumZ += C[n];
					countZ++;
					stZ = n;
				}
				sum += (((countX % d * B[m] % d) % d + sumX % d) % d * ((countZ % d * B[m] % d) % d + sumZ % d) % d)
						% d;
			}
			System.out.println(sum % d);
		}
	}

	public static void quick_sort(long[] arr, int lo, int hi) {

		if (lo >= hi)
			return;

		int mid = (lo + hi) / 2;
		long pivot = arr[mid];

		int left = lo;
		int right = hi;

		while (left <= right) {

			while (arr[left] < pivot) {

				left++;
			}
			while (arr[right] > pivot) {

				right--;
			}
			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		quick_sort(arr, lo, right);
		quick_sort(arr, left, hi);
	}

	public static void swap(long[] arr, int i, int j) {
		long temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}