package Meeting14;
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class Coffee25410702062 {

private static final int [] PRICES = {15000,20000,30000,12000}; //array for prices

public static void menu_m(String custamorname, boolean ismember, String DiscountCode){ //method menu
    System.out.println("welcome "+custamorname);
if(ismember){                                                                         //condition for checking membership
System.out.println("you are a member you get 20% discount");
}

if(DiscountCode.equals("DISKON50")){ //condition for checking discount code
    System.out.println("you get 50% discount");
}else if(DiscountCode.equals("DISKON30")){
System.out.println("Diskon code you get 30% Discount");

}else{
    System.out.println("Invalid Discount Code");
}}

public static void menu(){
System.out.println("=====Coffee Shop=====");   //menu display
System.out.println("1. Balck Coffee "+PRICES[0]);
System.out.println("2.Latte "+PRICES[1]);
System.out.println("3. Cappucino "+PRICES[2]);
System.out.println("4. Teh Tarik "+PRICES[3]);
System.out.println("Please Choose your Drink");

}

public static int calculation (int MenuChoice, int portion){ //calculation method
    if(MenuChoice <1 || MenuChoice > 4 || portion <1){
  return 0;
    }
    
  int PricePerItem = PRICES[MenuChoice -1];
  int total = PricePerItem*portion;
  return total;

}

public static String choice(int MenuChoice){ //choice method
   
   if(MenuChoice == 1) return "Balck Coffee";
   if(MenuChoice ==2) return "Latte";
   if(MenuChoice == 3) return "Cappucino";
   if(MenuChoice == 4) return "Teh Tarik";
return"Unknown";
}

public static void main(String[] args) {  //main method
    menu();
    

    Scanner in = new Scanner (System.in);

System.out.println("enter your name :");
String custamorname = in.nextLine();

System.out.println("are you member? true/false : ");
boolean ismember = in.nextBoolean();

in.nextLine();

System.out.println("Enter Discount code : ");
String DiscountCode = in.nextLine().toUpperCase();

System.out.println("the number off your choice 1-4 :");
int MenuChoice = in.nextInt();

System.out.println("Enter number of portion :");
int portion = in.nextInt();



//menu(custamorname,ismember,DiscountCode);   //method call
int total = calculation(MenuChoice, portion);

if(total ==0){
    System.out.println("invalid menu ");

}else{

System.out.println("Menu chosen : "+choice(MenuChoice));
System.out.println("total Portions you ordered : "+portion);
System.out.println("item Preice : "+PRICES[MenuChoice -1]);
System.out.println("Total Price : "+total);

menu_m(custamorname, ismember, DiscountCode);
}

}
}   



