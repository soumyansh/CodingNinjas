package introtojava.test2;

public class Ques1 {
	public static void main(String[] args) {
		print2DArray(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });
	}

	public static void print2DArray(int input[][]) {
		int rows = input.length;
		int cols = input[0].length;
		int l = input.length;
		int m = 0;
		int n = 0;
		
		for (int x = input.length; x>0; x--) {
			for (int k = x; k>0; k--) {
				
				if (m<input.length) {
					for (int i = m; i <= n; i++) {
						for (int j = 0; j < cols; j++) {
							System.out.print(input[i][j] + " ");
						}
						System.out.println();
					} 
				}
				
			} 
			m++;
			n++;
			
		}

	}
}
