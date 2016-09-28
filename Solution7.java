public class Solution7 {
	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int ithPrime(int num) {
		int result = 1;
		int count = 0;
		while (count != num) {
			result++;
			if (isPrime(result)) {
				count++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(ithPrime(10001));
	}
}
