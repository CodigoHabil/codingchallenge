import java.util.*;


public class Main
{
	public static void main(String[] args) {
	    /*
	        if there is an odd element more than 2 times, is false
	       	 
	       	 bird rib
	        
	        {
	         b: 2
	         i: 2
	         r: 2
	         d: 1
	        }
	        
	        We panic in a pew.
	        
	        {
	         w: 2
	         e: 2
	         p: 2
	         a: 2
	         n: 2
	         i: 2
	         c: 1
	        }
	        
	    */
	    
	    /*
	        bird rib
            taco cat
            UFO tofu
            Borrow or rob?
            Never odd or even.
            We panic in a pew.
            Won’t lovers revolt now?
	    */
	    
	    
	    String test1 = "We panic in a pew";
	    String test2 = "Borrow or rob?";
	    String test3 = "Borrowororob?";

		System.out.println(isAnagramPermutation(test1));
		System.out.println(isAnagramPermutation(test2));
		System.out.println(isAnagramPermutation(test3));

	}
	
	static boolean isAnagramPermutation(String word) {
	    Map<Character, Integer> chars = new HashMap<>();
	    
	    for(char c : word.toLowerCase().toCharArray()) {
	        if(!chars.containsKey(c)) {
	            if(c != ' ') {
	                chars.put(c, 1);
	            } 
	        } else {
	            int value = chars.get(c);
	            chars.put(c, ++value);
	        }
	    }
	    
	    int odd = 0;
	    
	    for(char key : chars.keySet()){
	        if(odd > 1) {
	            return false;
	        }
	        
	        System.out.println(key + " " + chars.get(key));
	        
	        if(chars.get(key) %2 != 0) {
	            odd++;
	        }
	    }
	    return true;
	}
}
