package Meeting15;
import java.util.*;
public class SummationRecursive {
    
    public static void main(String [] args){

        Scanner in = new Scanner (System.in);
        System.out.print("Enter number : ");
        int n = in.nextInt();

        System.out.print("recurive function result : "+recursiveSum(n));

        /*int result = 0;

        for (int i=0; i<=n; i++){

            result = result+i;

        }
        System.out.print(result);*/
    }

    static int recursiveSum (int n){

        if(n == 1)
            return 1;

        return n+recursiveSum(n-1);
    }


}
