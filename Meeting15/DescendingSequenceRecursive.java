package Meeting15;
import java.util.*;
public class DescendingSequenceRecursive {
    
public static void main (String [] args){

    Scanner in = new Scanner (System.in);
    System.out.print("enter value of n :");
    int n = in.nextInt();

    decendingOrder(n);

    for (int i = n; i>=1; i--){
 System.out.println("using iterative : "+i);

    }
   
}


static void decendingOrder(int n){

    if (n==0)
        return;
    System.out.print("using recursive function : "+n+" ");
     decendingOrder(n-1);

}



}
