public class MyTester {

	final static String					border		= "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
	final static String					classBorder	= ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
	static StackInterface<Character>	stack;
	static InfixExpression				infix;

	public static void main(String[] args) {
		try {
			// >>>>>>>>>Node Class>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			// print(classBorder); //Good to GO
			// print("\tNode Class Test"); //Good to GO
			// nodeConstructorTest(); //Good to GO
			// overloadedNodeConstructorTest(); //Good to GO
			// secondOverloadedNodeConstructorTest(); //Good to GO

			// >>>>>>>>>>LinkedStack Class>>>>>>>>>>>>>>>>>>>>>>
			// print(classBorder); //Good to GO
			// print("\tLinkedStack Class Test"); //Good toGO
			// linkedStackConstructorTest(); //Good to GO
			// pushTest(); //Good to GO
			// popTest(); //Good to GO
			// peekTest(); //Good to GO
			// isEmptyTest(); //Good to GO
			// clearTest(); //Good to GO

			// >>>>>>>>>InfixExpression Class>>>>>>>>>>>>>>>>>>>>
			print(classBorder);
			print("\tInfixExpression Class Test");
			// infixConstructorTest(); //Good to Go
			// toStringTest(); // Good to GO
			// isBalancedTest(); // Good to GO
			// isValidTest(); // Good to GO: BUT test 101 was weird
			// cleanTest();// Good to GO
			// getPostfixExpressionTest();// Good to GO
			// evaluatePostfixTest(); // Good to GO
			// evaluateTest(); // Good to GO
			// getPrecedenceTest(); // SO far so GOOD
			// solveTest(); // SO far so GOOD

		} catch (Exception e) {
			// Nada
			print("Error: " + e);
		}
	}// main

	/**
	 * I wrote this because I think that Java's native implementation
	 * is tedious
	 * 
	 * @param msg
	 *            The message that you want to print to the console
	 */
	public static void print(String msg) {
		System.out.println(msg);
	}// End of the 'print' method

	// >>>>>>>>>>>>>>>>>Life Cycles>>>>>>>>>>>>>>>>>>>>>>>>

	public static void onCreateStack() {
		stack = new LinkedStack<>();
	}// End of the 'onCreateStack' method

	public static void onDestroyStack() {
		stack = null;
	}// End of the 'onDestroyStack' method

	public static void onDestroyInfix() {
		infix = null;
	}// End of the 'onDestroyInfix' method

	// >>>>>>>>>>>>>>LinkedStack class>>>>>>>>>>>>>>>>>>>>

	/**
	 * This is the method that will test the constructor in the
	 * LinkedStack class
	 */
	public static void linkedStackConstructorTest() {
		print(border);
		print("Testing Linked Stack Constructor");
		onCreateStack();
		print("Success");
		onDestroyStack();
	}// End of the 'linkedStackConstructorTest' method

	/**
	 * This is the method that will test the push method in the
	 * LinkedStack class
	 */
	public static void pushTest() {
		print(border);
		print("Testing push() method");
		onCreateStack();

		stack.push('6');
		print("Expecting: 6");
		print("Result: " + stack.peek());

		onDestroyStack();

	}// end of the 'pushTest' method

	/**
	 * This is the method that will test the pop method in the
	 * LinkedStack class
	 */
	public static void popTest() {
		print(border);
		print("Testing pop() method");
		onCreateStack();

		stack.push('2');
		print("Expecting: 2");
		print("Result: " + stack.pop());

		onDestroyStack();

		onCreateStack();
		print("\nPushing: 4, 8, 9, 1, 2, 7");
		stack.push('4');
		stack.push('8');
		stack.push('9');
		stack.push('1');
		stack.push('2');
		stack.push('7');
		print("Clearing stack");
		print("Expecting: 7");
		print("Result: " + stack.pop());

		print("\nExpecting: 2");
		print("Result: " + stack.pop());

		print("\nExpecting: 1");
		print("Result: " + stack.pop());

		print("\nExpecting: 9");
		print("Result: " + stack.pop());

		print("\nExpecting: 8");
		print("Result: " + stack.pop());

		print("\nExpecting: 4");
		print("Result: " + stack.pop());

		onDestroyStack();
	}// End of the 'popTest' method

	/**
	 * This is the method that will test the peek method in the
	 * LinkedStack class
	 */
	public static void peekTest() {
		print(border);
		print("Testing peek() method");
		onCreateStack();

		stack.push('9');
		print("Expecting: 9");
		print("Result: " + stack.peek());

		print("\nPushing: 4, 8, 9, 1, 2, 7");
		stack.push('4');
		stack.push('8');
		stack.push('9');
		stack.push('1');
		stack.push('2');
		stack.push('7');
		print("Expecting: 7");
		print("Result: " + stack.peek());

		onDestroyStack();
	}// End of the 'peekTest' method

	/**
	 * This is the method that will test the isEmpty method in the
	 * LinkedStack class
	 */
	public static void isEmptyTest() {
		print(border);
		print("Testing isEmpty() method");
		onCreateStack();

		print("Expecting: true");
		print("Result: " + stack.isEmpty());

		print("\nPushing: 8");
		stack.push('8');
		print("Expecting: false");
		print("Result: " + stack.isEmpty());
		print(Character.toString(stack.peek()));

		onDestroyStack();
	}// End of the 'isEmptyTest' method

	/**
	 * This is the method that will test the clear method in the
	 * LinkedStack class
	 */
	public static void clearTest() {
		print(border);
		print("Testing clear() method");
		onCreateStack();

		print("Pushing: 4");
		stack.push('4');
		print("Clearing stack");
		print("Expecting: true");
		stack.clear();
		print("Result: " + stack.isEmpty());

		onDestroyStack();

		onCreateStack();
		print("\nPushing: 4, 8, 9, 1, 2, 7");
		stack.push('4');
		stack.push('8');
		stack.push('9');
		stack.push('1');
		stack.push('2');
		stack.push('7');
		print("Clearing stack");
		print("Expecting: true");
		stack.clear();
		print("Result: " + stack.isEmpty());

		onDestroyStack();
	}// End of the 'clearTest' method

	// >>>>>>>>>>>>>>>Node class>>>>>>>>>>>>>>>>>>>>>

	/**
	 * This is the method that will test the Constructor in the Node
	 * class
	 */
	public static void nodeConstructorTest() {

	}// End of the 'nodeConstructorTest' method

	/**
	 * This is the method that will test the overloaded constructor in
	 * the Node class
	 */
	public static void overloadedNodeConstructorTest() {

	}// End of the 'overloadedNodeConstructorTest' method

	/**
	 * This is the method that will test the second Overloaded
	 * Constructor in the Node class
	 */
	public static void secondOverloadedNodeConstructorTest() {

	}// End of the 'secondOverloadedNodeConstructorTest' method

	// >>>>>>>>>>>>>>>InfixExpression Class >>>>>>>>>>>
	/**
	 * This is the method that will test the Constructor in the
	 * InfixExpression class
	 */
	public static void infixConstructorTest() {

		print("\nTesting the Constructor in the InfixExpress class");
		infix = new InfixExpression("(2+5)-(1*1)");
		print("Success");

		onDestroyInfix();
	}// End of the 'infixConstructorTest' method

	/**
	 * This is the method that will test the toString() method in the
	 * InfixExpression class
	 */
	public static void toStringTest() {

		// Test 1
		print("\nTesting the toString() method");
		print(border);
		print("Test: 1");
		print("Testing: (2+5)-(1*1)");
		print("Expected: ( 2 + 5 ) - ( 1 * 1 ) ");
		infix = new InfixExpression("(2+5)-(1*1)");
		print("Result: " + infix.toString());

		print("\n" + border);
		print("End of the toString() Test");
		print(border);

		onDestroyInfix();
	}// End of the 'toStringTest' method

	/**
	 * This is the method that will test the isBalanced() method from
	 * the InfixExpression class. I had to temporarily make it public
	 * in order to test it
	 */
	public static void isBalancedTest() {
		//
		// // Test 1
		// print("Testing the isBalanced() method");
		// print(border);
		// print("\nTest: 1");
		// print("Testing: ()");
		// print("Expected: true");
		// infix = new InfixExpression("()");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 2
		// print(border);
		// print("\nTest: 2");
		// print("Testing: (3+2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(3+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 3
		// print(border);
		// print("\nTest: 3");
		// print("Testing: (3+2) - 7");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(3+2) - 7");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 4
		// print(border);
		// print("\nTest: 4");
		// print("Testing: (3+2) * (2+2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(3+2) * (2+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 5
		// print(border);
		// print("\nTest: 5");
		// print("Testing: [(3+2) * (2+2)]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[(3+2) * (2+2)]");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 6
		// print(border);
		// print("\nTest: 6");
		// print("Testing: {(3+2) * (2+2)}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{(3+2) * (2+2)}");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 7
		// print(border);
		// print("\nTest: 7");
		// print("Testing: {[(3+2) * (2+2)] / 3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{[(3+2) * (2+2)] / 3}");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 8
		// print(border);
		// print("\nTest: 8");
		// print("Testing: (3+2)^2 * (2+2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(3+2)^2 * (2+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 9
		// print(border);
		// print("\nTest: 9");
		// print("Testing: (3+2)^2 ** (2+2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(3+2)^2 ** (2+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 10
		// print(border);
		// print("\nTest: 10");
		// print("Testing: (3+2)^2 */ (2+2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(3+2)^2 */ (2+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 11
		// print(border);
		// print("\nTest: 11");
		// print("Testing: (3+2)^2 *- (2+2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(3+2)^2 *- (2+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 12
		// print(border);
		// print("\nTest: 12");
		// print("Testing: (3+2)^2 *+ (2+2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(3+2)^2 *+ (2+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 13
		// print(border);
		// print("\nTest: 13");
		// print("Testing: (3+2)^2 *^ (2+2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(3+2)^2 *^ (2+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 14
		// print(border);
		// print("\nTest: 14");
		// print("Testing: (3+2)^2 * (2+2");
		// print("Expected: false");
		// infix = null;
		// infix = new InfixExpression("(3+2)^2 * (2+2");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 15
		// print(border);
		// print("\nTest: 15");
		// print("Testing: (3+2)^2 * (2+2}");
		// print("Expected: false");
		// infix = null;
		// infix = new InfixExpression("(3+2)^2 * (2+2}");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 16
		// print(border);
		// print("\nTest: 16");
		// print("Testing: (3+2)^2 * (2+2]");
		// print("Expected: false");
		// infix = null;
		// infix = new InfixExpression("(3+2)^2 * (2+2]");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 17
		// print(border);
		// print("\nTest: 17");
		// print("Testing: 3+2)^2 * (2+2)");
		// print("Expected: false");
		// infix = null;
		// infix = new InfixExpression("3+2)^2 * (2+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 18
		// print(border);
		// print("\nTest: 18");
		// print("Testing: {3+2)^2 * (2+2)");
		// print("Expected: false");
		// infix = null;
		// infix = new InfixExpression("{3+2)^2 * (2+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 19
		// print(border);
		// print("\nTest: 19");
		// print("Testing: [3+2)^2 * (2+2)");
		// print("Expected: false");
		// infix = null;
		// infix = new InfixExpression("[3+2)^2 * (2+2)");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 20
		// print(border);
		// print("\nTest: 20");
		// print("Testing: 2 + 3 -1 *4 / 1 ^2");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("2 + 3 -1 *4 / 1 ^2");
		// print("Result: " + infix.isBalanced());
		//
		// // Test 21
		// print(border);
		// print("\nTest: 21");
		// print("Testing: 8%3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("8%3");
		// print("Result: " + infix.isBalanced());
		//
		// print("\n" + border);
		// print("End of the isBalanced() Test");
		// print(border);
		//
		// onDestroyInfix();
	}// End of the 'isBalancedTest' method

