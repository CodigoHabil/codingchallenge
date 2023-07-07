import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String test1 = "Hello"; //false
		String test2 = "Yep it"; //true
		String test3 = ""; //true
		
		System.out.println(isPermutation(test1, test2)); // false
		System.out.println(isPermutation("casa", "saca")); // true
		System.out.println(isPermutation("c asa. ", "sac a. ")); // true
		System.out.println(isPermutation("", "")); // true
		System.out.println(isPermutation("aaaabb", "baaaba")); // true
		System.out.println(isPermutation("aaaatbb", "baaab")); // false
	}
	 
	public static boolean isPermutation(String a, String b) {
	     if (a.length() != b.length()) {
	        return false;
	    }
	   
	    HashMap<Character, Integer> chars = new HashMap<>();
	   
	    for (Character c : a.toCharArray()) {
	        if(!chars.containsKey(c)) {
	            chars.put(c, 1);
	        } else {
	            int val = chars.get(c);
	            chars.put(c, ++val);
	        }
	    }   
	  
        for( Character c : b.toCharArray()) {
            if(!chars.containsKey(c) || chars.get(c) == 0) {
                return false;
            } else {
                int val = chars.get(c);
                chars.put(c, --val);
            }
        }

	    return true;
	}   
	
}
