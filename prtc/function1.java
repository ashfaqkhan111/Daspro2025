package prtc;

import java.util.*;

public class function1 {
    
public static void main (String [] args){
int x = input();
int square = square (x);
int add = add(x);

int subtraction = subtraction(x);
System.out.print(square+ "add is "+add+" sub "+subtraction);

}

static int input (){
    Scanner in = new Scanner(System.in);

    System.out.print("Eneter the value of x");
    int x = in.nextInt();
return x;

}

static int square (int x){

 
    return x*x;

}

static int add(int x){

return x+x;
}


static int subtraction (int x){

    return x-10;
}

}