	/**
	 * This is the method that will test the isValid() method in the
	 * InfixExpression class. I had to temporarily make it public in
	 * order to test it.
	 */
	public static void isValidTest() {
		//
		// // Test 1
		// print("\nTesting the evaluate() method");
		// print(border);
		// print("Test: 1");
		// print("Testing: 3+4");
		// print("Expected: true");
		// infix = new InfixExpression("3+4");
		// print("Result: " + infix.isValid());
		//
		// // Test 2
		// print(border);
		// print("Test: 2");
		// print("Testing: 4-3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("4-3");
		// print("Result: " + infix.isValid());
		//
		// // Test 3
		// print(border);
		// print("Test: 3");
		// print("Testing: 4*3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("4*3");
		// print("Result: " + infix.isValid());
		//
		// // Test 4
		// print(border);
		// print("Test: 4");
		// print("Testing: 4/3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("4/3");
		// print("Result: " + infix.isValid());
		//
		// // Test 5
		// print(border);
		// print("Test: 5");
		// print("Testing: 4%3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("4%3");
		// print("Result: " + infix.isValid());
		//
		// // Test 6
		// print(border);
		// print("Test: 6");
		// print("Testing: 4^3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("4^3");
		// print("Result: " + infix.isValid());
		//
		// // Test 7
		// print(border);
		// print("Test: 7");
		// print("Testing: 44-3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("44-3");
		// print("Result: " + infix.isValid());
		//
		// // Test 8
		// print(border);
		// print("Test: 8");
		// print("Testing: 44+3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("44+3");
		// print("Result: " + infix.isValid());
		//
		// // Test 9
		// print(border);
		// print("Test: 9");
		// print("Testing: 44*3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("44*3");
		// print("Result: " + infix.isValid());
		//
		// // Test 10
		// print(border);
		// print("Test: 10");
		// print("Testing: 44%3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("44%3");
		// print("Result: " + infix.isValid());
		//
		// // Test 11
		// print(border);
		// print("Test: 11");
		// print("Testing: 44^3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("44^3");
		// print("Result: " + infix.isValid());
		//
		// // Test 12
		// print(border);
		// print("Test: 12");
		// print("Testing: 44-33");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("44-33");
		// print("Result: " + infix.isValid());
		//
		// // Test 13
		// print(border);
		// print("Test: 13");
		// print("Testing: 44+33");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("44+33");
		// print("Result: " + infix.isValid());
		//
		// // Test 14
		// print(border);
		// print("Test: 14");
		// print("Testing: 44*33");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("44*33");
		// print("Result: " + infix.isValid());
		//
		// // Test 15
		// print(border);
		// print("Test: 15");
		// print("Testing: 44%33");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("44%33");
		// print("Result: " + infix.isValid());
		//
		// // Test 16
		// print(border);
		// print("Test: 16");
		// print("Testing: 44^3");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("44^3");
		// print("Result: " + infix.isValid());
		//
		// // Test 17
		// print(border);
		// print("Test: 17");
		// print("Testing: {4+3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{4+3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 18
		// print(border);
		// print("Test: 18");
		// print("Testing: {4-3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{4-3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 19
		// print(border);
		// print("Test: 19");
		// print("Testing: {4*3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{4*3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 20
		// print(border);
		// print("Test: 20");
		// print("Testing: {4/3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{4/3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 21
		// print(border);
		// print("Test: 21");
		// print("Testing: {4%3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{4%3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 22
		// print(border);
		// print("Test: 22");
		// print("Testing: {4^3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{4^3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 23
		// print(border);
		// print("Test: 23");
		// print("Testing: {44-3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{44-3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 24
		// print(border);
		// print("Test: 24");
		// print("Testing: {44+3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{44+3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 25
		// print(border);
		// print("Test: 25");
		// print("Testing: {44*3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{44*3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 26
		// print(border);
		// print("Test: 26");
		// print("Testing: {44%3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{44%3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 27
		// print(border);
		// print("Test: 27");
		// print("Testing: {44^3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{44^3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 28
		// print(border);
		// print("Test: 28");
		// print("Testing: {44-33}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{44-33}");
		// print("Result: " + infix.isValid());
		//
		// // Test 29
		// print(border);
		// print("Test: 29");
		// print("Testing: {44+33}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{44+33}");
		// print("Result: " + infix.isValid());
		//
		// // Test 30
		// print(border);
		// print("Test: 30");
		// print("Testing: {44*33}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{44*33}");
		// print("Result: " + infix.isValid());
		//
		// // Test 31
		// print(border);
		// print("Test: 31");
		// print("Testing: {44%33}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{44%33}");
		// print("Result: " + infix.isValid());
		//
		// // Test 32
		// print(border);
		// print("Test: 32");
		// print("Testing: {44^3}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{44^3}");
		// print("Result: " + infix.isValid());
		//
		// // Test 33
		// print(border);
		// print("Test: 33");
		// print("Testing: [4+3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[4+3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 34
		// print(border);
		// print("Test: 34");
		// print("Testing: [4-3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[4-3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 35
		// print(border);
		// print("Test: 35");
		// print("Testing: [4*3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[4*3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 36
		// print(border);
		// print("Test: 36");
		// print("Testing: [4/3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[4/3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 37
		// print(border);
		// print("Test: 37");
		// print("Testing: [4%3]");
		// print("Expected: trues");
		// infix = null;
		// infix = new InfixExpression("[4%3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 38
		// print(border);
		// print("Test: 38");
		// print("Testing: [4^3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[4^3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 39
		// print(border);
		// print("Test: 39");
		// print("Testing: [44-3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[44-3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 40
		// print(border);
		// print("Test: 40");
		// print("Testing: [44+3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[44+3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 41
		// print(border);
		// print("Test: 41");
		// print("Testing: [44*3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[44*3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 42
		// print(border);
		// print("Test: 42");
		// print("Testing: [44%3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[44%3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 43
		// print(border);
		// print("Test: 43");
		// print("Testing: [44^3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[44^3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 44
		// print(border);
		// print("Test: 44");
		// print("Testing: [44-33]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[44-33]");
		// print("Result: " + infix.isValid());
		//
		// // Test 45
		// print(border);
		// print("Test: 45");
		// print("Testing: [44+33]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[44+33]");
		// print("Result: " + infix.isValid());
		//
		// // Test 46
		// print(border);
		// print("Test: 46");
		// print("Testing: [44*33]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[44*33]");
		// print("Result: " + infix.isValid());
		//
		// // Test 47
		// print(border);
		// print("Test: 47");
		// print("Testing: [44%33]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[44%33]");
		// print("Result: " + infix.isValid());
		//
		// // Test 48
		// print(border);
		// print("Test: 48");
		// print("Testing: [44^3]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[44^3]");
		// print("Result: " + infix.isValid());
		//
		// // Test 49
		// print(border);
		// print("Test: 49");
		// print("Testing: (4+3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(4+3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 50
		// print(border);
		// print("Test: 50");
		// print("Testing: (4-3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(4-3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 51
		// print(border);
		// print("Test: 51");
		// print("Testing: (4*3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(4*3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 52
		// print(border);
		// print("Test: 52");
		// print("Testing: (4/3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(4/3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 53
		// print(border);
		// print("Test: 53");
		// print("Testing: (4%3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(4%3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 54
		// print(border);
		// print("Test: 54");
		// print("Testing: (4^3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(4^3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 55
		// print(border);
		// print("Test: 55");
		// print("Testing: (44-3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44-3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 56
		// print(border);
		// print("Test: 56");
		// print("Testing: (44+3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44+3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 57
		// print(border);
		// print("Test: 57");
		// print("Testing: (44*3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 58
		// print(border);
		// print("Test: 58");
		// print("Testing: (44%3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44%3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 59
		// print(border);
		// print("Test: 59");
		// print("Testing: (44^3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44^3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 60
		// print(border);
		// print("Test: 60");
		// print("Testing: (44-33)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44-33)");
		// print("Result: " + infix.isValid());
		//
		// // Test 61
		// print(border);
		// print("Test: 61");
		// print("Testing: (44+33)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44+33)");
		// print("Result: " + infix.isValid());
		//
		// // Test 62
		// print(border);
		// print("Test: 62");
		// print("Testing: (44*33)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)");
		// print("Result: " + infix.isValid());
		//
		// // Test 63
		// print(border);
		// print("Test: 63");
		// print("Testing: (44%33)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44%33)");
		// print("Result: " + infix.isValid());
		//
		// // Test 64
		// print(border);
		// print("Test: 64");
		// print("Testing: (44^3)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44^3)");
		// print("Result: " + infix.isValid());
		//
		// // Test 65
		// print(border);
		// print("Test: 65");
		// print("Testing: (44*33)-1");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)-1");
		// print("Result: " + infix.isValid());
		//
		// // Test 66
		// print(border);
		// print("Test: 66");
		// print("Testing: (44*33)+1");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)+1");
		// print("Result: " + infix.isValid());
		//
		// // Test 67
		// print(border);
		// print("Test: 67");
		// print("Testing: (44*33)*1");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)*1");
		// print("Result: " + infix.isValid());
		//
		// // Test 68
		// print(border);
		// print("Test: 68");
		// print("Testing: (44*33)/1");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)/1");
		// print("Result: " + infix.isValid());
		//
		// // Test 69
		// print(border);
		// print("Test: 69");
		// print("Testing: (44*33)%1");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)%1");
		// print("Result: " + infix.isValid());
		//
		// // Test 70
		// print(border);
		// print("Test: 70");
		// print("Testing: (44*33)^1");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)^1");
		// print("Result: " + infix.isValid());
		//
		// // Test 71
		// print(border);
		// print("Test: 71");
		// print("Testing: (44*33)+(1*2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)+(1*2)");
		// print("Result: " + infix.isValid());
		//
		// // Test 72
		// print(border);
		// print("Test: 72");
		// print("Testing: (44*33)-(1*2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)-(1*2)");
		// print("Result: " + infix.isValid());
		//
		// // Test 73
		// print(border);
		// print("Test: 73");
		// print("Testing: (44*33)*(1*2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)*(1*2)");
		// print("Result: " + infix.isValid());
		//
		// // Test 74
		// print(border);
		// print("Test: 74");
		// print("Testing: (44*33)/(1*2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)/(1*2)");
		// print("Result: " + infix.isValid());
		//
		// // Test 75
		// print(border);
		// print("Test: 75");
		// print("Testing: (44*33)%(1*2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)%(1*2)");
		// print("Result: " + infix.isValid());
		//
		// // Test 76
		// print(border);
		// print("Test: 76");
		// print("Testing: (44*33)^(1*2)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(44*33)^(1*2)");
		// print("Result: " + infix.isValid());
		//
		// // Test 77
		// print(border);
		// print("Test: 77");
		// print("Testing: {(44*33)+(1*2)}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{(44*33)+(1*2)}");
		// print("Result: " + infix.isValid());
		//
		// // Test 78
		// print(border);
		// print("Test: 78");
		// print("Testing: [(44*33)+(1*2)]");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[(44*33)+(1*2)]");
		// print("Result: " + infix.isValid());
		//
		// // Test 79
		// print(border);
		// print("Test: 79");
		// print("Testing: ((44*33)+(1*2))");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("((44*33)+(1*2))");
		// print("Result: " + infix.isValid());
		//
		// // Test 80
		// print(border);
		// print("\nTest: 80");
		// print("Testing: (2+5)-(1*1)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(2+5)-(1*1)");
		// print("Result: " + infix.isValid());
		//
		// // Test 81
		// print(border);
		// print("\nTest: 81");
		// print("Testing: 2+5");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("2+5");
		// print("Result: " + infix.isValid());
		//
		// // Test 82
		// print(border);
		// print("\nTest: 82");
		// print("Testing: 5-2");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("5-2");
		// print("Result: " + infix.isValid());
		//
		// // Test 83
		// print(border);
		// print("\nTest: 83");
		// print("Testing: 2*5");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("2*5");
		// print("Result: " + infix.isValid());
		//
		// // Test 84
		// print(border);
		// print("\nTest: 84");
		// print("Testing: 10/2");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("10/2");
		// print("Result: " + infix.isValid());
		//
		// // Test 85
		// print(border);
		// print("\nTest: 85");
		// print("Testing: 2^5");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("2^5");
		// print("Result: " + infix.isValid());
		//
		// // Test 86
		// print(border);
		// print("\nTest: 86");
		// print("Testing: 2+(5)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("2+(5)");
		// print("Result: " + infix.isValid());
		//
		// // Test 87
		// print(border);
		// print("\nTest: 87");
		// print("Testing: (2)+5");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(2)+5");
		// print("Result: " + infix.isValid());
		//
		// // Test 88
		// print(border);
		// print("\nTest: 88");
		// print("Testing: (2+5)-1");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(2+5)-1");
		// print("Result: " + infix.isValid());
		//
		// // Test 89
		// print(border);
		// print("\nTest: 89");
		// print("Testing: (2+5)-(1)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("(2+5)-(1)");
		// print("Result: " + infix.isValid());
		//
		// // Test 90
		// print(border);
		// print("\nTest: 90");
		// print("Testing: [2+3]*(1+1)");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[2+3]*(1+1)");
		// print("Result: " + infix.isValid());
		//
		// // Test 91
		// print(border);
		// print("\nTest: 91");
		// print("Testing: [2+3]*(1+1)^2");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("[2+3]*(1+1)^2");
		// print("Result: " + infix.isValid());
		//
		// // Test 92
		// print(border);
		// print("\nTest: 92");
		// print("Testing: {[2+3]*(1+1)}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{[2+3]*(1+1)}");
		// print("Result: " + infix.isValid());
		//
		// // Test 93
		// print(border);
		// print("\nTest: 93");
		// print("Testing: {[(2+3)^2]*(1+1)}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{[(2+3)^2]*(1+1)}");
		// print("Result: " + infix.isValid());
		//
		// // Test 94
		// print(border);
		// print("\nTest: 94");
		// print("Testing: 5");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("5");
		// print("Result: " + infix.isValid());
		//
		// // Test 95
		// print(border);
		// print("\nTest: 95");
		// print("Testing: ((4+2))");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("((4+2))");
		// print("Result: " + infix.isValid());
		//
		// // Test 96
		// print(border);
		// print("\nTest: 96");
		// print("Testing: {(2+3)^2*(1+1)}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{(2+3)^2*(1+1)}");
		// print("Result: " + infix.isValid());
		//
		// // Test 97
		// print(border);
		// print("\nTest: 97");
		// print("Testing: {(2+3)(1+1)}");
		// print("Expected: false");
		// infix = null;
		// infix = new InfixExpression("{(2+3)(1+1)}");
		// print("Result: " + infix.isValid());
		//
		// // Test 98
		// print(border);
		// print("\nTest: 98");
		// print("Testing: {(21+3)(1+1)}");
		// print("Expected: false");
		// infix = null;
		// infix = new InfixExpression("{(21+3)(1+1)}");
		// print("Result: " + infix.isValid());
		//
		// // Test 99
		// print(border);
		// print("\nTest: 99");
		// print("Testing: {(21+3)*(1+1)}");
		// print("Expected: true");
		// infix = null;
		// infix = new InfixExpression("{(21+3)*(1+1)}");
		// print("Result: " + infix.isValid());
		//
		// // Test 100
		// print(border);
		// print("\nTest: 100");
		// print("Testing: 5**2");
		// print("Expected: false");
		// infix = null;
		// infix = new InfixExpression("5**2");
		// print("Result: " + infix.isValid());
		//
		// // Test 101
		// print(border);
		// print("\nTest: 101");
		// print("Testing: 5^2(3)");
		// print("Expected: false");
		// infix = null;
		// infix = new InfixExpression("5^2(3)");
		// print("Result: " + infix.isValid());
		//
		// print("\n" + border);
		// print("End of the isValid() Test");
		// print(border);
		//
		// onDestroyInfix();
	}// End of the 'isValidTest' method

