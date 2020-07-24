/**
 * @author Josh Overbeck
 * @version 4.0
 */
public class InfixExpression {

	// Instance variable
	private String infix;

	/**
	 * Constructor
	 */
	public InfixExpression(String newInfix) {
		this.infix = newInfix; // Initialize 'infix'

		clean(); // Clean the expression up

	}// End of the 'Constructor' method

	/**
	 * This should construct a new InfixExpression object, but will
	 * store it as a cleaned up expression. It should make use of the
	 * private clean() method to do the cleaning. The constructor
	 * should throw an IllegalArgumentException if the String
	 * parameter is not valid, calling on the isValid() method for
	 * help.
	 */
	public String toString() {
		// Declaring a string hold the new infix expression
		String result = ""; // Initializing it to empty string

		// Verify that the expression is balanced and valid
		if (!isValid() || !isBalanced()) {
			throw new IllegalArgumentException();
		} else {
			// Creating a new InfixExpression object to hold the
			// clean expression
			InfixExpression expression = new InfixExpression(
					this.infix);
			expression.clean();// Redundant, but that's what the
								// interface wants
			// Setting the result equal to the new InfixExpression
			// object's expression
			result = expression.infix;
		}

		// Sending back the result
		return result;

	}// End of the 'toString' method

	/**
	 * This private method should return true if the infix expression
	 * has balanced parentheses, and false otherwise. It does not
	 * check for any other kinds of invalid expressions. So, for
	 * example, isBalanced() should return true for the invalid infix
	 * expression "( 3 ( ( * * 4 ) 8 ) 7 7 ) 6" because the
	 * parentheses are balanced, even though other things are a mess.
	 *
	 * @return
	 */
	private boolean isBalanced() {
		// Declaring instance of boolean to store the state
		boolean result = true;

		// Declaring object of Linked Stack
		LinkedStack<Character> stack = new LinkedStack<>();

		// Loop through the infix expression
		for (int i = 0; result && (i < infix.length()); i++) {
			char currentchar = infix.charAt(i); // Get the char at the
												// index

			// Grab all of the open separators and put them in a stack
			if (currentchar == '(' || currentchar == '{'
					|| currentchar == '[') {
				stack.push(currentchar);
			}
			// Check for close separators
			if (currentchar == ')' || currentchar == '}'
					|| currentchar == ']') {
				if (stack.isEmpty()) {
					// When there is a close, and stack is empty, the
					// expression is unbalanced
					result = false;
					// Breaking the loop to speed things up
					// return result;
				} else {
					// Otherwise, compare
					char delim = stack.pop();
					// Invoke the isPaired method
					if (!isPaired(delim, currentchar)) {
						result = false;
					}
				}
			}
		} // End loop

		// Check for any leftover char in the stack
		if (!stack.isEmpty()) {
			result = false; // If there are, expression is unbalanced
		}

		return result; // Send back the result
	}// End of the 'isBalanced' method

	/**
	 * This private method should return true if the infix expression
	 * is valid in all respects, and false otherwise. For example,
	 * isValid() should return false for the infix expression "( 3 ( (
	 * * * 4 ) 8 ) 7 7 ) 6", even though the parentheses are balanced.
	 * <p>
	 * !!!!Make sure to test all paths!!!!
	 * </p>
	 * 
	 * @return
	 */
	private boolean isValid() {
		// Declaring boolean to hold the state of the result
		boolean result = true;
		// Declaring an int to be used later, higher scope was
		// preferred
		int digit = -1;
		// Declaring a String to be used later, higher scope was
		// preferred
		String minusOne = "";
		// This is redundant. I only created this string object to
		// make it easier to see what was being tested during the loop
		String forMe = "";

		// Check if balanced first
		if (!isBalanced()) {
			// Return false if not
			return false;
		}

		// Tokenizing
		String[] expression = infix.split(" ");

		// Loop through the tokenized expression
		for (int i = 0; i < expression.length; i++) {
			forMe = expression[i];

			switch (forMe) {
			case "":
				break;// Ignore blank space
			case "+":
			case "-":
			case "*":
			case "/":
			case "%":

				try {
					// Temp holder to make easier to read on smaller
					// screens
					minusOne = expression[i - 1];

					switch (minusOne) {
					case ")":
					case "]":
					case "}":
						break;
					default:
						digit = Integer.parseInt(minusOne);
						break;
					}
				} catch (Exception e) {
					// Invalid expression, shut it down
					return false;
				}
				break;

			case ")":
			case "]":
			case "}":
				try {
					// Test to the left, no error = good
					digit = Integer.parseInt(expression[i - 1]);
					if ((i + 1) < expression.length) {
						// Test to the right, no error = bad
						digit = Integer.parseInt(expression[i + 1]);
						return false;
					}
				} catch (Exception e) {

				}

				break;
			case "(":
			case "{":
			case "[":
				try {

					// Temp holder to make easier to read on smaller
					// screens
					if ((i - 1) >= 0) {
						minusOne = expression[i - 1];

						switch (minusOne) {
						case ")":
						case "]":
						case "}":
						case "^":
							return false;// Invalid input
						case "(":
						case "{":
						case "[":
							break;

						default:

							if ((i + 1) < expression.length) {
								// Test to the right, no error = good
								digit = Integer
										.parseInt(expression[i + 1]);
								// return false;
							}
							// Test to the left, no error = bad
							digit = Integer
									.parseInt(expression[i - 1]);
							return false;// Invalid input
						}//
					} // End of first index check

				} catch (Exception e) {

				}

				break;

			default:
				break;
			}// End of switch/case
		}

		return result;
	}// End of the 'isValid' method

