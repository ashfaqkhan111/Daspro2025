package Meeting14;
import java.util.*;
public class Experiment6_254107020262 {
    
public static void main(String [] args){

Scanner in = new Scanner(System.in);

int length,width,height,area,volume;

/*System.out.print("Enetr length");
length = in.nextInt();

System.out.print("Enter Width : ");
width = in.nextInt();

System.out.print("Enter height : ");
height = in.nextInt();

area = length*height;

volume = area * height;

System.out.print("Area : " + area +"\n");

System.out.print("volume : " + volume);*/

System.out.print("Enetr length");
length = in.nextInt();

System.out.print("Enter Width : ");
width = in.nextInt();

System.out.print("Enter height : ");
height = in.nextInt();

area = area(length,width);
System.out.print("the total area is : "+area);

volume = volume(length, width, height);
System.out.print("total volume is : "+volume);

}

static int area (int length , int width){

    int area = length*width;
    return area;

}

static int volume (int length, int width, int height){

    int volume = area(length,width)*height;
    return volume;

}

}


