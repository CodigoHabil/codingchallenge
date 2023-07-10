import java.util.*;

public class Main
{
	public static void main(String[] args) {
        System.out.println(firstNotRepitedCharArray("Hellho"));
        System.out.println(firstNotRepitedCharArray("Hello"));
        System.out.println(firstNotRepitedCharArray("izzxxooiu"));
        System.out.println(firstNotRepitedCharArray("izxou"));

        System.out.println("***");


        System.out.println(firstNotRepitedChar("Hellho"));
        System.out.println(firstNotRepitedChar("Hello"));
        System.out.println(firstNotRepitedChar("izzxxooiu"));
        System.out.println(firstNotRepitedChar("izxou"));
	}

	public static char firstNotRepitedCharArray(String word) {
	    char[] chars = new char[350];
	    
	    for(int i = 0; i < 350; i++) {
	        chars[i] = 0;
	    }
	    
	    for(char c : word.toLowerCase().toCharArray()) {
            chars[c]++;
	    }
	    
	    for(char c: word.toLowerCase().toCharArray()) {
	        if( chars[c] == 1) {
	            return c;
	        }
	    }
	    
	    return ' ';
	}

	
	
    public static char firstNotRepitedChar(String word) {
	     HashMap<Character, Integer> chars = new HashMap<>();
	     
	     for(char c : word.toLowerCase().toCharArray()) {
	         if(!chars.containsKey(c)) {
	             chars.put(c, 1);
	         } else {
	             int val = chars.get(c);
	             chars.put(c, ++val);
	         }
	     }
	     
	     for(char c : word.toLowerCase().toCharArray()) {
	         if(chars.get(c) == 1) {
	             return c;
	         }
	     }
	     return ' ';
	}
}