	/**
	 * cleans the expression, cleaning up the provided string by
	 * putting a single space between adjacent tokens, and no leading
	 * or trailing spaces. So, for example, if the parameter is " 3+4*
	 * 83 / 6 ", it should be stored as "3 + 4 * 83 / 6". The only
	 * reason this method exists is to help the constructor. That's
	 * why it is private. One fairly simple approach to this could be
	 * to use the replace() method of the String class to insert
	 * spaces where needed, and to convert multiple spaces into single
	 * spaces.
	 */
	private void clean() {

		infix = infix.replaceAll("\\s+", "");
		infix = infix.replaceAll("\\*", " * ");
		infix = infix.replaceAll("\\/", " / ");
		infix = infix.replaceAll("\\+", " + ");
		infix = infix.replaceAll("\\-", " - ");
		infix = infix.replaceAll("\\[", "[ ");
		infix = infix.replaceAll("\\]", " ]");
		infix = infix.replaceAll("\\(", "( ");
		infix = infix.replaceAll("\\)", " )");
		infix = infix.replaceAll("\\{", "{ ");
		infix = infix.replaceAll("\\}", " }");
		infix = infix.replaceAll("\\%", " % ");
		infix = infix.replaceAll("\\^", " ^ ");

		// For some reason this ')(' cropped up during testing of the
		// isValid() method. So I handled it here
		infix = infix.replaceAll("\\)\\(", " ) ( ");

	}// End of the 'clean' method

