package Meeting15;

import java.util.*;

public class PrimeCheckingRecursive {
    
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);

    System.out.print("Enetr value of n : ");
    int n = in.nextInt();


    if(recurivePrimeCalculater(n, n-1)){
        System.out.print(n+" is prime");
    }
    else{
        System.out.print(n+" is not prime");
    }

    }

    static boolean recurivePrimeCalculater(int n, int divisor){


        if (n<=1)
            return false;

        if (divisor == 1)
            return true;

        if (n%divisor == 0)
            return false;


        return recurivePrimeCalculater(n, divisor-1);

    }

}
