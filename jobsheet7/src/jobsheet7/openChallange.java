package jobsheet7;


import java.util.Scanner;


public class openChallange {

	public openChallange() {}
		// TODO Auto-generated constructor stub
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		String s = "";
		
		System.out.print("Enter NUmber");
		int Inputnumber = input.nextInt();
		if(Inputnumber <= 0) {
			System.out.print("Invalid number!!!");
			
		}
		
		else { 
			
			for( int i = Inputnumber; i>0 ; i--) {
				
				System.out.println(s);
				
				for(int j = 0; j < i; j++) {
					
					System.out.print("*");
					
				}
		
			}
			System.out.println();
		
	
		}
	
	}
}