	/**
	 * This method should return the postfix expression that
	 * corresponds to the given infix expression. For example, if the
	 * infix expression is "3 + 4" then getPostFixExpression() should
	 * return "3 4 +"
	 * 
	 * @return
	 */
	public String getPostfixExpression() {
		// Declaring a string to hold the postFix expression
		String postFix = "";
		String digit = "";// To handle multi digit integers
		char topOperator;

		// Verify the input
		if (!isValid()) {
			throw new IllegalArgumentException();
		}

		// Creating new stacks to work with
		LinkedStack<Character> operators = new LinkedStack<>();

		// Loop through the infix expression
		for (int i = 0; i < infix.length(); i++) {

			// Tmp holder for current index
			char nextChar = infix.charAt(i);

			if (!Character.isWhitespace(nextChar)) {

				switch (nextChar) {
				case ('0'):
				case ('1'):
				case ('2'):
				case ('3'):
				case ('4'):
				case ('5'):
				case ('6'):
				case ('7'):
				case ('8'):
				case ('9'):
					// Concatenate the current char to 'digit'
					digit += nextChar;
					break;
				case ('^'):
					operators.push(nextChar);
					postFix += " ";// Cushioning
					break;
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':

					while ((!operators.isEmpty()) && getPrecedence(
							nextChar) <= getPrecedence(
									operators.peek())) {

						postFix += operators.peek();
						postFix += " ";// Cushioning
						operators.pop();
					} //
						// Add 'nextChar' to the empty stack
					operators.push(nextChar);
					break;
				case '(':
				case '{':
				case '[':

					operators.push(nextChar);
					break;
				case ')':
					// Get the top operator from stack
					topOperator = operators.pop();

					while (topOperator != '(') {
						// Concatenate top operator to postfix
						// expression
						postFix += topOperator;
						postFix += " ";// Cushioning
						topOperator = operators.pop();
					} //

					break;
				case '}':
					// Get the top operator from stack
					topOperator = operators.pop();

					while (topOperator != '{') {
						// Concatenate top operator to postfix
						// expression
						postFix += topOperator;
						postFix += " ";// Cushioning
						topOperator = operators.pop();
					} //

					break;
				case ']':
					// Get top operator from stack
					topOperator = operators.pop();
					// Concatenate top operator to postfix
					// expression
					while (topOperator != '[') {

						postFix += topOperator;
						postFix += " ";// Cushioning
						topOperator = operators.pop();
					} //

					break;
				default:
					break;// Ignore the unexpected
				}// End of case switch

			} // End of whitespace check
			else {
				if (!digit.equals("")) {
					// Concatenate digit to 'postFix'
					postFix += digit;
					postFix += " ";// To preserve whitespace
				}
				// Reset 'digit'
				digit = "";
			}

		} // End of loop through infix expression

		// Catching final digit
		if (!digit.equals("")) {
			postFix += digit;
			postFix += " ";// To preserve whitespace
		}

		// Pop out remaining operators
		while (!operators.isEmpty()) {
			topOperator = operators.pop();
			postFix += " ";
			postFix += topOperator;
		} // End of final concatenation

		operators = null;// Freeing up resources

		return postFix;
	}// End of the 'getPostfixExpression' method

	/**
	 * This method should evaluate the infix expression, returning the
	 * integer result of the calculation. For example, if the infix
	 * expression is "13 + 4" then evaluatePostfix() should return 17.
	 * 
	 * @return
	 */
	public int evaluatePostfix() {

		// Verify the input
		if (!isValid()) {
			throw new IllegalArgumentException();
		}

		// Creating new stacks to work with
		LinkedStack<Integer> values = new LinkedStack<>();

		// Declaring a string to hold the postfix expression
		String postfix = getPostfixExpression();

		// Declaring a string to help hold digits for multi digit
		// integers
		String digit = "";

		// Loop through postfix expression
		for (int i = 0; i < postfix.length(); i++) {

			// Tmp holder for current index
			char nextChar = postfix.charAt(i);
			if (!Character.isWhitespace(nextChar)) {

				switch (nextChar) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					digit += nextChar;// Concatenating the next digit
					break;
				case '*':
				case '/':
				case '%':
				case '^':
				case '-':
				case '+':
					// Getting the top two numbers
					int opB = values.pop();
					int opA = values.pop();

					// Invoke the solve method
					int resultant = solve(opA, opB, nextChar);
					// Push it back in the stack
					values.push(resultant);
					break;

				default:
					break;// Ignore unexpected values

				}// End of switch/case

			} // End of whitespace test
			else {

				if (!digit.equals("")) {
					// Pushing the newest integer to the stack
					values.push(Integer.parseInt(digit));
				}

				digit = "";// Reseting 'digit'
			}
		} // End of loop through postfix expression

