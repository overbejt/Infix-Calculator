import java.util.EmptyStackException;

/**
 * @author Josh Overbeck
 * @version 3.0
 *          <p>
 *          Does not need javadoc since Interface is commented
 *          </p>
 */
public class LinkedStack<T> implements StackInterface<T> {
	// Declaring an instance of the Node class to serve as the linked
	// stack
	private Node topNode;

	/**
	 * Constructor
	 */
	public LinkedStack() throws EmptyStackException {
		topNode = null;// Initializing the stack
	}// End of the 'Constructor'

	@Override
	public void push(T newEntry) {
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;
	}// End of the 'push' method

	@Override
	public T pop() {

		T top = peek();// Should throw EmptyStackException if empty
		assert topNode != null;
		topNode = topNode.next;
		return top;

	}// End of the 'pop' method

	@Override
	public T peek() {
		// Throw an EmptyStackException whenever a peek or pop is
		// called on an empty stack.
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			return topNode.data;
		}

	}// End of the 'peek' method

	@Override
	public boolean isEmpty() {
		return topNode == null;

	}// End of the 'isEmpty' method

	@Override
	public void clear() {
		topNode = null;

	}// End of the 'clear' method

	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	// >>>>>>>>>>>>>>>>>>Node class>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	/**
	 * This is the private internal class 'Node'. It will be used to
	 * create node objects.
	 * 
	 * @author Josh Overbeck
	 * @version 3.0
	 */
	private class Node {

		private T		data;	// Holds the node's data
		private Node	next;	// Holds the location of the next node

		/**
		 * Constructor
		 */
		public Node() {
			this.data = null;
			this.next = null;
		}// End of the Constructor

		/**
		 * Overloaded Constructor
		 * 
		 * @param value
		 */
		public Node(T value) {
			this.data = value;
			this.next = null;
		}// End of the Overloaded Constructor

		/**
		 * Overloaded Constructor
		 * 
		 * @param value
		 * @param topNode
		 */
		public Node(T value, Node nextNode) {
			this.data = value;
			this.next = nextNode;
		}// End of the Overloaded Constructor

	}// End of the 'Node' Internal class}

}// End of the 'LinkedStack' class
