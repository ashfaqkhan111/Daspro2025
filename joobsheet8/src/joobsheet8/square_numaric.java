package joobsheet8;
import java.util.Scanner;

public class square_numaric {
	
	public square_numaric() {
		// TODO Auto-generated constructor stub
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value of N: ");
        int N = input.nextInt();
        
        System.out.print("Enter value of M: ");
        int M = input.nextInt();
        
        int max = Math.max(N, M); 
        
        for (int i = 1; i <= max; i++) {
            
            
            if (i <= N) {
                for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N || j == 1 || j == N)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            } else {
                for (int j = 1; j <= N; j++) {
                    System.out.print("  ");
                }
            }
            
            System.out.print("\t\t"); 
            
            
            if (i <= M) {
                for (int k = 1; k <= M; k++) {
                    if (i == 1 || i == M || k == 1 || k == M)
                        System.out.print("# ");
                    else
                        System.out.print("  ");
                }
            }
            
           
            System.out.println();
        }
    }
}
