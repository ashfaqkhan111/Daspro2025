package WifiAccessSystem;

import java.util.Scanner;

public class WifiAccessSystem {

	public WifiAccessSystem() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String message = "";
		
		System.out.print("Enter user Type (lecturer/student/other)");
		String UserType = input.nextLine().trim().toLowerCase();
		
		if (UserType.equals ("lecturer")) {
			
			message = "Access Granted";
			
		}
		
		else if (UserType.equals("student")) {
			
			System.out.print("Enter number of cradits ");
			int Cradits = input.nextInt();
			
			if (Cradits >= 12) {
				
				message = "Acces Granted";
				
			}
			
			else {
				message = "Access Denied Cradits less then 12";
			}
		}
		
		
		else {
			
			message = "Access Denied!";
		}
		
		System.out.println(message);
		
	}
	

}
