package Application;



import java.util.Locale;
import java.util.Scanner;



public class PrincipalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter with two numbers: ");
		int line = sc.nextInt();
		int colum = sc.nextInt();
		
		int[][] mat = new int[line][colum];
		
		for (int i = 0 ; i < mat.length ; i++) {
			
			for(int j = 0 ; j < mat[i].length ; j++) {
				
				mat[i][j] = sc.nextInt();
			}
			
		}
		System.out.print("Enter with number that you sought:");
		int numberSought = sc.nextInt();
		
		for (int i = 0 ; i < mat.length ; i++) {
			
			for(int j = 0 ; j < mat[i].length ; j++) {
				
				if(mat[i][j] == numberSought) {
					
					System.out.println();
					
					System.out.println("Position:"+i + ","+j);
					if(j > 0) {
						System.out.println("Left:"+mat[i][j-1]);
					}
					
					if (j < mat[i].length-1 ) {
						
						System.out.println("Right:"+mat[i][j+1]);
					}
					if(i < mat.length -1) {
						System.out.println("Down:"+mat[i+1][j]);
						
					}
					
					if (i != 0) {
						System.out.println("Up:"+mat[i-1][j]);
					}
					
					
					
					
				}
			}
			
		}
		
		
		
		sc.close();

	}

}
