package Meeting14;
import java.util.*;

public class Coffee25410702062 {
public static void menu(String custamorname, boolean ismember, String DiscountCode){
    System.out.println("welcome "+custamorname);
if(ismember){
System.out.println("you are a member you get 20% discount");
}

if(DiscountCode.equals("DISKON50")){
    System.out.println("you get 50% discount");
}else if(DiscountCode.equals("DISKON30")){
System.out.println("you get 30% Discount");

}else{
    System.out.println("Invalid Discount Code");
}



System.out.println("=====Coffee Shop=====");
System.out.println("1. Balck Coffee - 15k");
System.out.println("Latte - 20k");
System.out.println("Cappucino - 30k");
System.out.println("Teh Tarik - 12k");
System.out.println("Please Choose your Drink");
}

public static void main(String[] args) {
    

    Scanner in = new Scanner (System.in);

System.out.println("enter your name :");
String custamorname = in.nextLine();

System.out.println("are you member? true/false : ");
boolean ismember = in.nextBoolean();

in.nextLine();

System.out.println("Enter Discount code : ");
String DiscountCode = in.nextLine().toUpperCase();



menu(custamorname,ismember,DiscountCode);
}
}   



