package Meeting14;
import java.util.*;

public class CubeStudent254107020262 {
    

    public static void main(String [] args){

        Scanner in = new Scanner (System.in);

        Double studentsGrade [][] = new Double [2][7];

        String studentsName [] = new String[studentsGrade.length];

        inputData(in, studentsGrade, studentsName);
        displayData(studentsGrade,studentsName);
        heighestValue(studentsGrade, studentsName);
    }

    static void inputData(Scanner in,Double [][]grades, String []name){
        System.out.println("======Input=====");
        for (int i=0; i<grades.length; i++){
            System.out.println("ENeter STudent name : ");
            name[i] = in.nextLine();

            for(int j=0; j<grades[i].length; j++){

                System.out.print("\nenter students grade for week "+(j+1)+" : ");
                grades[i][j] =in.nextDouble();

            }

            in.nextLine();
        }

        return;
    }

    static void displayData( Double [][]grades, String []name){
System.out.println("=======Dispaly=======");
        for(int i=0; i<name.length; i++){
            System.out.println("Name of Student "+ (i+1)+" :"+name[i] +" ");
            for(int j=0; j<grades[i].length; j++){

                System.out.println("Grades for week "+(j+1)+ " :"+grades[i][j]);

            }
        } 
        
    }


    static void heighestValue(Double [][]grades, String name[]){

        System.out.println("======Heighest Score======");
       Double heighest = grades[0][0];
       String maxName = name[0];

       for(int i=0; i<grades.length; i++){

        for(int j=0; j<grades[i].length; j++){

            if(grades[i][j] > heighest){

                heighest = grades[i][j];
                maxName = name[i];
            }
            
        }
        
       }

       System.out.println("the heisghest score is " + maxName +" " +heighest);
    }
}
