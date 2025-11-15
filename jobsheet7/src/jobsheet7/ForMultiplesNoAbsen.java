package jobsheet7;
import java.util.Scanner;
public class ForMultiplesNoAbsen {

	public ForMultiplesNoAbsen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		
		int sum = 0;
		int counter = 0;
		
		System.out.print("input the number : ");
		int multiple = input.nextInt();
		
		for(int i = 1; i <= 50; i++) {
			
			if(i % multiple == 0) {
				sum = sum + i;
				
				counter++;
				
			}
		}
		
		System.out.printf("there are %d number that are multiple of %d in range 1 to 50.\n ", counter,multiple);
		System.out.printf("the sum of all multiple of %d in range 1 to 50 is %d.\n",counter,sum);
		System.out.println("the System Counter this much Multiple " + counter);
		
		if(counter > 0) {
			
			int avrage = sum/counter;
			
			System.out.printf("the avrage of all multiple of number %d in range i to 50 is\n ", avrage,multiple);
		}
		
		else {
			
			System.out.print("No multiple found!!!");
		}
	}

}
