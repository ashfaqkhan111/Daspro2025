package jobsheet8;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class NestedLoopStudentID {

	public NestedLoopStudentID() {
		
	}

	public static void main(String[] args) {
		

		Scanner input = new Scanner (System.in);
		
		
		double [][] temps = new double [5] [7];
		
		for (int i =0; i<temps.length; i++) {
			System.out.println(" City " + "("+(i+1)+")");
			
			for (int j=0; j<temps[0].length; j++) {
				
				System.out.print(" Day " + "'"+(j+1)+"'");
				
				temps [i][j] = input.nextDouble();
				
			}System.out.println();
			
		}
		
		for (int i =0; i<temps.length; i++) {
			System.out.println(" City " +(i+1));
			
			for (int j =0; j<temps[0].length; j++) {
				System.out.printf(temps[i][j] + " ");
				
				
			}System.out.println();
			
			
		}
		
		
	}

}
