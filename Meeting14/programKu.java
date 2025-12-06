package Meeting14;

public class programKu {

    public static void main(String [] args){

        int temp = sum(1, 1);

        showSum(temp, 5);

    }

    static void showIndex(int i){

        for (int j=1; j<=i; j++){
            System.out.print(j);
        }

    }

    static int sum(int num1, int num2){

        int sum=num1+num2;

        return sum;

    }

    static void showSum(int num1, int num2){

        showIndex(sum(num1, num2));
    }
    
}
