package Meeting15;
import java.util.*;

public class provitRecursive {
    
public static void main(String []args){
Scanner in = new Scanner(System.in);

System.out.print("Enter invesment amount : ");
double amount = in.nextDouble();

System.out.print("Enetr period : ");
int years = in.nextInt();

System.out.print("balance for "+years+" is : "+calculateProfit(amount, years));

}

static Double calculateProfit(Double invesment, int period){

    if (period ==0)
        return invesment;
else
    return 1.11*calculateProfit(invesment, period-1);

}

}
