package dsa;

public class PrintElementsof2DMatrix {
public static void twoDMat(int[][] twoDMatrix) {
	for(int i=0;i<twoDMatrix.length;i++) {
		for(int j=0;j<twoDMatrix[0].length;j++) {
			System.out.println(twoDMatrix[i][j]);
		}
	}
}
public static void main(String[] args) {
	int twoDMatrix[][]=new int[][] {{1,2,3},{4,5,6}};
	twoDMat(twoDMatrix);
}
}