		return values.peek();
	}// End of the 'evaluatePostfix' method

	/**
	 * This method should evaluate the infix expression directly
	 * without converting it to postfix expression, returning the
	 * integer result of the calculation. For example, if the infix
	 * expression is "13 + 4" then evaluate() should return 17. In
	 * this method we are going to convert infix expression directly
	 * by using two stacks.
	 * 
	 * @return
	 */
	public int evaluate() {

		// Verify the input
		if (!isValid()) {
			throw new IllegalArgumentException();
		}

		// Creating new stacks to work with
		StackInterface<Character> operators = new LinkedStack<>();
		StackInterface<Integer> constants = new LinkedStack<>();

		// Declaring instance variables that are reused
		int result = 0;
		int constantA = 0;
		int constantB = 0;
		char topOperator = 'x';

		// Declaring a string to hold digits for multi digit numbers
		String digit = "";

		// Loop through
		for (int i = 0; i < infix.length(); i++) {
			// Tmp holder for current index
			char nextChar = infix.charAt(i);
			if (!Character.isWhitespace(nextChar)) {

				switch (nextChar) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					digit += nextChar;
					break;
				case '^':
					operators.push(nextChar);
					break;
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':

					int topOpPrece = 0;
					int nexChPrece = 0;

					if (!operators.isEmpty()) {
						topOperator = operators.peek();
						topOpPrece = getPrecedence(topOperator);

						nexChPrece = getPrecedence(nextChar);
					}

					while (!operators.isEmpty()
							&& nexChPrece <= topOpPrece) {
						// Evaluate top operator from the stack
						topOperator = operators.pop();
						constantB = constants.pop();
						constantA = constants.pop();
						// Solve it
						result = solve(constantA, constantB,
								topOperator);
						constants.push(result);
					}

					operators.push(nextChar);
					break;
				case '(':
					operators.push(nextChar);
					break;
				case ')':
					topOperator = operators.pop();

					while (topOperator != '(') {
						// Get next two constants
						constantB = constants.pop();
						constantA = constants.pop();
						// Solve
						result = solve(constantA, constantB,
								topOperator);
						// Push the result into the constants stack
						constants.push(result);
						// Increment the operator
						topOperator = operators.pop();
					}
					break;

				default:
					break; // Ignore non-conforming characters

				}// End of switch/case

			} // End white space check
			else {

				if (!digit.equals("")) {
					constants.push(Integer.parseInt(digit));
				}
				digit = "";// Resetting digit
			}

		} // End for loop through infix expression

		// Pushing 'digit' to 'constants' when at end of multi digit
		// integer
		if (!digit.equals("")) {
			constants.push(Integer.parseInt(digit));
		}

		while (!operators.isEmpty()) {
			// Getting the top operator from the operators stack
			topOperator = operators.pop();
			// Getting the top two numbers from the constants stack
			constantB = constants.pop();
			constantA = constants.pop();
			// Invoke solve method to save space
			result = solve(constantA, constantB, topOperator);
			// Pushing the result back into constants stack
			constants.push(result);

		} // End of, while operators not empty

		return constants.peek();
	}// End of the 'evaluate' method

	/**
	 * This is a helper method. It will take in a mathematical
	 * operator in the form of a char, and will return an integer
	 * indicating the operator's precedence. For example:
	 * <ul>
	 * <li>'+' = 1</li>
	 * <li>'-' = 1</li>
	 * <li>'*' = 2</li>
	 * <li>'/' = 2</li>
	 * <li>'^' = 3</li>
	 * </ul>
	 *
	 * @param symbol
	 * @return the precedence of the operator passed through
	 */
	private int getPrecedence(char symbol) {

		int result = -1;// Instance variable to hold the result

		switch (symbol) {
		case ('-'):
			result = 1;
			break;
		case ('+'):
			result = 1;
			break;
		case ('/'):
			result = 2;
			break;
		case ('*'):
			result = 2;
			break;
		case ('%'):
			result = 2;
			break;
		case ('^'):
			result = 3;
			break;
		default:
			break;// Ignoring non- operators
		}

		return result;
	}// End of the 'getPrecedence' method

	/**
	 * This is a helper method. It will help keep the evaluate method
	 * from being too big. And help to keep from repeating code.
	 *
	 * @param a
	 * @param b
	 * @param operator
	 * @return the result of the operation
	 */
	private int solve(int a, int b, char operator) {
		int result = 0;

		switch (operator) {
		case ('-'):
			result = a - b;
			break;
		case ('+'):
			result = a + b;
			break;
		case ('*'):
			result = a * b;
			break;
		case ('/'):
			result = a / b;
			break;
		case ('^'):
			result = (int) Math.pow(a, b);
			break;
		case ('%'):
			result = a % b;
			break;
		default:
			break; // Ignoring unexpected characters
		}

		return result;
	}// End of the 'solve' method

	/**
	 * This is the method that will test if a delimiters passed
	 * through are paired or not
	 * 
	 * @param openDelimiter
	 * @param nextChar
	 * @return True if they are paired, false if not
	 */
	private boolean isPaired(char openDelimiter, char nextChar) {
		boolean result = false;

		if (openDelimiter == '(' && nextChar == ')') {
			result = true;
		}
		if (openDelimiter == '{' && nextChar == '}') {
			result = true;
		}
		if (openDelimiter == '[' && nextChar == ']') {
			result = true;
		}

		return result;

	}// End of the 'isPaired' method

}// End of the 'InfixExpression' class
