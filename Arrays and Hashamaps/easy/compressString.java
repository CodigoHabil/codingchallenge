public class Main
{
	public static void main(String[] args) {
		System.out.println(compression("aabcccccaaa"));
		System.out.println(compression("Helloworld"));
		System.out.println(compression("Heeeelllllllloworrrldthissssiss"));
		System.out.println(compression("H"));
	}
	
	public static String compression(String word) {
	    StringBuilder newString = new StringBuilder();
	    int i = 0;
	    int j = 0;
	    int count = 0;

	    while (j < word.length()) { 
	        if(word.charAt(i) == word.charAt(j)) {
	            count++;
	            j++;
	        } else {
	            newString.append(word.charAt(i) + "" + count);
	            i = j;
	            count = 0;
	        }
	    }
	    newString.append(word.charAt(i) + "" + count++);
	    	           
	    return (newString.length() > word.length()) ? word : newString.toString()	;    
	}
}
