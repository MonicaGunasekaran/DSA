package dsa;

public class AbundantNumber {
public static void isAbundant(int number) {
	int sum=0;
	for(int i=1;i<number;i++) {
		if(number%i==0&&i!=number) {
			sum+=i;
		}
	}
	if(sum>number) {
System.out.println("The sum is "+sum);
	}
	System.out.println("the abundance is "+ (sum-number));

}
public static void main (String[] args) {
	int num=18;
	isAbundant(num);
}
}