	/**
	 * This is the method that will test the clean() method from the
	 * InfixExpression class. I had to temporarily make it public in
	 * order to test it.
	 */
	public static void cleanTest() {

		// // Test 1
		// print("\nTesting the clean() method");
		// print(border);
		// print("Test: 1");
		// print("Expected: ( 2 + 5 ) - ( 1 * 1 ) ");
		// infix = new InfixExpression("(2+5)-(1*1)");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 2
		// print(border);
		// print("Test: 2");
		// print("Expected: 5 ");
		// infix = null;
		// infix = new InfixExpression("5");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 3
		// print(border);
		// print("Test: 3");
		// print("Expected: 5 * 2 ");
		// infix = null;
		// infix = new InfixExpression("5*2");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 4
		// print(border);
		// print("Test: 4");
		// print("Expected: ( 5 ) ");
		// infix = null;
		// infix = new InfixExpression("(5)");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 5
		// print(border);
		// print("Test: 5");
		// print("Expected: ( 5 * 2 ) ");
		// infix = null;
		// infix = new InfixExpression("(5*2)");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 6
		// print(border);
		// print("Test: 6");
		// print("Expected: ( 5 * 2 ) ");
		// infix = null;
		// infix = new InfixExpression(" ( 5 * 2 ) ");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 7
		// print(border);
		// print("Test: 7");
		// print("Expected: ( 5 * 3 ) ");
		// infix = null;
		// infix = new InfixExpression("( 5 * 3 ) ");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 8
		// print(border);
		// print("Test: 8");
		// print("Expected: 5 + 2 ");
		// infix = null;
		// infix = new InfixExpression("5+2");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 9
		// print(border);
		// print("Test: 9");
		// print("Expected: 5 - 2 ");
		// infix = null;
		// infix = new InfixExpression("5-2");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 10
		// print(border);
		// print("Test: 10");
		// print("Expected: 5 / 2 ");
		// infix = null;
		// infix = new InfixExpression("5/2");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 11
		// print(border);
		// print("Test: 11");
		// print("Expected: 5 % 2 ");
		// infix = null;
		// infix = new InfixExpression("5%2");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 12
		// print(border);
		// print("Test: 12");
		// print("Expected: 5 ^ 2 ");
		// infix = null;
		// infix = new InfixExpression("5^2");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 13
		// print(border);
		// print("Test: 13");
		// print("Expected: ( 5 + 2 ) ");
		// infix = null;
		// infix = new InfixExpression("(5+2)");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 14
		// print(border);
		// print("Test: 14");
		// print("Expected: ( 5 - 2 ) ");
		// infix = null;
		// infix = new InfixExpression("(5-2)");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 15
		// print(border);
		// print("Test: 15");
		// print("Expected: ( 5 * 2 ) ");
		// infix = null;
		// infix = new InfixExpression("(5*2)");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 16
		// print(border);
		// print("Test: 16");
		// print("Expected: ( 5 / 2 ) ");
		// infix = null;
		// infix = new InfixExpression("(5/2)");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 17
		// print(border);
		// print("Test: 17");
		// print("Expected: ( 5 % 2 ) ");
		// infix = null;
		// infix = new InfixExpression("(5%2)");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 18
		// print(border);
		// print("Test: 18");
		// print("Expected: ( 5 ^ 2 ) ");
		// infix = null;
		// infix = new InfixExpression("(5^2)");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 19
		// print(border);
		// print("Test: 19");
		// print("Expected: [ 5 + 1 ] ");
		// infix = null;
		// infix = new InfixExpression("[5+1]");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 20
		// print(border);
		// print("Test: 20");
		// print("Expected: [ 5 - 1 ] ");
		// infix = null;
		// infix = new InfixExpression("[5-1]");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 21
		// print(border);
		// print("Test: 21");
		// print("Expected: [ 5 * 1 ] ");
		// infix = null;
		// infix = new InfixExpression("[5*1]");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 22
		// print(border);
		// print("Test: 22");
		// print("Expected: [ 5 / 1 ] ");
		// infix = null;
		// infix = new InfixExpression("[5/1]");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 23
		// print(border);
		// print("Test: 23");
		// print("Expected: [ 5 % 1 ] ");
		// infix = null;
		// infix = new InfixExpression("[5%1]");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 24
		// print(border);
		// print("Test: 24");
		// print("Expected: [ 5 ^ 1 ] ");
		// infix = null;
		// infix = new InfixExpression("[5^1]");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 25
		// print(border);
		// print("Test: 25");
		// print("Expected: { 5 } ");
		// infix = null;
		// infix = new InfixExpression("{5}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 26
		// print(border);
		// print("Test: 26");
		// print("Expected: { 5 + 4 } ");
		// infix = null;
		// infix = new InfixExpression("{5+4}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 27
		// print(border);
		// print("Test: 27");
		// print("Expected: { 5 - 4 } ");
		// infix = null;
		// infix = new InfixExpression("{5-4}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 28
		// print(border);
		// print("Test: 28");
		// print("Expected: { 5 * 4 } ");
		// infix = null;
		// infix = new InfixExpression("{5*4}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 29
		// print(border);
		// print("Test: 29");
		// print("Expected: { 5 / 4 } ");
		// infix = null;
		// infix = new InfixExpression("{5/4}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 30
		// print(border);
		// print("Test: 30");
		// print("Expected: { 5 % 4 } ");
		// infix = null;
		// infix = new InfixExpression("{5%4}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 31
		// print(border);
		// print("Test: 31");
		// print("Expected: { 5 ^ 4 } ");
		// infix = null;
		// infix = new InfixExpression("{5^4}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 32
		// print(border);
		// print("Test: 32");
		// print("Expected: { } ");
		// infix = null;
		// infix = new InfixExpression("{}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 33
		// print(border);
		// print("Test: 33");
		// print("Expected: { ( ) } ");
		// infix = null;
		// infix = new InfixExpression("{()}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 34
		// print(border);
		// print("Test: 34");
		// print("Expected: { [ ( ) ] } ");
		// infix = null;
		// infix = new InfixExpression("{[()]}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 35
		// print(border);
		// print("Test: 35");
		// print("Expected: { [ ( 4 ) ] } ");
		// infix = null;
		// infix = new InfixExpression("{[(4)]}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 36
		// print(border);
		// print("Test: 36");
		// print("Expected: { [ ( 4 ) + 3 ] } ");
		// infix = null;
		// infix = new InfixExpression("{[(4)+3]}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 37
		// print(border);
		// print("Test: 37");
		// print("Expected: { [ ( 4 ) - 3 ] } ");
		// infix = null;
		// infix = new InfixExpression("{[(4)-3]}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 38
		// print(border);
		// print("Test: 38");
		// print("Expected: { [ ( 4 ) + 3 ] ^ 2 } ");
		// infix = null;
		// infix = new InfixExpression("{[(4)+3]^2}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 39
		// print(border);
		// print("Test: 39");
		// print("Expected: { [ ( 4 ) + ( 3 ) ] } ");
		// infix = null;
		// infix = new InfixExpression("{[(4)+(3)]}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 40
		// print(border);
		// print("Test: 40");
		// print("Expected: { [ ( 44 ) + ( 33 ) ] } ");
		// infix = null;
		// infix = new InfixExpression("{[(44)+(33)]}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// // Test 41
		// print(border);
		// print("Test: 41");
		// print("Expected: { [ ( 41 ) + ( 3 ) ] } ");
		// infix = null;
		// infix = new InfixExpression("{[(41)+(3)]}");
		// infix.clean();
		// print("Result: " + infix.infix);
		//
		// print("\n" + border);
		// print("End of the clean() Test");
		// print(border);
		//
		// onDestroyInfix();
	}// End of the 'cleanTest' method

