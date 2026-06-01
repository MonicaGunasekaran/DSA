package dsa;

public class LongestSubstringWithoutRepeatingCharacters {
	public static String longestSubstringwoRepeatingChar(String str) {
	    String longestStr = "";
	    for (int i = 0; i < str.length(); i++) {
	        String s = "";
	        for (int j = i; j < str.length(); j++) {
	            char ch = str.charAt(j);
	            if (s.contains(String.valueOf(ch))) {
	                break;
	            }
	            s += ch;
	            if (s.length() > longestStr.length()) {
	                longestStr = s;
	            }
	        }
	    }
	    return longestStr;
	}
public static void main(String[] args) {
	String s="pwwkew";
	System.out.print(longestSubstringwoRepeatingChar(s));
}
}
