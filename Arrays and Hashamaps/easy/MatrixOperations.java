public class MatrixOperations
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int[][] matrix = {{1,2,3},{4,5,6}, {7, 8, 9}};
		
		printArray(matrix);
		
		int[][] B = transpose(matrix);
		
		printArray(B);
		
		B = reverse(B);
		
		printArray(B);

		/*
		int N = 3;
		int[][]B = new int[3][3];
		
	    
	    for(int i = 0; i < 3; i++) {
	        for(int j = 0; j < 3; j++) {
	            B[i][j] = matrix[j][i];
	        }
	    }
	    
	    for(int i = 0; i < 3; i++) {
	        int k = 0;
	        for(int j = 3 - 1; j >= 0; j--) {
	            matrix[i][k++] = B[i][j];
	        }
	    }
	    
	    for(int i = 0; i < 3; i++) {
	        for(int j = 0; j < 3; j++) {
	            System.out.print(matrix[i][j]);
	        }
	        System.out.println("");
	    }
	    
	    

	    */
	    
	    /*
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                B[i][j] = matrix[j][i];
            }
        }
	    
	    for(int i = 0; i < 3; i++) {
	        for(int j = 0; j < 3; j++) {
	            int temp = B[j][i];
	            B[j][i] = B[i][j];
	            B[i][j] = temp;
	        }
	    }
	    
	    for(int i = 0; i < 3; i++) {
	        for(int j = 0; j < 3; j++) {
                System.out.print(B[i][j]);
	        }
	        System.out.println("");
	    }
	    */
	
	}
	
	public static void printArray(int[][] matrix) {
	    for(int i = 0; i < matrix.length; i++) {
	        for(int j = 0; j < matrix[0].length; j++) {
	           System.out.print(matrix[i][j] + " ");
	        }
	        System.out.println("");
	    }
	    System.out.println("");
	}
	
	public static int[][] transpose(int[][] matrix) {
	    int[][]a = new int[matrix.length][matrix[0].length];
	    for(int i = 0; i < matrix.length; i++) {
	        for(int j = 0; j < matrix.length; j++) {
	            a[i][j] = matrix[j][i];
	        }
	    }
	    return a;
	}
	
	public static int[][] reverse(int[][] matrix) {
	    for(int i = 0; i < matrix.length; i++) {
	        int k = matrix[0].length;
	        for(int j = 0; j < matrix[0].length / 2; j++) {
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[i][--k];
	            matrix[i][k] = temp;
	        }
	    }
	    return matrix;
	}
}
