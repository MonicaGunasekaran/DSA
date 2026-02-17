package dsa;

import java.util.HashMap;
//i did it myself too
public class TwoSumOptimal {
public static boolean twoSum(int[] arr,int target) {
	HashMap<Integer,Integer> hmap=new HashMap<>();

	for(int i=0;i<arr.length;i++) {
		int diff=target-arr[i];
		if(hmap.containsKey(diff)) {
			return true;		
		}
		hmap.put(arr[i], i);
	}
	return false;
}
public static void main(String[] args) {
	int[] arr= {2,11,5,7};
	int target=9;
	System.out.print(twoSum(arr,target));
}
}
