// fig.2.7: Multiplication.java
// multiplication program that inputs two numbers then displays their product.
import java.util.Scanner; // program uses class scanner

public class Multiplication {
	// main method begins execution of java application
	public static void main(String[] args) {
		// creat a Scanner to obtain input from the command windown
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read first number from user

		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // read second number from user

		int multiplication = number1 * number2; // multiply numbers, then store result in Multiplication

		System.out.printf("multiplication is %d%n" , multiplication); // display multiplication
	} // end method main
   } // end class multiplication