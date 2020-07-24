import java.util.Scanner;

/**
 * @author Josh Overbeck
 * @version 3.0
 */
public class Tester {

	// Declaring some utilities
	final static String					border		= "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
	final static String					classBorder	= ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
	static StackInterface<Character>	stack;
	static InfixExpression				infix;
	static Scanner						sc;

	/**
	 * The Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Declaring a boolean to hold the state of the program
		boolean running = true;
		// Declaring a boolean to hold the state of the helper
		boolean helper = true;
		// Initializing the scanner
		sc = new Scanner(System.in);

		// Creating a state loop
		while (running) {

			if (helper) {
				print("\n" + border);
				print("\nEnter 'x' to exit ");
				helper = false;// Turning off the helper
			}

			print("\n" + border);
			print("\nInfix expression: ");

			String input = sc.nextLine();

			switch (input) {
			case "x":
			case "X":
				running = false; // Changing the state to exit
				sc.close();// Freeing up resources
				print("\nGoodbye");
				break;

			default:
				// ToDo:
				try {
					// Initialize the InfixExpression object
					infix = new InfixExpression(input);

					/*
					 * The expression is checked whenever the
					 * getPostfixExpression(), evaluate(), and
					 * evaluatePostfixExpression() methods are called.
					 * Also, invoking the isValid() method cases the
					 * isValid() method to invoke the isBalanced()
					 * method.
					 */

					// Get postfix expression
					String postfix = infix.getPostfixExpression();

					// Evaluate the expression
					int evaluated = infix.evaluatePostfix();

					// Print the postfix expression
					print("\n" + postfix);

					// Print the solution
					print("\n" + evaluated);

					infix = null;// Freeing up resources

				} catch (Exception e) {
					// Let the user know something went wrong
					print("\nFail: Invalid expression");
				}
				break;

			}// End of case/switch

		} // End of constant loop

	}// End of the 'Main' method

	/**
	 * Because I find Java's native implementation to be tedious
	 * 
	 * @param msg
	 *            What you want to print to the screen
	 */
	public static void print(String msg) {
		System.out.print(msg);
	}// End of the 'print' method

}// End of the 'Tester' class
