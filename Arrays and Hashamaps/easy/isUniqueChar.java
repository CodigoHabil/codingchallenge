import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String test1 = "Hello"; //false
		String test2 = "Yep it"; //true
		String test3 = ""; //true
		
		System.out.println("Case 1 " + isUnique(test1));
		System.out.println("Case 2 " + isUnique(test2));
		System.out.println("Case 3 " + isUnique(test3));
		
		
		System.out.println("Case 1 " + isUniqueB(test1));
		System.out.println("Case 2 " + isUniqueB(test2));
		System.out.println("Case 2 " + isUniqueB(test2));
		
	}
	 
	public static boolean isUnique(String word) {
	    /*
	    
	    O(n^2) = 
	    
	    H e l l o
	        i
	            j
	            
	            
	   O(n)
	   [H, e, l, l, o] 
	    
	    */
	    Set<Character> chars = new HashSet<>();
	    
	    for(char c : word.toCharArray()) {
	        if(chars.contains(c)) {
	            return false;
	        } else {
	            chars.add(c);
	        }
	    }
	    
	    return true;
	}   
	
	public static boolean isUniqueB(String word) {
	    for(int i = 0; i < word.length(); i++) {
	       for(int j = i + 1; j < word.length(); j++) {
	           if(word.charAt(i) == word.charAt(j)) {
	               return false;
	           }
	       }
	    }
	    return true;
	}   
	 
}