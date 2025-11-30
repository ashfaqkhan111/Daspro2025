package jobsheet8;
import java.util.Scanner;
import java.util.Arrays;

public class Porseni_national_event {

	public Porseni_national_event() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner input = new Scanner (System.in);
	
	String [] Sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
	String [][] Atheleats = new String [Sports.length][5];
	
	
	for (int i = 0; i<Sports.length; i++) {
		System.out.print("Enter name : " + Sports[i] + "\n");
		
		for(int j = 0; j < 5; j++) {
			System.out.print(" Athealete " + (j+1) +" :");
			
			Atheleats [i][j]=input.nextLine();
		}
		
		Arrays.sort(Atheleats[i]);
		System.out.println();
	}
	
	for(int i= 0; i<Sports.length; i++) {
		
		System.out.println("\n"+Sports[i] + ":");
		
		for (int j=0; j<5; j++) {
		
		System.out.print( " - "+Atheleats[i][j]);
		}
	}
	
	}

}
