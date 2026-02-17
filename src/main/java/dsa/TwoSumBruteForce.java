package dsa;
// i did it by myself and it takes O(n*n) complexity as it involves 2 loops. Optimised version should use HashMap
public class TwoSumBruteForce{
public static int[] twoSum(int[] arr,int target) {
	int[] resArray=new int[2];
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			int sum=arr[i]+arr[j];
			if(sum==target) {
				resArray[0]=i;
				resArray[1]=j;
			}
		}
	}
	return resArray;
}
public static void main(String[] args) {
	int[] arr= {2,7,11,15};
	int target=9;
	int[] result=twoSum(arr,target);
	for(int i:result) {
		System.out.println(i);
	}
}
}
