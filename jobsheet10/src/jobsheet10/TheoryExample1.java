package jobsheet10;

import java.util.*;

public class TheoryExample1 {

	public TheoryExample1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		int[][] sales = new int[3][3];

		String branch = "";
		String product = "";
		
		for(int row =0; row<sales.length; row++) {
			for(int column=0; column<sales[row].length; column++) {
				
				if(row ==0) branch = "Suhat";
				else if (row ==1) branch ="Dieng";
				else if (row ==2) branch = "Sengkaling";
				
				
				if(column ==0) product = "Novals";
				else if (column ==1) product ="Comics";
				else if (column ==2) product ="Encyclopedia";
				
				
				System.out.print("Enter Sales for Product : " +"'"+product+ "'"+" Branch : "+"'"+branch+"' : ");
				sales[row][column] = input.nextInt();
			}
			
			
			
		}
		for(int i=0; i<sales.length; i++) {
			for(int j=0; j<sales[i].length; j++) {
				
				System.out.println("the list of sales" +product+ sales[i][j]);
				
			}
			
		}

		

	}

}
