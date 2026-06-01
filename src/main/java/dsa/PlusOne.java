package dsa;

import java.util.Arrays;

public class PlusOne {
	
public static int[] plusOneSum(int[] arr) {
	 String str=Arrays.toString(arr).replaceAll("[^0-9]", "");
	 System.out.println(str);
	 int value=Integer.valueOf(str);
//     int val=Integer.valueOf(str);
     System.out.println(value);
//     
     int plusOne=value+1;
     int intValue=plusOne;
     System.out.println(plusOne);
     String plusOnetoString=String.valueOf(plusOne);
     int[] newArr=new int[plusOnetoString.length()];
     int rem,sum=0;
     
     while(intValue>0) {
    	 rem=intValue%10;
    	 intValue/=10;
    	 sum=sum*10;
    	 sum+=rem;
     }
     System.out.println(sum);

     String s=String.valueOf(sum);
     StringBuilder sb=new StringBuilder(s);
     sb.reverse();
     System.out.println(sb);
     int arr1[]=new int[sb.length()];
     for(int i=0;i<sb.length();i++) {
    	 arr1[i]=sb.charAt(i)-'0';
     }
return arr1;
     
}
public static void main(String[] args) {
	int[] arr= {1,2,3};
	plusOneSum(arr);
}
}
