package Meeting15;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class powerRecursiveFunction {
    
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Base : ");
        int base = in.nextInt();

        System.out.print("Enter power : ");
        int pow = in.nextInt();

        System.out.print("Result for base "+base +"and power "+pow+" is : "+power(base, pow));

    }

    static int power(int base, int pow){

        if(pow == 0)
            return 1;

        else 

            return base*power(base, pow-1);


    }
}
