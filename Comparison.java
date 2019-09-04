// Comparison of two numbers program that returns message telling us if the two numbers are equal or not.
import java.util.Scanner; // program uses class scanner

public class Comparison {
	// main method begins execution of java application
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first integer: "); // prompt
	
		int firstNumber = input.nextInt(); // read first Integer from user

		System.out.println("Enter second integer: "); // prompt
		int secondNumber = input.nextInt(); // read SecondNumber from user
		if (firstNumber == secondNumber) {
		System.out.print ("Numbers are Equal");
}
		if (firstNumber != secondNumber){
		System.out.println("Numbers are not Equal");
}

	} // end method main
   } // end class Comparison


