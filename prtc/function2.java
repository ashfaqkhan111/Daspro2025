package prtc;
import java.util.*;
public class function2 {
    
public static void main(String [] args){
/*int a=10;
int b=18;
int sum = calculateSum(a,b);
System.out.print("Sum : "+sum);
}
static int calculateSum(int a, int b){
System.out.print("hi ");
int sum = a+b;
return sum;

}*/

/*Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();

int prod = calculateProduct(a, b);
System.out.print("Prod: "+prod);


}

static int calculateProduct(int a, int b){

    int prod = a*b;
    return prod;*/


Scanner in = new Scanner (System.in);

int a = in.nextInt();

factorial(a);

}

static void factorial (int a){

    int fact = 1;

    for (int i=a; i>=1; i--){

         fact = fact*i;

    }

    System.out.print(fact);
  return;
}

}
