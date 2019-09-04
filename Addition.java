// fig.2.7: Addition.java
// Addition program that inputs two numbers then displays their sum.
import java.util.Scanner; // program uses class scanner

public class Addition {
	// main method begins execution of java application
	public static void main(String[] args) {
		// creat a Scanner to obtain input from the command windown
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: "); // prompt
		int number1 = input.nextInt(); // read first number from user

		System.out.print("Enter second integer: "); // prompt
		int number2 = input.nextInt(); // raed second number from user

		int sum = number1 + number2; // add numbers, then store total in sum

		System.out.printf("Sum is %d%n" , sum); // display sum
	} // end method main
   } // end class Addition