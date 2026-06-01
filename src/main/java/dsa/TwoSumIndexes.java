package dsa;

import java.util.HashMap;

public class TwoSumIndexes {
public static int[] twoSum(int[] arr,int target) {

	HashMap<Integer,Integer> hm=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		int diff=target-arr[i];
		if(hm.containsKey(diff)) {
			int value=hm.get(diff);
			return new int[]{i,value};
		}
		hm.put(arr[i], i);
	}
	return new int[] {};

	}
public static void main(String[] args) {
	int[] arr= {1, 2, 3, 9, 8};
	int target=17;
	int[] resArr=twoSum(arr,target);
	for(int i:resArr) {
		System.out.println(i);
	}
}
}
