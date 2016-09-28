import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem11 {
	public static int[][] input(int gridSize) {
		int[][] grid = new int[gridSize][gridSize];
		File file = new File("/home/dustin/workspace/Euler/src/input2");
		try {
			Scanner in = new Scanner(file);
			for (int i = 0; i < gridSize; i++) {
				for (int j = 0; j < gridSize; j++) {
					grid[i][j] = in.nextInt();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return grid;
	}

	public static int highest(int[][] grid) {
		int highest = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (i + 3 < grid.length)
					highest = Math.max(grid[i][j] * grid[i + 1][j]* grid[i + 2][j] * grid[i + 3][j], highest);
				if (j + 3 < grid.length) 
					highest = Math.max(grid[i][j] * grid[i][j+1]* grid[i][j+2] * grid[i][j+3], highest);
				if(j+3 < grid.length && i+3 < grid.length) {
					highest = Math.max(grid[i][j] * grid[i+1][j+1]* grid[i+2][j+2] * grid[i+3][j+3], highest);
				}
				if(j-3 > 0 && i+3 < grid.length) {
					highest = Math.max(grid[i][j] * grid[i+1][j-1]* grid[i+2][j-2] * grid[i+3][j-3], highest);
				}
			}
		}
		return highest;
	}

	public static void main(String[] args) {
		System.out.println(highest(input(20)));
	}

}
