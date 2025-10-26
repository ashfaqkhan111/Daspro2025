
package  LibararyAccess;
import java.util.Scanner;
public class LibararyAccess {

	public LibararyAccess() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner input = new Scanner (System.in);
		
		boolean canEnter;
		
		String message= "";
		
		System.out.print("you have studnt ID (true / false) : ");
	    boolean hasstudentiD = input.nextBoolean();

		System.out.print("have you registerd online (true / false) : ");
		boolean RegisterdOnline = input.nextBoolean();
		
		
		if(hasstudentiD || RegisterdOnline) {
			
			canEnter = true;
			
			message = "Access Granted you may access the library ";
			
		}
		
		else {
			canEnter = false;
			
			message = "Bring your ID or Register Online " ;
			
		}
		System.out.print(message);
	}
	

}
