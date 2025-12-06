package prtc;
import java.util.*;

public class prtc {
   
   /*  private static int PRICES [] = {20000,30000,40000,50000,};

    public static void menu (){

        System.out.println("=====Coffee Shop=====");   //menu display
System.out.println("1. Balck Coffee "+PRICES[0]);
System.out.println("2.Latte "+PRICES[1]);
System.out.println("3. Cappucino "+PRICES[2]);
System.out.println("4. Teh Tarik "+PRICES[3]);
System.out.println("Please Choose your Drink");

    }
    
// calling the methods

public static void input(){
 Scanner in = new Scanner (System.in);

    System.out.print("enetr your age");
    int age = in.nextInt();
System.out.print("enetr your name");
    String name = in.nextLine();
    in.nextLine();

}


public static void main (String [] args){

menu();
input();

}*/

/*int factorial (int n){

    if (n==0) return 1;

    return n*factorial (n-1);

        
    
}*/

/*static int squre (int x){

    return x*x;

}

static int input (){

    Scanner in = new Scanner (System.in);

    System.out.print("Enter the value of x");
    int x = in.nextInt();
return x;
}

public static void main (String [] args){

   int number = input();

   int square = squre(number);

   System.out.print(square);
}*/

public static void main (String [] args ){
/*Scanner sc = new Scanner (System.in);
String name = sc.nextLine(); // 1st input 
int age = sc.nextInt();// 2nd input

printName(name,age); //the values pass from here direct to function PrintName 


}

static void printName(String name, int age){ // stored here 

    System.out.printf("name : %s age: %d",name,age);// after storing sent to print statement after print statement return here printName(name,age);
    
    return;*/



/*Scanner in = new Scanner (System.in);
int studentG [] []= new int [2][2];

String studentname [] = new String [studentG.length];

for (int i=0; i<studentG.length; i++){
System.out.print("Enter students name : "+(i+1));
studentname[i] = in.nextLine();
for(int j=0; j<studentG[i].length; j++){

    System.out.print("enter gardes : ");
    studentG[i][j] = in.nextInt();

}
in.nextLine();


}
for (int i=0; i<studentG.length; i++){

    for(int j=0; j<studentG[i].length; j++){
System.out.print("Student name : "+studentname[i]+" Grades : "+studentG[i][j]);

    }
    
}*/

/*int numbers [] = {1,2,3,4,4};

printArry(numbers);

}

static void printArry(int arr []){

    for(int num : arr){

        System.out.print(num);

    }*/


       /*  String name [] = {"ashfaq", "khan"};
        int number [] = {1,2,3,4,5}; 

        printArray(name,number);
}


static void printArray(String arr [], int arr1[]){

    for (String name : arr){

        System.out.print(name);

    }

    for (int number : arr1){


        System.out.print(number);

    }*/


/*Scanner in = new Scanner(System.in);
int x [] = new int[5];

inputArray(in, x);
printArray(x);

}

static void inputArray(Scanner in, int[] x){

    System.out.print("Eter elements: ");

    for(int i=0; i<x.length; i++){
       x[i]=in.nextInt();
    }
    return;
}

static void printArray(int x []){

    System.out.print("Array out put : ");

    for(int arr : x){

        System.out.print(arr);*/



       /*  int x [] [] = {{1,2,3,4,5},{8,7,6,5,4}};

        print2D(x);

    }

    static void print2D(int arr [] []){
 
        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

        return;*/



        /*String x [][] = {{"Ashfaq", "Atha"}, {"pass", "Fail"}};
print(x);


    }

    static void print(String arr[][]){

        for (int i=0; i<arr[0].length; i++){

            for(int j=0; j<arr[i].length; j++){

           
            }
           
        }*/
         /*Scanner in = new Scanner(System.in);

            int numbers [][] = new int [3][2];
            inputNumbers(in, numbers);
            printNumbers(numbers);

    }

    static void inputNumbers(Scanner in, int [][]arr){

        System.out.print("enetr number : ");
        for (int i=0; i<arr.length; i++){
 
            for(int j=0; j<arr[i].length; j++){

                System.out.print("Enter number at row "+(i+1)+" at column "+(j+1)+" : ");
                arr[i][j]=in.nextInt();
            }

        }
    }

    static void printNumbers(int [][] arr){

        for (int i=0; i<arr.length; i++){

            for (int j=0; <arr[i].length; j++){

                System.out.print(arr[i][j]);
            }
        }*/

System.out.print(cul(2));

    }

    static int cul(int x){

        if(x==1)

            return 1;
       
           System.out.print(x*cul(x-1)) ;
           return x;
        
    }

}







