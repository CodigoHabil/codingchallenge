public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String[][] numbers = {{"01","02","03", "04"},{"05", "06", "07", "08"}, {"09", "10", "11", "12"}, {"13","14","15","16"}};
		for(int i = 0; i < 4; i++) {
		    for(int j = 0; j < 4; j++) {
		        System.out.print(numbers[i][j] + " ");
		    }
		    System.out.println(" ");
		}
		
		System.out.println(" ");
        System.out.println(" ");
        System.out.println("✅ " ) ;
        
        Matrix matrix = new Matrix();
        
        Object [][] aux = matrix.rotate90(numbers);
        
        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 3; j++) {
                System.out.print(aux[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("✅ " ) ;
        
        Double[][] numbersFloat = {{1.2,3.4,5.6},{7.8, 9.1, 1.2},{1.4, 1.5, 1.6}};
        
        Object [][] aux2 = matrix.rotate90(numbersFloat);
        
        for(int i = 0; i < numbersFloat.length; i++) {
            for(int j = 0; j < numbersFloat[0].length; j++) {
                System.out.print(aux2[i][j] + " ");
            }
            System.out.println("");
        }
		 
		
	}

}

class Matrix <T> {
    public T[][] rotate90 (T[][] matrix) {
	    Object[][] aux = new Object[matrix.length][matrix[0].length];
	    int m = -1;
	    int n = 0;
		for(int i = 0; i < matrix[0].length; i++) {
		    m++;
		    for(int j = matrix.length - 1; j >= 0; j--) {
		        aux[m][n++] = matrix[j][i];
		    }
		    n = 0;
		}
		return (T[][]) aux;
	}
}
