public class Main
{
	public static void main(String[] args) {
		System.out.println(compression("aabcccccaaa"));
		System.out.println(compression("Helloworld"));
		System.out.println(compression("Heeeelllllllloworrrldthissssiss"));
		System.out.println(compression("H"));
		
		System.out.println(compressionOpt("aabcccccaaa"));
		System.out.println(compressionOpt("Helloworld"));
		System.out.println(compressionOpt("Heeeelllllllloworrrldthissssiss"));
		System.out.println(compressionOpt("H"));
		
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
	
	public static String compressionOpt(String word) {
	    int count = 0;
	    StringBuilder compressionString = new StringBuilder("");
	    for(int i = 0; i< word.length(); i++) {
	        count++;
	        if( i + 1 == word.length() || word.charAt(i) != word.charAt(i+1)) {
	            compressionString.append(word.charAt(i));
	            compressionString.append(count);
	            count = 0;
	        }
	    }
	    
	    return word.length() <= compressionString.length() ? word : compressionString.toString();
	}
}

