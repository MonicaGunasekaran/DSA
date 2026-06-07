package dsa;

public class TransposeOfMatrix {
public static int[][] transpose(int[][]arr){
	int[][] arr1=new int[3][3];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			 arr1[i][j]=arr[j][i];
		}
	}
	return arr1;
}
public static void main(String[] args) {
	int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
	int[][] resArr=transpose(arr);
	for(int i=0;i<resArr.length;i++) {
		for(int j=0;j<resArr[0].length;j++) {
			System.out.print(resArr[i][j]+" ");
		}
		System.out.println();
	}
}
}
