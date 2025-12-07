package Meeting15;

public class calculatePower {
    public static void main(String [] args){

//Using iteration

/*int power = 5;
int base = 2;

int result = 1;

String exprission = " ";

for (int i=1; i<=power; i++){

    result*= base;
if (i==power)

   exprission += base;
   
else
    exprission += base +"x";

}

System.out.print(exprission+" = "+result);*/



int base = 2;
int pow = 5;
String exp = exprission(base, pow);
int power = powerCalculation(base, pow);

System.out.print(exp+" = "+power);
    }


    //using function

    static int powerCalculation(int base, int pow){

        if (pow ==0)

            return 1;

            return base*powerCalculation(base, pow-1);
    }

    static String exprission (int base, int pow){
        if(pow == 1)
            return ""+base; 

        return base +"x"+ exprission(base, pow-1);
    }

    


}
