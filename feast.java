import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class feast {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = scn.nextInt();
		for (int t = 0; t < T; t++) {
			int N = scn.nextInt();
			long pSum = 0, pSize = 0, nSum = 0, tHp = 0;
			long[] Hp = new long[N];
			ArrayList<Long> Negs = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				Hp[i] = scn.nextLong();
				if (Hp[i] >= 0) {
					pSum += Hp[i];
					pSize++;
				} else {
					Negs.add(Hp[i]);
				}
			}
			long[] A = new long[Negs.size()];
			for (int i = 0; i < A.length; i++) {
				A[i] = Negs.get(i);
			}
			quick_sort(A, 0, A.length - 1);
			for (int i = A.length-1; i >=0; i--) {

				if ((pSum + A[i]) * (pSize + 1) >= (pSum * pSize) + A[i]) {
					pSum += A[i];
					pSize = pSize + 1;
				} else {
					nSum += A[i];
				}

			}
			tHp = (pSum * pSize) + nSum;
			System.out.println(tHp);
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
