public class Solution6 {
	public static void main(String[] args) {
		int sum = 0;
		int sumOfSquares = 0;
		for(int i = 1; i <= 100;i++) {
			sum += i;
		}
		for(int i = 1; i <= 100;i++) {
			sumOfSquares += i*i;
		}
		System.out.println((sum*sum)-sumOfSquares);
	}
}
