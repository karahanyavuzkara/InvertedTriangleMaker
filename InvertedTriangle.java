package patika;
import java.util.Scanner;
public class InvertedTriangle {

	public static void main(String[]args) {
	
		 Scanner scanner = new Scanner(System.in);
	        int n, star, space;
	        System.out.print("Please enter height of triangle (n) : ");
	        n = scanner.nextInt();

	        
	        for (int i = n; i >= 1; i--) {
	            for (space = 1; space <= n - i; space++) {
	                System.out.print(" ");
	            }
	            for (star = 1; star <= (2 * i) - 1; star++) {
	                System.out.print("*");
	            }
	            System.out.println();
		}
		
		//(2n-1)
	}	 
}
