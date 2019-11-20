import java.util.Scanner;

public class Factorial {
	
    static int input;
    
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("숫자 입력:");
		input=scan.nextInt();
		System.out.println(factorial(input));
	}
	public static int factorial(int input) {

		if (input <= 1) {
			return input;
		}else { 
			return factorial(input-1) * input;
		}
	}
}