	/**
	 * This is the method that will test the getPostfixExpression()
	 * method from the Infix Expression class
	 */
	public static void getPostfixExpressionTest() {

		// Test 1
		print("\nTesting the getPostfixExpression() method");
		print(border);
		print("Test: 1");
		print("Testing: 3+4");
		print("Expected:  3 4 +");
		infix = new InfixExpression("3+4");
		print("Result: " + infix.getPostfixExpression());

		// Test 2
		print(border);
		print("Test: 2");
		print("Testing: 4-3");
		print("Expected:  4 3 -");
		infix = null;
		infix = new InfixExpression("4-3");
		print("Result: " + infix.getPostfixExpression());

		// Test 3
		print(border);
		print("Test: 3");
		print("Testing: 4*3");
		print("Expected:  4 3 *");
		infix = null;
		infix = new InfixExpression("4*3");
		print("Result: " + infix.getPostfixExpression());

		// Test 4
		print(border);
		print("Test: 4");
		print("Testing: 4/3");
		print("Expected:  4 3 /");
		infix = null;
		infix = new InfixExpression("4/3");
		print("Result: " + infix.getPostfixExpression());

		// Test 5
		print(border);
		print("Test: 5");
		print("Testing: 4%3");
		print("Expected:  4 3 %");
		infix = null;
		infix = new InfixExpression("4%3");
		print("Result: " + infix.getPostfixExpression());

		// Test 6
		print(border);
		print("Test: 6");
		print("Testing: 4^3");
		print("Expected:  4 3 ^");
		infix = null;
		infix = new InfixExpression("4^3");
		print("Result: " + infix.getPostfixExpression());

		// Test 7
		print(border);
		print("Test: 7");
		print("Testing: 44-3");
		print("Expected:  44 3 -");
		infix = null;
		infix = new InfixExpression("44-3");
		print("Result: " + infix.getPostfixExpression());

		// Test 8
		print(border);
		print("Test: 8");
		print("Testing: 44+3");
		print("Expected:  44 3 +");
		infix = null;
		infix = new InfixExpression("44+3");
		print("Result: " + infix.getPostfixExpression());

		// Test 9
		print(border);
		print("Test: 9");
		print("Testing: 44*3");
		print("Expected:  44 3 *");
		infix = null;
		infix = new InfixExpression("44*3");
		print("Result: " + infix.getPostfixExpression());

		// Test 10
		print(border);
		print("Test: 10");
		print("Testing: 44%3");
		print("Expected:  44 3 %");
		infix = null;
		infix = new InfixExpression("44%3");
		print("Result: " + infix.getPostfixExpression());

		// Test 11
		print(border);
		print("Test: 11");
		print("Testing: 44^3");
		print("Expected:  44 3 ^");
		infix = null;
		infix = new InfixExpression("44^3");
		print("Result: " + infix.getPostfixExpression());

		// Test 12
		print(border);
		print("Test: 12");
		print("Testing: 44-33");
		print("Expected:  44 33 -");
		infix = null;
		infix = new InfixExpression("44-33");
		print("Result: " + infix.getPostfixExpression());

		// Test 13
		print(border);
		print("Test: 13");
		print("Testing: 44+33");
		print("Expected:  44 33 +");
		infix = null;
		infix = new InfixExpression("44+33");
		print("Result: " + infix.getPostfixExpression());

		// Test 14
		print(border);
		print("Test: 14");
		print("Testing: 44*33");
		print("Expected:  44 33 *");
		infix = null;
		infix = new InfixExpression("44*33");
		print("Result: " + infix.getPostfixExpression());

		// Test 15
		print(border);
		print("Test: 15");
		print("Testing: 44%33");
		print("Expected:  44 33 %");
		infix = null;
		infix = new InfixExpression("44%33");
		print("Result: " + infix.getPostfixExpression());

		// Test 16
		print(border);
		print("Test: 16");
		print("Testing: 44^33");
		print("Expected:  44 33 ^");
		infix = null;
		infix = new InfixExpression("44^33");
		print("Result: " + infix.getPostfixExpression());

		// Test 17
		print(border);
		print("Test: 17");
		print("Testing: {4+3}");
		print("Expected:  4 3 +");
		infix = null;
		infix = new InfixExpression("{4+3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 18
		print(border);
		print("Test: 18");
		print("Testing: {4-3}");
		print("Expected:  4 3 -");
		infix = null;
		infix = new InfixExpression("{4-3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 19
		print(border);
		print("Test: 19");
		print("Testing: {4*3}");
		print("Expected:  4 3 *");
		infix = null;
		infix = new InfixExpression("{4*3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 20
		print(border);
		print("Test: 20");
		print("Testing: {4/3}");
		print("Expected:  4 3 /");
		infix = null;
		infix = new InfixExpression("{4/3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 21
		print(border);
		print("Test: 21");
		print("Testing: {4%3}");
		print("Expected:  4 3 %");
		infix = null;
		infix = new InfixExpression("{4%3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 22
		print(border);
		print("Test: 22");
		print("Testing: {4^3}");
		print("Expected:  4 3 ^");
		infix = null;
		infix = new InfixExpression("{4^3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 23
		print(border);
		print("Test: 23");
		print("Testing: {44-3}");
		print("Expected:  44 3 -");
		infix = null;
		infix = new InfixExpression("{44-3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 24
		print(border);
		print("Test: 24");
		print("Testing: {44+3}");
		print("Expected:  44 3 +");
		infix = null;
		infix = new InfixExpression("{44+3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 25
		print(border);
		print("Test: 25");
		print("Testing: {44*3}");
		print("Expected:  44 3 *");
		infix = null;
		infix = new InfixExpression("{44*3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 26
		print(border);
		print("Test: 26");
		print("Testing: {44%3}");
		print("Expected:  44 3 %");
		infix = null;
		infix = new InfixExpression("{44%3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 27
		print(border);
		print("Test: 27");
		print("Testing: {44^3}");
		print("Expected:  44 3 ^");
		infix = null;
		infix = new InfixExpression("{44^3}");
		print("Result: " + infix.getPostfixExpression());

		// Test 28
		print(border);
		print("Test: 28");
		print("Testing: {44-33}");
		print("Expected:  44 33 -");
		infix = null;
		infix = new InfixExpression("{44-33}");
		print("Result: " + infix.getPostfixExpression());

		// Test 29
		print(border);
		print("Test: 29");
		print("Testing: {44+33}");
		print("Expected:  44 33 +");
		infix = null;
		infix = new InfixExpression("{44+33}");
		print("Result: " + infix.getPostfixExpression());

		// Test 30
		print(border);
		print("Test: 30");
		print("Testing: {44*33}");
		print("Expected:  44 33 *");
		infix = null;
		infix = new InfixExpression("{44*33}");
		print("Result: " + infix.getPostfixExpression());

		// Test 31
		print(border);
		print("Test: 31");
		print("Testing: {44%33}");
		print("Expected:  44 33 %");
		infix = null;
		infix = new InfixExpression("{44%33}");
		print("Result: " + infix.getPostfixExpression());

		// Test 32
		print(border);
		print("Test: 32");
		print("Testing: {44^33}");
		print("Expected:  44 33 ^");
		infix = null;
		infix = new InfixExpression("{44^33}");
		print("Result: " + infix.getPostfixExpression());

		// Test 33
		print(border);
		print("Test: 33");
		print("Testing: [4+3]");
		print("Expected:  4 3 +");
		infix = null;
		infix = new InfixExpression("[4-3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 34
		print(border);
		print("Test: 34");
		print("Testing: [4-3]");
		print("Expected:  4 3 -");
		infix = null;
		infix = new InfixExpression("[4-3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 35
		print(border);
		print("Test: 35");
		print("Testing: [4*3]");
		print("Expected:  4 3 *");
		infix = null;
		infix = new InfixExpression("[4*3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 36
		print(border);
		print("Test: 36");
		print("Testing: [4/3]");
		print("Expected:  4 3 /");
		infix = null;
		infix = new InfixExpression("[4/3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 37
		print(border);
		print("Test: 37");
		print("Testing: [4%3]");
		print("Expected:  4 3 %");
		infix = null;
		infix = new InfixExpression("[4%3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 38
		print(border);
		print("Test: 38");
		print("Testing: [4^3]");
		print("Expected:  4 3 ^");
		infix = null;
		infix = new InfixExpression("[4^3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 39
		print(border);
		print("Test: 39");
		print("Testing: [44-3]");
		print("Expected:  44 3 -");
		infix = null;
		infix = new InfixExpression("[44-3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 40
		print(border);
		print("Test: 40");
		print("Testing: [44+3]");
		print("Expected:  44 3 +");
		infix = null;
		infix = new InfixExpression("[44+3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 41
		print(border);
		print("Test: 41");
		print("Testing: [44*3]");
		print("Expected:  44 3 *");
		infix = null;
		infix = new InfixExpression("[44*3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 42
		print(border);
		print("Test: 42");
		print("Testing: [44%3]");
		print("Expected:  44 3 %");
		infix = null;
		infix = new InfixExpression("[44%3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 43
		print(border);
		print("Test: 43");
		print("Testing: [44^3]");
		print("Expected:  44 3 ^");
		infix = null;
		infix = new InfixExpression("[44^3]");
		print("Result: " + infix.getPostfixExpression());

		// Test 44
		print(border);
		print("Test: 44");
		print("Testing: [44-33]");
		print("Expected:  44 33 -");
		infix = null;
		infix = new InfixExpression("[44-33]");
		print("Result: " + infix.getPostfixExpression());

		// Test 45
		print(border);
		print("Test: 45");
		print("Testing: [44+33]");
		print("Expected:  44 33 +");
		infix = null;
		infix = new InfixExpression("[44+33]");
		print("Result: " + infix.getPostfixExpression());

		// Test 46
		print(border);
		print("Test: 46");
		print("Testing: [44*33]");
		print("Expected:  44 33 *");
		infix = null;
		infix = new InfixExpression("[44*33]");
		print("Result: " + infix.getPostfixExpression());

		// Test 47
		print(border);
		print("Test: 47");
		print("Testing: [44%33]");
		print("Expected:  44 33 %");
		infix = null;
		infix = new InfixExpression("[44%33]");
		print("Result: " + infix.getPostfixExpression());

		// Test 48
		print(border);
		print("Test: 48");
		print("Testing: [44^33]");
		print("Expected:  44 33 ^");
		infix = null;
		infix = new InfixExpression("[44^33]");
		print("Result: " + infix.getPostfixExpression());

		// Test 49
		print(border);
		print("Test: 49");
		print("Testing: (4+3)");
		print("Expected:  4 3 +");
		infix = null;
		infix = new InfixExpression("(4+3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 50
		print(border);
		print("Test: 50");
		print("Testing: (4-3)");
		print("Expected:  4 3 -");
		infix = null;
		infix = new InfixExpression("(4-3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 51
		print(border);
		print("Test: 51");
		print("Testing: (4*3)");
		print("Expected:  4 3 *");
		infix = null;
		infix = new InfixExpression("(4*3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 52
		print(border);
		print("Test: 52");
		print("Testing: (4/3)");
		print("Expected:  4 3 /");
		infix = null;
		infix = new InfixExpression("(4/3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 53
		print(border);
		print("Test: 53");
		print("Testing: (4%3)");
		print("Expected:  4 3 %");
		infix = null;
		infix = new InfixExpression("(4%3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 54
		print(border);
		print("Test: 54");
		print("Testing: (4^3)");
		print("Expected:  4 3 ^");
		infix = null;
		infix = new InfixExpression("(4^3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 55
		print(border);
		print("Test: 55");
		print("Testing: (44-3)");
		print("Expected:  44 3 -");
		infix = null;
		infix = new InfixExpression("(44-3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 56
		print(border);
		print("Test: 56");
		print("Testing: (44+3)");
		print("Expected:  44 3 +");
		infix = null;
		infix = new InfixExpression("(44+3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 57
		print(border);
		print("Test: 57");
		print("Testing: (44*3)");
		print("Expected:  44 3 *");
		infix = null;
		infix = new InfixExpression("(44*3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 58
		print(border);
		print("Test: 58");
		print("Testing: (44%3)");
		print("Expected:  44 3 %");
		infix = null;
		infix = new InfixExpression("(44%3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 59
		print(border);
		print("Test: 59");
		print("Testing: (44^3)");
		print("Expected:  44 3 ^");
		infix = null;
		infix = new InfixExpression("(44^3)");
		print("Result: " + infix.getPostfixExpression());

		// Test 60
		print(border);
		print("Test: 60");
		print("Testing: (44-33)");
		print("Expected:  44 33 -");
		infix = null;
		infix = new InfixExpression("(44-33)");
		print("Result: " + infix.getPostfixExpression());

		// Test 61
		print(border);
		print("Test: 61");
		print("Testing: (44+33)");
		print("Expected:  44 33 +");
		infix = null;
		infix = new InfixExpression("(44+33)");
		print("Result: " + infix.getPostfixExpression());

		// Test 62
		print(border);
		print("Test: 62");
		print("Testing: (44*33)");
		print("Expected:  44 33 *");
		infix = null;
		infix = new InfixExpression("(44*33)");
		print("Result: " + infix.getPostfixExpression());

		// Test 63
		print(border);
		print("Test: 63");
		print("Testing: (44%33)");
		print("Expected:  44 33 %");
		infix = null;
		infix = new InfixExpression("(44%33)");
		print("Result: " + infix.getPostfixExpression());

		// Test 64
		print(border);
		print("Test: 64");
		print("Testing: (44^33)");
		print("Expected:  44 33 ^");
		infix = null;
		infix = new InfixExpression("(44^33)");
		print("Result: " + infix.getPostfixExpression());

		// Test 65
		print(border);
		print("Test: 65");
		print("Testing: (44*33)-1");
		print("Expected:  44 33 * 1 -");
		infix = null;
		infix = new InfixExpression("(44*33)-1");
		print("Result: " + infix.getPostfixExpression());

		// Test 66
		print(border);
		print("Test: 66");
		print("Testing: (44*33)+1");
		print("Expected:  44 33 * 1 +");
		infix = null;
		infix = new InfixExpression("(44*33)+1");
		print("Result: " + infix.getPostfixExpression());

		// Test 67
		print(border);
		print("Test: 67");
		print("Testing: (44*33)*1");
		print("Expected:  44 33 * 1 *");
		infix = null;
		infix = new InfixExpression("(44*33)*1");
		print("Result: " + infix.getPostfixExpression());

		// Test 68
		print(border);
		print("Test: 68");
		print("Testing: (44*33)/1");
		print("Expected:  44 33 * 1 /");
		infix = null;
		infix = new InfixExpression("(44*33)/1");
		print("Result: " + infix.getPostfixExpression());

		// Test 69
		print(border);
		print("Test: 69");
		print("Testing: (44*33)%1");
		print("Expected:  44 33 * 1 %");
		infix = null;
		infix = new InfixExpression("(44*33)%1");
		print("Result: " + infix.getPostfixExpression());

		// Test 70
		print(border);
		print("Test: 70");
		print("Testing: (44*33)^1");
		print("Expected:  44 33 * 1 ^");
		infix = null;
		infix = new InfixExpression("(44*33)^1");
		print("Result: " + infix.getPostfixExpression());

		// Test 71
		print(border);
		print("Test: 71");
		print("Testing: (44*33)+(1*2)");
		print("Expected:  44 33 * 1 2 * +");
		infix = null;
		infix = new InfixExpression("(44*33)+(1*2)");
		print("Result: " + infix.getPostfixExpression());

		// Test 72
		print(border);
		print("Test: 72");
		print("Testing: (44*33)-(1*2)");
		print("Expected:  44 33 * 1 2 * -");
		infix = null;
		infix = new InfixExpression("(44*33)-(1*2)");
		print("Result: " + infix.getPostfixExpression());

		// Test 73
		print(border);
		print("Test: 73");
		print("Testing: (44*33)*(1*2)");
		print("Expected:  44 33 * 1 2 * *");
		infix = null;
		infix = new InfixExpression("(44*33)*(1*2)");
		print("Result: " + infix.getPostfixExpression());

		// Test 74
		print(border);
		print("Test: 74");
		print("Testing: (44*33)/(1*2)");
		print("Expected:  44 33 * 1 2 * /");
		infix = null;
		infix = new InfixExpression("(44*33)/(1*2)");
		print("Result: " + infix.getPostfixExpression());

		// Test 75
		print(border);
		print("Test: 75");
		print("Testing: (44*33)%(1*2)");
		print("Expected:  44 33 * 1 2 * %");
		infix = null;
		infix = new InfixExpression("(44*33)%(1*2)");
		print("Result: " + infix.getPostfixExpression());

		// Test 76
		print(border);
		print("Test: 76");
		print("Testing: (44*33)^(1*2)");
		print("Expected:  44 33 * 1 2 * ^");
		infix = null;
		infix = new InfixExpression("(44*33)^(1*2)");
		print("Result: " + infix.getPostfixExpression());

		// Test 77
		print(border);
		print("Test: 77");
		print("Testing: {(44*33)+(1*2)}");
		print("Expected:  44 33 * 1 2 * +");
		infix = null;
		infix = new InfixExpression("{(44*33)+(1*2)}");
		print("Result: " + infix.getPostfixExpression());

		// Test 78
		print(border);
		print("Test: 78");
		print("Testing: [(44*33)+(1*2)]");
		print("Expected:  44 33 * 1 2 * +");
		infix = null;
		infix = new InfixExpression("[(44*33)+(1*2)]");
		print("Result: " + infix.getPostfixExpression());

		// Test 79
		print(border);
		print("Test: 79");
		print("Testing: ((44*33)+(1*2))");
		print("Expected:  44 33 * 1 2 * +");
		infix = null;
		infix = new InfixExpression("((44*33)+(1*2))");
		print("Result: " + infix.getPostfixExpression());

		print("\n" + border);
		print("End of getPostfixExpression() Test");
		print(border);

		onDestroyInfix();
	}// End of the 'getPostfixExpressionTest' method

	/**
	 * This is the method that will test the evaluatePostfix() method
	 * in the InfixExpression class
	 */
	public static void evaluatePostfixTest() {

		// Test 1
		print("\nTesting the evaluatePostfix() method");
		print(border);
		print("Test: 1");
		print("Testing: 3+4");
		print("Expected:  7");
		infix = new InfixExpression("3+4");
		print("Result: " + infix.evaluatePostfix());

		// Test 2
		print(border);
		print("Test: 2");
		print("Testing: 4-3");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("4-3");
		print("Result: " + infix.evaluatePostfix());

		// Test 3
		print(border);
		print("Test: 3");
		print("Testing: 4*3");
		print("Expected:  12");
		infix = null;
		infix = new InfixExpression("4*3");
		print("Result: " + infix.evaluatePostfix());

		// Test 4
		print(border);
		print("Test: 4");
		print("Testing: 4/3");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("4/3");
		print("Result: " + infix.evaluatePostfix());

		// Test 5
		print(border);
		print("Test: 5");
		print("Testing: 4%3");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("4%3");
		print("Result: " + infix.evaluatePostfix());

		// Test 6
		print(border);
		print("Test: 6");
		print("Testing: 4^3");
		print("Expected:  64");
		infix = null;
		infix = new InfixExpression("4^3");
		print("Result: " + infix.evaluatePostfix());

		// Test 7
		print(border);
		print("Test: 7");
		print("Testing: 44-3");
		print("Expected:  41");
		infix = null;
		infix = new InfixExpression("44-3");
		print("Result: " + infix.evaluatePostfix());

		// Test 8
		print(border);
		print("Test: 8");
		print("Testing: 44+3");
		print("Expected:  47");
		infix = null;
		infix = new InfixExpression("44+3");
		print("Result: " + infix.evaluatePostfix());

		// Test 9
		print(border);
		print("Test: 9");
		print("Testing: 44*3");
		print("Expected:  132");
		infix = null;
		infix = new InfixExpression("44*3");
		print("Result: " + infix.evaluatePostfix());

		// Test 10
		print(border);
		print("Test: 10");
		print("Testing: 44%3");
		print("Expected:  2");
		infix = null;
		infix = new InfixExpression("44%3");
		print("Result: " + infix.evaluatePostfix());

		// Test 11
		print(border);
		print("Test: 11");
		print("Testing: 44^3");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("44^3");
		print("Result: " + infix.evaluatePostfix());

		// Test 12
		print(border);
		print("Test: 12");
		print("Testing: 44-33");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("44-33");
		print("Result: " + infix.evaluatePostfix());

		// Test 13
		print(border);
		print("Test: 13");
		print("Testing: 44+33");
		print("Expected:  77");
		infix = null;
		infix = new InfixExpression("44+33");
		print("Result: " + infix.evaluatePostfix());

		// Test 14
		print(border);
		print("Test: 14");
		print("Testing: 44*33");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("44*33");
		print("Result: " + infix.evaluatePostfix());

		// Test 15
		print(border);
		print("Test: 15");
		print("Testing: 44%33");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("44%33");
		print("Result: " + infix.evaluatePostfix());

		// Test 16
		print(border);
		print("Test: 16");
		print("Testing: 44^3");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("44^3");
		print("Result: " + infix.evaluatePostfix());

		// Test 17
		print(border);
		print("Test: 17");
		print("Testing: {4+3}");
		print("Expected:  7");
		infix = null;
		infix = new InfixExpression("{4+3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 18
		print(border);
		print("Test: 18");
		print("Testing: {4-3}");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("{4-3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 19
		print(border);
		print("Test: 19");
		print("Testing: {4*3}");
		print("Expected:  12");
		infix = null;
		infix = new InfixExpression("{4*3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 20
		print(border);
		print("Test: 20");
		print("Testing: {4/3}");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("{4/3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 21
		print(border);
		print("Test: 21");
		print("Testing: {4%3}");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("{4%3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 22
		print(border);
		print("Test: 22");
		print("Testing: {4^3}");
		print("Expected:  64");
		infix = null;
		infix = new InfixExpression("{4^3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 23
		print(border);
		print("Test: 23");
		print("Testing: {44-3}");
		print("Expected:  41");
		infix = null;
		infix = new InfixExpression("{44-3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 24
		print(border);
		print("Test: 24");
		print("Testing: {44+3}");
		print("Expected:  47");
		infix = null;
		infix = new InfixExpression("{44+3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 25
		print(border);
		print("Test: 25");
		print("Testing: {44*3}");
		print("Expected:  132");
		infix = null;
		infix = new InfixExpression("{44*3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 26
		print(border);
		print("Test: 26");
		print("Testing: {44%3}");
		print("Expected:  2");
		infix = null;
		infix = new InfixExpression("{44%3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 27
		print(border);
		print("Test: 27");
		print("Testing: {44^3}");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("{44^3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 28
		print(border);
		print("Test: 28");
		print("Testing: {44-33}");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("{44-33}");
		print("Result: " + infix.evaluatePostfix());

		// Test 29
		print(border);
		print("Test: 29");
		print("Testing: {44+33}");
		print("Expected:  77");
		infix = null;
		infix = new InfixExpression("{44+33}");
		print("Result: " + infix.evaluatePostfix());

		// Test 30
		print(border);
		print("Test: 30");
		print("Testing: {44*33}");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("{44*33}");
		print("Result: " + infix.evaluatePostfix());

		// Test 31
		print(border);
		print("Test: 31");
		print("Testing: {44%33}");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("{44%33}");
		print("Result: " + infix.evaluatePostfix());

		// Test 32
		print(border);
		print("Test: 32");
		print("Testing: {44^3}");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("{44^3}");
		print("Result: " + infix.evaluatePostfix());

		// Test 33
		print(border);
		print("Test: 33");
		print("Testing: [4+3]");
		print("Expected:  7");
		infix = null;
		infix = new InfixExpression("[4+3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 34
		print(border);
		print("Test: 34");
		print("Testing: [4-3]");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("[4-3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 35
		print(border);
		print("Test: 35");
		print("Testing: [4*3]");
		print("Expected:  12");
		infix = null;
		infix = new InfixExpression("[4*3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 36
		print(border);
		print("Test: 36");
		print("Testing: [4/3]");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("[4/3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 37
		print(border);
		print("Test: 37");
		print("Testing: [4%3]");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("[4%3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 38
		print(border);
		print("Test: 38");
		print("Testing: [4^3]");
		print("Expected:  64");
		infix = null;
		infix = new InfixExpression("[4^3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 39
		print(border);
		print("Test: 39");
		print("Testing: [44-3]");
		print("Expected:  41");
		infix = null;
		infix = new InfixExpression("[44-3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 40
		print(border);
		print("Test: 40");
		print("Testing: [44+3]");
		print("Expected:  47");
		infix = null;
		infix = new InfixExpression("[44+3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 41
		print(border);
		print("Test: 41");
		print("Testing: [44*3]");
		print("Expected:  132");
		infix = null;
		infix = new InfixExpression("[44*3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 42
		print(border);
		print("Test: 42");
		print("Testing: [44%3]");
		print("Expected:  2");
		infix = null;
		infix = new InfixExpression("[44%3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 43
		print(border);
		print("Test: 43");
		print("Testing: [44^3]");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("[44^3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 44
		print(border);
		print("Test: 44");
		print("Testing: [44-33]");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("[44-33]");
		print("Result: " + infix.evaluatePostfix());

		// Test 45
		print(border);
		print("Test: 45");
		print("Testing: [44+33]");
		print("Expected:  77");
		infix = null;
		infix = new InfixExpression("[44+33]");
		print("Result: " + infix.evaluatePostfix());

		// Test 46
		print(border);
		print("Test: 46");
		print("Testing: [44*33]");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("[44*33]");
		print("Result: " + infix.evaluatePostfix());

		// Test 47
		print(border);
		print("Test: 47");
		print("Testing: [44%33]");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("[44%33]");
		print("Result: " + infix.evaluatePostfix());

		// Test 48
		print(border);
		print("Test: 48");
		print("Testing: [44^3]");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("[44^3]");
		print("Result: " + infix.evaluatePostfix());

		// Test 49
		print(border);
		print("Test: 49");
		print("Testing: (4+3)");
		print("Expected:  7");
		infix = null;
		infix = new InfixExpression("(4+3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 50
		print(border);
		print("Test: 50");
		print("Testing: (4-3)");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("(4-3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 51
		print(border);
		print("Test: 51");
		print("Testing: (4*3)");
		print("Expected:  12");
		infix = null;
		infix = new InfixExpression("(4*3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 52
		print(border);
		print("Test: 52");
		print("Testing: (4/3)");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("(4/3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 53
		print(border);
		print("Test: 53");
		print("Testing: (4%3)");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("(4%3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 54
		print(border);
		print("Test: 54");
		print("Testing: (4^3)");
		print("Expected:  64");
		infix = null;
		infix = new InfixExpression("(4^3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 55
		print(border);
		print("Test: 55");
		print("Testing: (44-3)");
		print("Expected:  41");
		infix = null;
		infix = new InfixExpression("(44-3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 56
		print(border);
		print("Test: 56");
		print("Testing: (44+3)");
		print("Expected:  47");
		infix = null;
		infix = new InfixExpression("(44+3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 57
		print(border);
		print("Test: 57");
		print("Testing: (44*3)");
		print("Expected:  132");
		infix = null;
		infix = new InfixExpression("(44*3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 58
		print(border);
		print("Test: 58");
		print("Testing: (44%3)");
		print("Expected:  2");
		infix = null;
		infix = new InfixExpression("(44%3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 59
		print(border);
		print("Test: 59");
		print("Testing: (44^3)");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("(44^3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 60
		print(border);
		print("Test: 60");
		print("Testing: (44-33)");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("(44-33)");
		print("Result: " + infix.evaluatePostfix());

		// Test 61
		print(border);
		print("Test: 61");
		print("Testing: (44+33)");
		print("Expected:  77");
		infix = null;
		infix = new InfixExpression("(44+33)");
		print("Result: " + infix.evaluatePostfix());

		// Test 62
		print(border);
		print("Test: 62");
		print("Testing: (44*33)");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("(44*33)");
		print("Result: " + infix.evaluatePostfix());

		// Test 63
		print(border);
		print("Test: 63");
		print("Testing: (44%33)");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("(44%33)");
		print("Result: " + infix.evaluatePostfix());

		// Test 64
		print(border);
		print("Test: 64");
		print("Testing: (44^3)");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("(44^3)");
		print("Result: " + infix.evaluatePostfix());

		// Test 65
		print(border);
		print("Test: 65");
		print("Testing: (44*33)-1");
		print("Expected:  1451");
		infix = null;
		infix = new InfixExpression("(44*33)-1");
		print("Result: " + infix.evaluatePostfix());

		// Test 66
		print(border);
		print("Test: 66");
		print("Testing: (44*33)+1");
		print("Expected:  1453");
		infix = null;
		infix = new InfixExpression("(44*33)+1");
		print("Result: " + infix.evaluatePostfix());

		// Test 67
		print(border);
		print("Test: 67");
		print("Testing: (44*33)*1");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("(44*33)*1");
		print("Result: " + infix.evaluatePostfix());

		// Test 68
		print(border);
		print("Test: 68");
		print("Testing: (44*33)/1");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("(44*33)/1");
		print("Result: " + infix.evaluatePostfix());

		// Test 69
		print(border);
		print("Test: 69");
		print("Testing: (44*33)%1");
		print("Expected:  0");
		infix = null;
		infix = new InfixExpression("(44*33)%1");
		print("Result: " + infix.evaluatePostfix());

		// Test 70
		print(border);
		print("Test: 70");
		print("Testing: (44*33)^1");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("(44*33)^1");
		print("Result: " + infix.evaluatePostfix());

		// Test 71
		print(border);
		print("Test: 71");
		print("Testing: (44*33)+(1*2)");
		print("Expected:  1454");
		infix = null;
		infix = new InfixExpression("(44*33)+(1*2)");
		print("Result: " + infix.evaluatePostfix());

		// Test 72
		print(border);
		print("Test: 72");
		print("Testing: (44*33)-(1*2)");
		print("Expected:  1450");
		infix = null;
		infix = new InfixExpression("(44*33)-(1*2)");
		print("Result: " + infix.evaluatePostfix());

		// Test 73
		print(border);
		print("Test: 73");
		print("Testing: (44*33)*(1*2)");
		print("Expected:  2904");
		infix = null;
		infix = new InfixExpression("(44*33)*(1*2)");
		print("Result: " + infix.evaluatePostfix());

		// Test 74
		print(border);
		print("Test: 74");
		print("Testing: (44*33)/(1*2)");
		print("Expected:  726");
		infix = null;
		infix = new InfixExpression("(44*33)/(1*2)");
		print("Result: " + infix.evaluatePostfix());

		// Test 75
		print(border);
		print("Test: 75");
		print("Testing: (44*33)%(1*2)");
		print("Expected:  0");
		infix = null;
		infix = new InfixExpression("(44*33)%(1*2)");
		print("Result: " + infix.evaluatePostfix());

		// Test 76
		print(border);
		print("Test: 76");
		print("Testing: (44*33)^(1*2)");
		print("Expected:  2108304");
		infix = null;
		infix = new InfixExpression("(44*33)^(1*2)");
		print("Result: " + infix.evaluatePostfix());

		// Test 77
		print(border);
		print("Test: 77");
		print("Testing: {(44*33)+(1*2)}");
		print("Expected:  1454");
		infix = null;
		infix = new InfixExpression("{(44*33)+(1*2)}");
		print("Result: " + infix.evaluatePostfix());

		// Test 78
		print(border);
		print("Test: 78");
		print("Testing: [(44*33)+(1*2)]");
		print("Expected:  1454");
		infix = null;
		infix = new InfixExpression("[(44*33)+(1*2)]");
		print("Result: " + infix.evaluatePostfix());

		// Test 79
		print(border);
		print("Test: 79");
		print("Testing: ((44*33)+(1*2))");
		print("Expected:  1454");
		infix = null;
		infix = new InfixExpression("((44*33)+(1*2))");
		print("Result: " + infix.evaluatePostfix());

		print("\n" + border);
		print("End of the evaluatePostfix() Test");
		print(border);

		onDestroyInfix();
	}// End of the 'evaluatePostfixTest' method

	/**
	 * This is the method that will test the evaluate() method from
	 * the InfixExpression class
	 */
	public static void evaluateTest() {

		// Test 1
		print("\nTesting the evaluate() method");
		print(border);
		print("Test: 1");
		print("Testing: 3+4");
		print("Expected:  7");
		infix = new InfixExpression("3+4");
		print("Result: " + infix.evaluate());

		// Test 2
		print(border);
		print("Test: 2");
		print("Testing: 4-3");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("4-3");
		print("Result: " + infix.evaluate());

		// Test 3
		print(border);
		print("Test: 3");
		print("Testing: 4*3");
		print("Expected:  12");
		infix = null;
		infix = new InfixExpression("4*3");
		print("Result: " + infix.evaluate());

		// Test 4
		print(border);
		print("Test: 4");
		print("Testing: 4/3");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("4/3");
		print("Result: " + infix.evaluate());

		// Test 5
		print(border);
		print("Test: 5");
		print("Testing: 4%3");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("4%3");
		print("Result: " + infix.evaluate());

		// Test 6
		print(border);
		print("Test: 6");
		print("Testing: 4^3");
		print("Expected:  64");
		infix = null;
		infix = new InfixExpression("4^3");
		print("Result: " + infix.evaluate());

		// Test 7
		print(border);
		print("Test: 7");
		print("Testing: 44-3");
		print("Expected:  41");
		infix = null;
		infix = new InfixExpression("44-3");
		print("Result: " + infix.evaluate());

		// Test 8
		print(border);
		print("Test: 8");
		print("Testing: 44+3");
		print("Expected:  47");
		infix = null;
		infix = new InfixExpression("44+3");
		print("Result: " + infix.evaluate());

		// Test 9
		print(border);
		print("Test: 9");
		print("Testing: 44*3");
		print("Expected:  132");
		infix = null;
		infix = new InfixExpression("44*3");
		print("Result: " + infix.evaluate());

		// Test 10
		print(border);
		print("Test: 10");
		print("Testing: 44%3");
		print("Expected:  2");
		infix = null;
		infix = new InfixExpression("44%3");
		print("Result: " + infix.evaluate());

		// Test 11
		print(border);
		print("Test: 11");
		print("Testing: 44^3");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("44^3");
		print("Result: " + infix.evaluate());

		// Test 12
		print(border);
		print("Test: 12");
		print("Testing: 44-33");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("44-33");
		print("Result: " + infix.evaluate());

		// Test 13
		print(border);
		print("Test: 13");
		print("Testing: 44+33");
		print("Expected:  77");
		infix = null;
		infix = new InfixExpression("44+33");
		print("Result: " + infix.evaluate());

		// Test 14
		print(border);
		print("Test: 14");
		print("Testing: 44*33");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("44*33");
		print("Result: " + infix.evaluate());

		// Test 15
		print(border);
		print("Test: 15");
		print("Testing: 44%33");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("44%33");
		print("Result: " + infix.evaluate());

		// Test 16
		print(border);
		print("Test: 16");
		print("Testing: 44^3");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("44^3");
		print("Result: " + infix.evaluate());

		// Test 17
		print(border);
		print("Test: 17");
		print("Testing: {4+3}");
		print("Expected:  7");
		infix = null;
		infix = new InfixExpression("{4+3}");
		print("Result: " + infix.evaluate());

		// Test 18
		print(border);
		print("Test: 18");
		print("Testing: {4-3}");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("{4-3}");
		print("Result: " + infix.evaluate());

		// Test 19
		print(border);
		print("Test: 19");
		print("Testing: {4*3}");
		print("Expected:  12");
		infix = null;
		infix = new InfixExpression("{4*3}");
		print("Result: " + infix.evaluate());

		// Test 20
		print(border);
		print("Test: 20");
		print("Testing: {4/3}");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("{4/3}");
		print("Result: " + infix.evaluate());

		// Test 21
		print(border);
		print("Test: 21");
		print("Testing: {4%3}");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("{4%3}");
		print("Result: " + infix.evaluate());

		// Test 22
		print(border);
		print("Test: 22");
		print("Testing: {4^3}");
		print("Expected:  64");
		infix = null;
		infix = new InfixExpression("{4^3}");
		print("Result: " + infix.evaluate());

		// Test 23
		print(border);
		print("Test: 23");
		print("Testing: {44-3}");
		print("Expected:  41");
		infix = null;
		infix = new InfixExpression("{44-3}");
		print("Result: " + infix.evaluate());

		// Test 24
		print(border);
		print("Test: 24");
		print("Testing: {44+3}");
		print("Expected:  47");
		infix = null;
		infix = new InfixExpression("{44+3}");
		print("Result: " + infix.evaluate());

		// Test 25
		print(border);
		print("Test: 25");
		print("Testing: {44*3}");
		print("Expected:  132");
		infix = null;
		infix = new InfixExpression("{44*3}");
		print("Result: " + infix.evaluate());

		// Test 26
		print(border);
		print("Test: 26");
		print("Testing: {44%3}");
		print("Expected:  2");
		infix = null;
		infix = new InfixExpression("{44%3}");
		print("Result: " + infix.evaluate());

		// Test 27
		print(border);
		print("Test: 27");
		print("Testing: {44^3}");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("{44^3}");
		print("Result: " + infix.evaluate());

		// Test 28
		print(border);
		print("Test: 28");
		print("Testing: {44-33}");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("{44-33}");
		print("Result: " + infix.evaluate());

		// Test 29
		print(border);
		print("Test: 29");
		print("Testing: {44+33}");
		print("Expected:  77");
		infix = null;
		infix = new InfixExpression("{44+33}");
		print("Result: " + infix.evaluate());

		// Test 30
		print(border);
		print("Test: 30");
		print("Testing: {44*33}");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("{44*33}");
		print("Result: " + infix.evaluate());

		// Test 31
		print(border);
		print("Test: 31");
		print("Testing: {44%33}");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("{44%33}");
		print("Result: " + infix.evaluate());

		// Test 32
		print(border);
		print("Test: 32");
		print("Testing: {44^3}");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("{44^3}");
		print("Result: " + infix.evaluate());

		// Test 33
		print(border);
		print("Test: 33");
		print("Testing: [4+3]");
		print("Expected:  7");
		infix = null;
		infix = new InfixExpression("[4+3]");
		print("Result: " + infix.evaluate());

		// Test 34
		print(border);
		print("Test: 34");
		print("Testing: [4-3]");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("[4-3]");
		print("Result: " + infix.evaluate());

		// Test 35
		print(border);
		print("Test: 35");
		print("Testing: [4*3]");
		print("Expected:  12");
		infix = null;
		infix = new InfixExpression("[4*3]");
		print("Result: " + infix.evaluate());

		// Test 36
		print(border);
		print("Test: 36");
		print("Testing: [4/3]");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("[4/3]");
		print("Result: " + infix.evaluate());

		// Test 37
		print(border);
		print("Test: 37");
		print("Testing: [4%3]");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("[4%3]");
		print("Result: " + infix.evaluate());

		// Test 38
		print(border);
		print("Test: 38");
		print("Testing: [4^3]");
		print("Expected:  64");
		infix = null;
		infix = new InfixExpression("[4^3]");
		print("Result: " + infix.evaluate());

		// Test 39
		print(border);
		print("Test: 39");
		print("Testing: [44-3]");
		print("Expected:  41");
		infix = null;
		infix = new InfixExpression("[44-3]");
		print("Result: " + infix.evaluate());

		// Test 40
		print(border);
		print("Test: 40");
		print("Testing: [44+3]");
		print("Expected:  47");
		infix = null;
		infix = new InfixExpression("[44+3]");
		print("Result: " + infix.evaluate());

		// Test 41
		print(border);
		print("Test: 41");
		print("Testing: [44*3]");
		print("Expected:  132");
		infix = null;
		infix = new InfixExpression("[44*3]");
		print("Result: " + infix.evaluate());

		// Test 42
		print(border);
		print("Test: 42");
		print("Testing: [44%3]");
		print("Expected:  2");
		infix = null;
		infix = new InfixExpression("[44%3]");
		print("Result: " + infix.evaluate());

		// Test 43
		print(border);
		print("Test: 43");
		print("Testing: [44^3]");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("[44^3]");
		print("Result: " + infix.evaluate());

		// Test 44
		print(border);
		print("Test: 44");
		print("Testing: [44-33]");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("[44-33]");
		print("Result: " + infix.evaluate());

		// Test 45
		print(border);
		print("Test: 45");
		print("Testing: [44+33]");
		print("Expected:  77");
		infix = null;
		infix = new InfixExpression("[44+33]");
		print("Result: " + infix.evaluate());

		// Test 46
		print(border);
		print("Test: 46");
		print("Testing: [44*33]");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("[44*33]");
		print("Result: " + infix.evaluate());

		// Test 47
		print(border);
		print("Test: 47");
		print("Testing: [44%33]");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("[44%33]");
		print("Result: " + infix.evaluate());

		// Test 48
		print(border);
		print("Test: 48");
		print("Testing: [44^3]");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("[44^3]");
		print("Result: " + infix.evaluate());

		// Test 49
		print(border);
		print("Test: 49");
		print("Testing: (4+3)");
		print("Expected:  7");
		infix = null;
		infix = new InfixExpression("(4+3)");
		print("Result: " + infix.evaluate());

		// Test 50
		print(border);
		print("Test: 50");
		print("Testing: (4-3)");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("(4-3)");
		print("Result: " + infix.evaluate());

		// Test 51
		print(border);
		print("Test: 51");
		print("Testing: (4*3)");
		print("Expected:  12");
		infix = null;
		infix = new InfixExpression("(4*3)");
		print("Result: " + infix.evaluate());

		// Test 52
		print(border);
		print("Test: 52");
		print("Testing: (4/3)");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("(4/3)");
		print("Result: " + infix.evaluate());

		// Test 53
		print(border);
		print("Test: 53");
		print("Testing: (4%3)");
		print("Expected:  1");
		infix = null;
		infix = new InfixExpression("(4%3)");
		print("Result: " + infix.evaluate());

		// Test 54
		print(border);
		print("Test: 54");
		print("Testing: (4^3)");
		print("Expected:  64");
		infix = null;
		infix = new InfixExpression("(4^3)");
		print("Result: " + infix.evaluate());

		// Test 55
		print(border);
		print("Test: 55");
		print("Testing: (44-3)");
		print("Expected:  41");
		infix = null;
		infix = new InfixExpression("(44-3)");
		print("Result: " + infix.evaluate());

		// Test 56
		print(border);
		print("Test: 56");
		print("Testing: (44+3)");
		print("Expected:  47");
		infix = null;
		infix = new InfixExpression("(44+3)");
		print("Result: " + infix.evaluate());

		// Test 57
		print(border);
		print("Test: 57");
		print("Testing: (44*3)");
		print("Expected:  132");
		infix = null;
		infix = new InfixExpression("(44*3)");
		print("Result: " + infix.evaluate());

		// Test 58
		print(border);
		print("Test: 58");
		print("Testing: (44%3)");
		print("Expected:  2");
		infix = null;
		infix = new InfixExpression("(44%3)");
		print("Result: " + infix.evaluate());

		// Test 59
		print(border);
		print("Test: 59");
		print("Testing: (44^3)");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("(44^3)");
		print("Result: " + infix.evaluate());

		// Test 60
		print(border);
		print("Test: 60");
		print("Testing: (44-33)");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("(44-33)");
		print("Result: " + infix.evaluate());

		// Test 61
		print(border);
		print("Test: 61");
		print("Testing: (44+33)");
		print("Expected:  77");
		infix = null;
		infix = new InfixExpression("(44+33)");
		print("Result: " + infix.evaluate());

		// Test 62
		print(border);
		print("Test: 62");
		print("Testing: (44*33)");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("(44*33)");
		print("Result: " + infix.evaluate());

		// Test 63
		print(border);
		print("Test: 63");
		print("Testing: (44%33)");
		print("Expected:  11");
		infix = null;
		infix = new InfixExpression("(44%33)");
		print("Result: " + infix.evaluate());

		// Test 64
		print(border);
		print("Test: 64");
		print("Testing: (44^3)");
		print("Expected:  85184");
		infix = null;
		infix = new InfixExpression("(44^3)");
		print("Result: " + infix.evaluate());

		// Test 65
		print(border);
		print("Test: 65");
		print("Testing: (44*33)-1");
		print("Expected:  1451");
		infix = null;
		infix = new InfixExpression("(44*33)-1");
		print("Result: " + infix.evaluate());

		// Test 66
		print(border);
		print("Test: 66");
		print("Testing: (44*33)+1");
		print("Expected:  1453");
		infix = null;
		infix = new InfixExpression("(44*33)+1");
		print("Result: " + infix.evaluate());

		// Test 67
		print(border);
		print("Test: 67");
		print("Testing: (44*33)*1");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("(44*33)*1");
		print("Result: " + infix.evaluate());

		// Test 68
		print(border);
		print("Test: 68");
		print("Testing: (44*33)/1");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("(44*33)/1");
		print("Result: " + infix.evaluate());

		// Test 69
		print(border);
		print("Test: 69");
		print("Testing: (44*33)%1");
		print("Expected:  0");
		infix = null;
		infix = new InfixExpression("(44*33)%1");
		print("Result: " + infix.evaluate());

		// Test 70
		print(border);
		print("Test: 70");
		print("Testing: (44*33)^1");
		print("Expected:  1452");
		infix = null;
		infix = new InfixExpression("(44*33)^1");
		print("Result: " + infix.evaluate());

		// Test 71
		print(border);
		print("Test: 71");
		print("Testing: (44*33)+(1*2)");
		print("Expected:  1454");
		infix = null;
		infix = new InfixExpression("(44*33)+(1*2)");
		print("Result: " + infix.evaluate());

		// Test 72
		print(border);
		print("Test: 72");
		print("Testing: (44*33)-(1*2)");
		print("Expected:  1450");
		infix = null;
		infix = new InfixExpression("(44*33)-(1*2)");
		print("Result: " + infix.evaluate());

		// Test 73
		print(border);
		print("Test: 73");
		print("Testing: (44*33)*(1*2)");
		print("Expected:  2904");
		infix = null;
		infix = new InfixExpression("(44*33)*(1*2)");
		print("Result: " + infix.evaluate());

		// Test 74
		print(border);
		print("Test: 74");
		print("Testing: (44*33)/(1*2)");
		print("Expected:  726");
		infix = null;
		infix = new InfixExpression("(44*33)/(1*2)");
		print("Result: " + infix.evaluate());

		// Test 75
		print(border);
		print("Test: 75");
		print("Testing: (44*33)%(1*2)");
		print("Expected:  0");
		infix = null;
		infix = new InfixExpression("(44*33)%(1*2)");
		print("Result: " + infix.evaluate());

		// Test 76
		print(border);
		print("Test: 76");
		print("Testing: (44*33)^(1*2)");
		print("Expected:  2108304");
		infix = null;
		infix = new InfixExpression("(44*33)^(1*2)");
		print("Result: " + infix.evaluate());

		// Test 77
		print(border);
		print("Test: 77");
		print("Testing: {(44*33)+(1*2)}");
		print("Expected:  1454");
		infix = null;
		infix = new InfixExpression("{(44*33)+(1*2)}");
		print("Result: " + infix.evaluate());

		// Test 78
		print(border);
		print("Test: 78");
		print("Testing: [(44*33)+(1*2)]");
		print("Expected:  1454");
		infix = null;
		infix = new InfixExpression("[(44*33)+(1*2)]");
		print("Result: " + infix.evaluate());

		// Test 79
		print(border);
		print("Test: 79");
		print("Testing: ((44*33)+(1*2))");
		print("Expected:  1454");
		infix = null;
		infix = new InfixExpression("((44*33)+(1*2))");
		print("Result: " + infix.evaluate());

		print("\n" + border);
		print("End of the evaluate() Test");
		print(border);

		onDestroyInfix();
	}// End of the 'evaluateTest' method

	/**
	 * This is the method that will test the getPrecedence(char)
	 * method from the InfixExpression class. I will have to
	 * temporarily make the method a public method in order to test it
	 */
	public static void getPrecedenceTest() {

		// // Test 1
		// print("\nTesting the getPrecedence() method");
		// print(border);
		// print("Test: 1");
		// print("Testing: +");
		// print("Expected: 1");
		// infix = new InfixExpression("(2+5)-(1*1)");
		// print("Result: " + infix.getPrecedence('+'));
		//
		// // Test 2
		// print(border);
		// print("Test: 2");
		// print("Testing: -");
		// print("Expected: 1");
		// print("Result: " + infix.getPrecedence('-'));
		//
		// // Test 3
		// print(border);
		// print("Test: 3");
		// print("Testing: *");
		// print("Expected: 2");
		// print("Result: " + infix.getPrecedence('*'));
		//
		// // Test 4
		// print(border);
		// print("Test: 4");
		// print("Testing: /");
		// print("Expected: 2");
		// print("Result: " + infix.getPrecedence('/'));
		//
		// // Test 5
		// print(border);
		// print("Test: 5");
		// print("Testing: ^");
		// print("Expected: 3");
		// print("Result: " + infix.getPrecedence('^'));
		//
		// // Test 6
		// print(border);
		// print("Test: 6");
		// print("Testing: %");
		// print("Expected: 2");
		// print("Result: " + infix.getPrecedence('%'));
		//
		// print("\n" + border);
		// print("End of the getPrecedence() Test");
		// print(border);
		//
		// onDestroyInfix();
	}// End of the 'getPrecedenceTest' method

	/**
	 * This is the method that will test the solve(int, int, char)
	 * method from the InfixExpression class. I will have to
	 * temporarily make it a public method in order to test it.
	 */
	public static void solveTest() {
		// // Test 1
		// print("\nTesting the solve() method");
		// print(border);
		// print("Test: 1");
		// print("Testing: 2 + 5");
		// print("Expected: 7");
		// infix = new InfixExpression("(2+5)-(1*1)");
		// print("Result: " + infix.solve(2, 5, '+'));
		//
		// // Test 2
		// print(border);
		// print("Test: 2");
		// print("Testing: 10 - 3");
		// print("Expected: 7");
		// print("Result: " + infix.solve(10, 3, '-'));
		//
		// // Test 3
		// print(border);
		// print("Test: 3");
		// print("Testing: 10 * 3");
		// print("Expected: 30");
		// print("Result: " + infix.solve(10, 3, '*'));
		//
		// // Test 4
		// print(border);
		// print("Test: 4");
		// print("Testing: 10 / 2");
		// print("Expected: 5");
		// print("Result: " + infix.solve(10, 2, '/'));
		//
		// // Test 5
		// print(border);
		// print("Test: 5");
		// print("Testing: 2^2");
		// print("Expected: 4");
		// print("Result: " + infix.solve(2, 2, '^'));
		//
		// // Test 6
		// print(border);
		// print("Test: 6");
		// print("Testing: 7%2");
		// print("Expected: 1");
		// print("Result: " + infix.solve(7, 2, '%'));
		//
		// print("\n" + border);
		// print("End of the solve() Test");
		// print(border);
		//
		// onDestroyInfix();
	}// End of the 'solveTest' method

}// class
