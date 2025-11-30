package jobsheet8;

import java.util.Scanner;
import java.util.Random;

public class Quiz_game {

	public Quiz_game() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		Random rand =  new Random();
		
		char menu = 'y';
		
		do {
			int number = rand.nextInt(10)+1;
			boolean success = false;
			
			do {
				System.out.print("Guess the number from 1 to 10 : ");
				int answer = input.nextInt();
				input.nextLine();
				success = (answer == number);
				
			}while(!success);
			
			System.out.print("Do you wants to play the game again : Yes / No");
			
		menu = input.next().charAt(0);
		input.nextLine();
		
		
			
		}while(menu == 'Y' || menu == 'y'); {
			
			if (menu == 'N' || menu == 'n') {
				
				System.out.print("THE End !!!");
			}
		}
		
		
	}

}
