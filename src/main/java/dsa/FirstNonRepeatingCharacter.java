package dsa;

public class FirstNonRepeatingCharacter {
public static char fnrc(String s) {
	for(int i=0;i<s.length()-1;i++) {
		char ch=s.charAt(i);
		boolean flag=true;
		for(int j=i+1;j<s.length()-1;j++) {
			if(s.charAt(j)==ch) {
				flag=false;
				break;
			}
			if(flag) {
				return ch;
			}
		}
	}
	return ' ';
}
public static void main(String[] args) {
	String s="swiss";
	System.out.print(fnrc(s));
}
}
