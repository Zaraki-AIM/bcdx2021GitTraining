package bcdx2021GitProject;

public class Mitsumizo {

	public static void main(String[] args) {
		int mitsumizo;

		int M = 2;
		int N = 2;
		int K = 2;

		float[] A = new float[] { 1, 2, 3, 4 };
		float[] B = new float[] { 5, 6, 7, 8 };
		float[] C = new float[N * K];

		float[] Ans = new float[] { 19, 22, 43, 50 };
		C = matmul(A, B, M, N, K);
		System.out.println(isEqual(Ans, C));
	}

	public static boolean isEqual(float[] A, float[] B) {

		if (A.length != B.length)
			return false;
		boolean result = true;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i]) {
				result = false;
			}
		}

		return result;
	}

	public static float[] matmul(float A[], float B[], int M, int N, int K) {
		float[] C = new float[N * M];
		int i, j, k;
		for (i = 0; i < M; i++) {
			for (k = 0; k < K; k++) {
				for (j = 0; j < N; j++) {
					C[i * N + j] += A[i * K + k] * B[k * N + j];
				}
			}
		}
		return C;
	}
}
