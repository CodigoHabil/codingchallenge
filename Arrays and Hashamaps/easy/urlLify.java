public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String sampleA = "Mr John  ";
		String sampleB = "Mr John Smith    ";
		String sampleC = "Salbucaz   i       ";
		String sampleD = " ";
		String sampleE = "How is a movie, based on a true story                ";

		char[] sampleArrayA = sampleA.toCharArray();
		char[] sampleArrayB = sampleB.toCharArray();
		char[] sampleArrayC = sampleC.toCharArray();
		char[] sampleArrayD = sampleD.toCharArray();
		char[] sampleArrayE = sampleE.toCharArray();



		int countA = 7;
		int countB = 13; 
		int countC = 12;
		int countD = 0;
		int countE = 37;

		
		URLFy(sampleArrayA, countA);
		URLFy(sampleArrayB, countB);
		URLFy(sampleArrayC, countC);
		URLFy(sampleArrayD, countD);
		URLFy(sampleArrayE, countE);


		
		System.out.print("'");
		for(char c : sampleArrayA) {
		   System.out.print(c);
		}
		
		System.out.println("'");
		System.out.print("'");
		for(char c : sampleArrayB) {
		   System.out.print(c);
		}

		System.out.println("'");
		System.out.print("'");
		for(char c : sampleArrayC) {
		   System.out.print(c);
		}
		
		System.out.println("'");
		System.out.print("'");
		for(char c : sampleArrayD) {
		   System.out.print(c);
		}
		
		System.out.println("'");
		System.out.print("'");
		for(char c : sampleArrayE) {
		   System.out.print(c);
		}
		
		
	}
	
	static char[] URLFy(char[] words, int length) {
	    /*
	    
	        %20 Each space * 2
	        "Mr John Smith      "  13 
	        
	        j = length - 1
	        k = words.length - 1
	        ["Mr John Smith      "]
	                 j      
	                       k
	                        Smith
	                   if(j == ' ')
	                      word[--k] = 0 
	                      word[--k] = 2 
	                      word[--k] = %
	        
	    */
	    /*
	        j = 9
	        k = 17
	        
	        ["Mr John Smith     Smith"]
	                 j    
	                           k
	    
	    */
	    int j = length - 1;
	    int k = words.length - 1;
	    
	    for(int i = 0; i < length - 1; i++) {
	        if(words[j] != ' ') {
	            words[k--] = words[j];
	        } else {
	             words[k--] = '0';
	             words[k--] = '2';
	             words[k--] = '%';
	        }
	        j--;
	    }
	    
	    return words;
	}
}