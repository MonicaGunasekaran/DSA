package dsa;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {
public static void  frequencyOfChar(String s){
	Map<Character,Integer> charMap=new HashMap<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		charMap.put(ch, charMap.getOrDefault(ch, 0)+1);
	}

   charMap.forEach((key,value)->System.out.println(key+" -> "+value));
}

public static void main(String[] args) {
	String s="Java";
	frequencyOfChar(s);
}
}
