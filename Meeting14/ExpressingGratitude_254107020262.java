package Meeting14;

import java.util.*;

public class ExpressingGratitude_254107020262 {
    
public static void main(String [] args){

SayThankyou();
SayAddational();

}

static String GetGreetings (){

    Scanner in = new Scanner (System.in);

    System.out.print("Enetr the person you wants to greets : ");
    String recipentName = in.nextLine();
    
    

    return recipentName;

}

static void SayAddational (){
System.out.print("i hope you will inspire more students");



}

static void SayThankyou(){

String name = GetGreetings ();
System.out.print("Thank you Mr. "+name+" for being best teacher \n"+"your teaching method inspired me.");





}

}
