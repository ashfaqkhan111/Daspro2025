package jobsheet7;

import java.util.Scanner;

public class DoWhileLeaveEntitlementNoAbsen {

	

	public DoWhileLeaveEntitlementNoAbsen() {
		
	}

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
int LeaveEntitlement = 10;
		 
		
		System.out.println("***Each employ is entitled with maximum 10 days of leaves***");
		
		
		do {
		System.out.print("you want Leave ? yes/no : ");
		String Confirmation = input.nextLine().trim().toLowerCase();
		
		
		
		if(Confirmation.equals("yes")) {
			
			System.out.print("How many days you wants? :");
			int numLeave = input.nextInt();
			input.nextLine();
			
			if (numLeave<=LeaveEntitlement) {
				
				LeaveEntitlement -= numLeave;
				
				System.out.println("Reamining Leave"+LeaveEntitlement);
				
					
			}
			
			else {
				
				System.out.println("you dont have enough leave entitlement!");
				break;
			}
		}else { if (Confirmation.equals("no")) {
			
			System.out.print("ok no leave taken today");
			break;
		}
		
		else if(Confirmation.equals("t") || Confirmation.equals("T")) {
			
			System.out.print("Program END, GoodBye");
			break;
			
			
		}
		
		
		else {
			
			System.out.println("Invalid Input Try yes/no");
			
		}
		
	
		
		
		
		}
		
			
			
			
		}while(LeaveEntitlement > 0);
		
	}

}
