import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem8 {
	public static long adjDigits(String str) {
		long result = 1;
		for (int i = 0; i < str.length(); i++) {
				result *= (str.charAt(i) - 48);
		}
		return result;
	}

	public static long largeProduct(String input, int adj) {
		long highest = 0;
		for (int i = 0; i <= input.length() - adj; i++) {
			highest =  Math.max(highest, adjDigits(input.substring(i, i + adj)));
		}
		return highest;
	}

	public static void main(String[] args) {
		File file = new File("/home/dustin/workspace/Euler/src/input");
		try {
			String input = new Scanner(file).useDelimiter("\\Z").next().replaceAll("\n","");
			System.out.println(largeProduct(input,13));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
