package Meeting14;

public class Experiment5_254107020262 {
    
public static void main(String [] args){

show("Programing fundamentals : ", 100,200);
show("information Technology :", 1,2,3,4,5);
show("informatics : ");
}

static void show(String str, int ...a){

    System.out.print("String :"+str);
    System.out.print("Number of Arguments per parameter " +a.length +" ");

    for(int i:a){
System.out.print(i+" ");
    }
    System.out.println();
}

}
