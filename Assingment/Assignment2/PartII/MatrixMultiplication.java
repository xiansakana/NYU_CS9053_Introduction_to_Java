import java.util.*;

class MatrixMultiplication {
	
	public static double[][] multiply(double[][] m1, double[][] m2) {
		double[][] m3 = new double[m1.length][m1.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
		return m3;
	}
	
	public static void fillMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random() * 10;
            }
        }
	}
    
	
    public static void main(String[] args) {
    	
    	/* just to show you what will happen:  
    	 
    	double[][] matrix = new double[4][5];
    	for (int i = 0; i< 4; i++) {
    		System.out.println(Arrays.toString(matrix[i]));
    	}
    	
    	*/
    	
    	System.out.print("Enter two integers spearated by a space for rows and columns: ");

    	
    	Scanner input = new Scanner(System.in);
    	int N = input.nextInt();
    	int M = input.nextInt();
    	
        double[][] M1 = new double[N][M];
        double[][] M2 = new double[M][N];
		double[][] M3 = new double[N][N];
		
		fillMatrix(M1);
	    fillMatrix(M2);
	    M3 = multiply(M1, M2);
	   
	    System.out.println("M1: ");
    	for (int i = 0; i< N; i++) {
    		System.out.println(Arrays.toString(M1[i]));
    	}
        System.out.println("M2: ");
    	
    	for (int i = 0; i< M; i++) {
    		System.out.println(Arrays.toString(M2[i]));
    	}
        System.out.println("M3: ");
    	
    	for (int i = 0; i< N; i++) {
    		System.out.println(Arrays.toString(M3[i]));
    	}
        
    	

    }
}
