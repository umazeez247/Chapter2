// fig.2.7: FullName.java
// Compilation of my Full name program that add up my names then displays them as one.
import java.util.Scanner; // program uses class scanner

public class FullName {
	// main method begins execution of java application
	public static void main(String[] args) {
		// creat a Scanner to obtain input from the command windown
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: "); // prompt
		String firstname = input.nextLine(); // read first name from user

		System.out.print("Enter second string: "); // prompt
		String othername = input.nextLine(); // raed other name from user

		String sum = firstname + " " + othername; // add numbers, then store full name in sum

		System.out.printf("Full Name is %s%n" , sum); // display sum
	} // end method main
   } // end class FullName