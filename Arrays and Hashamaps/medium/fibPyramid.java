public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n = 9;
		int count = 0;
		for (int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {  
                ++count;
            }
        }
        System.out.println(count);

		int[] aux = new int[count + 2];
		
		fib(0, 1, 40, 0, count, aux);
		
		count = 0;
		
        for (int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {            
                System.out.print(aux[count++] + (j == i ? "" : " "));
            }
            System.out.println("");
        }
	}
	
	public static void fib(int prev, int curr, int target, int count, int countTarget, int[] aux) {
	    if(count > countTarget) {
	        return;
	    }
	    aux[count + 1] = curr;
	    fib(curr, curr + prev, target, ++count, countTarget, aux);
	}
}
