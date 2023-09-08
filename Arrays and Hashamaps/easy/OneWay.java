public class Main
{
	public static void main(String[] args) {
		System.out.println(oneWayRef("pale", "ple") + " True");
		System.out.println(oneWayRef("pale", "bake") + " False");
		System.out.println(oneWayRef("pales", "pale") + " True");
		System.out.println(oneWayRef("pale", "bak") + " False");
		System.out.println(oneWayRef("pale", "poles") + " False");
		System.out.println(oneWayRef("palesoh", "paleso") + " True");
		System.out.println(oneWayRef("oalesoh", "paleso") + " False");
		System.out.println(oneWayRef("palore", "pal") + " False");
		System.out.println(oneWayRef("pal", "palore") + " False");
		System.out.println(oneWayRef("palo", "pal") + " True");
		System.out.println(oneWayRef("palo", "alo") + " True");
	}
	
	
	public static boolean oneWayRef(String word1, String word2) {
	    if(word1.length() == word2.length()) {
	        return verifyCharsChanges(word1, word2);
	    }
	    if(Math.abs(word1.length() -  word2.length()) != 1) {
	        return false;
	    }
	    if(word1.length() > word2.length()) {
	        return verifyEdits(word1, word2);
	    } else {
	        return verifyEdits(word2, word1);
	    }
	} 
	
	public static boolean verifyCharsChanges(String word1, String word2) {
	  int count = 0;
	  for (int i = 0; i < word1.length(); i++) {
	      if (word1.charAt(i) != word2.charAt(i)) {
	         count++;
	         if(count > 1) return false;
	      }
	  }
	  return true;
	}
	
	public static boolean verifyEdits(String word1, String word2) {
	    int count = 0;
	    int i = 0;
	    int j = 0;
	    while(i < word1.length() && j < word2.length()) {
	        if(word1.charAt(i) ==  word2.charAt(j)) {
	            i++;
	            j++;
	            continue;
	        } 
	        if(i + 1 < word1.length()) {
	            if(word1.charAt(i + 1) == word2.charAt(j)) {
	                i++;
	            } else {
	                j++;
	            }
	            count++;
	        }
	    }
	    return count <= 1;
	}
}
