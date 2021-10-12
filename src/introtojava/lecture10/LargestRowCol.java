package introtojava.lecture10;

public class LargestRowCol {
	public static void main(String[] args) {
findLargest(new int[][] {{1,2},{90,100},{3,40},{-10,200}});
	}

	public static void findLargest(int mat[][]) {
		int rowSum = 0;
		int colSum = 0;
		int numRows=mat.length;
		int numCols=mat[0].length;
		int maxRowSum=0;
		int maxColSum=0;
		int maxRowIndex=0;
		int maxColIndex=0;
		for (int i = 0; i < numRows; i++) {
			rowSum=0;
			for (int j = 0; j < numCols; j++) {
				rowSum=rowSum+mat[i][j];
				if(rowSum>maxRowSum) {
					maxRowSum=rowSum;
					maxRowIndex=i;
				}
			}
			
		}
		//System.out.println(maxRowSum+" "+maxRowIndex+" "+"row");
		for (int i = 0; i < numCols; i++) {
			colSum=0;
			for (int j = 0; j < numRows; j++) {
				colSum=colSum+mat[j][i];
				if(colSum>maxColSum) {
					maxColSum=colSum;
					maxColIndex=i;
				}
			}
			
		}
		//System.out.println(maxColSum+" "+maxColIndex+" "+"col");
		if(maxRowSum>maxColSum) {
			System.out.println("row "+maxRowIndex+" "+maxRowSum);
		}else if(maxRowSum<maxColSum) {
			System.out.println("col "+maxColIndex+" "+maxColSum);
		}else if(maxRowSum==0 && maxColSum==0) {
			System.out.println("row 0 -2147483648");
		}
		else {
			System.out.println("row "+maxRowIndex+" "+maxRowSum);
		}
	}

}
