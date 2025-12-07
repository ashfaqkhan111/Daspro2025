package Meeting15;

public class recursive254107020262 {
    public static void main(String [] args){
System.out.print("hello World");
 System.out.println("using Recursive function "+factorialRecursive(5));
 System.out.println("using iterative function "+factorialIterative(5));

    }

    static int factorialRecursive(int x){

        if(x==1)
            return 1;
        else 
            return x*factorialRecursive(x-1);

    }


    static int factorialIterative (int n){

        int factorial = 1;

        for(int i=n; i>=1; i--){

            factorial = factorial*i;

        }

        return factorial;
    }

}
