package jobsheet9;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArrayNumberXX {

	public ArrayNumberXX() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner input = new Scanner (System.in);
		
		
		
		//orignal code
		
		
		
		int [] num = new int[4];
		
		num [0]= 5;
		num [1] = 12;
		num [2] = 7;
		num [3] = 20;
		
		System.out.println(num[0]+"\n"+num[1]+"\n"+num[2]+"\n"+num[3]);
		
		// modified as the answer of qustion 2
		
		int [] num1 = {5,12,7,20};
        
        for (int n : num1){
        
        System.out.print(n + " "); 
        } 
        
        
        
		
        //modified as qustion 3
        
        
		
		for (int i =0; i<4; i++) {
			
			System.out.print(" "+num[i]+",");
		}
		
	}

}
