package Meeting14;

import java.util.*;

public class Greetings_254107020262 {
    
public static void main (String [] args){
 String name = GetGreetingsRecipents();

System.out.print("hello Mr."+name+" how are you");

}

static String GetGreetingsRecipents(){

Scanner in = new Scanner (System.in);

    System.out.print("Enter the name of person you wnts to greets: ");
    String personName = in.nextLine();
    in.close();
    return personName;

}


}
