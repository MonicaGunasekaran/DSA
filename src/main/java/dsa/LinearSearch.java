package dsa;

public class LinearSearch {
public static int linearSearch(int[] arr,int target) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			return i;
		}
	}
	return -	1;
}
public static void main(String[] args) {
	int[] arr= {12,14,56,7};
	int target=7;
	System.out.print(linearSearch(arr,target));
}
}
