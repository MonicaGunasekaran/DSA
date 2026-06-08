package dsa;

public class BinarySearch {
public static int bs(int[] arr,int target) {
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid=start+(end-start)/2;
		if(arr[mid]==target) {
			return mid;
		}
		else if(arr[mid]>target) {
			end=mid;
		}
		else {
			start=mid+1;
		}
	}
	return -1;
}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7};
	int target=7;
	System.out.println(bs(arr,target));
}
}
