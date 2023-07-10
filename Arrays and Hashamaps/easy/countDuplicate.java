import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		/*
		    ['Hello']
		    :  1
		    ["woow"]
		    : 2
		    ["hola"]
		    : 0
		    
		*/
		String[] testCases = {
		    "Hello", //1
		    "HeLlo", //1
		    "hola",  //0,
		    "wooow", //2
		    "" // 0
		};
		
		for(String test : testCases){
		    System.out.println(countDupilicated(test));
		}
		
	}
	
	/*
	*/
	
	public static int countDupilicated(String word) {
	    Map<Character, Integer> chars = new HashMap<>();
	    int count = 0;
	    for(char c : word.toLowerCase().toCharArray()){
	        if(chars.containsKey(c)) {
	            int val = chars.get(c);
	            count = val == 1 ? count + 1 : count; 
	            chars.put(c, ++val);
	        } else {
	            chars.put(c, 1);
	        }
	    }
	    return count;
	}
}
