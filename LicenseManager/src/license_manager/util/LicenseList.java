package license_manager.util;

/**
 * A custom LinkedList for reading in id objects
 * 
 * @author Joel Reji
 * @author Allen Thomas
 *
 * @param <E>
 *            is a generic object for manipulation
 */
public class LicenseList<E> {
	/** The head of list */
	private Node<E> head;
	/** The size of the list */
	private int size;

	/**
	 * Constructs the LinkedList
	 */
	public LicenseList() {
		size = 0;
		head = new Node<E>(null, null);
	}

	/**
	 * Returns the size of the list
	 * 
	 * @return the size of the list
	 */
	public int size() {
		return size;
	}

	/**
	 * Checks if an element is a part of the list
	 * 
	 * @param element
	 *            is an element to be checked
	 * @return true or false based on if the element is a part of the list
	 */
	public boolean contains(E element) {
		if (size == 0) {
			return false;
		}
		for (int i = 0; i < size(); i++) {
			if (get(i) != null && get(i).equals(element)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Adds an element to the end of the list
	 * 
	 * @param element
	 *            is the element to be added to the list
	 * @return true or false based on if something is added or not
	 */
	public boolean add(E element) {
		if (element == null) {
			throw new NullPointerException();
		}

		if (size == 0) {
			head = new Node<E>(element, null);
			size++;
			return true;
		}

		Node<E> current = head;
		for (int i = 0; i < size() - 1; i++) {
			current = current.next;
		}
		current.next = new Node<E>(element, null);
		size++;
		return true;
	}

	/**
	 * Gets the element at the index
	 * 
	 * @param index
	 *            is the index to get the element at
	 * @return the element at the index
	 */
	public E get(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			return head.data;
		}
		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.data;
	}

	/**
	 * Adds an element to a certain index
	 * 
	 * @param index
	 *            is the index to add the element to
	 * @param element
	 *            is the element to be added
	 */
	public void add(int index, E element) {
		if (element == null) {
			throw new NullPointerException();
		}
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}

		if (index == 0) {
			head = new Node<E>(element, head);
			size++;
			return;
		}
		Node<E> current = head;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		current.next = new Node<E>(element, current.next);
		size++;
	}

	/**
	 * Remove an element at a particular index
	 * 
	 * @param index
	 *            is the index to remove at
	 * @return the element which is removed
	 */
	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			E temp = head.data;
			head = head.next;
			size--;
			return temp;
		}
		if (index == size() - 1) {
			Node<E> current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			E temp = current.next.data;
			current.next = null;
			size--;
			return temp;
		}
		Node<E> current = head;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		E temp = current.next.data;
		current.next = current.next.next;
		size--;
		return temp;
	}

	/**
	 * Gets the index of element passed in
	 * 
	 * @param element
	 *            is the element passed in
	 * @return the index of the element passed in or -1 if the element isn't in
	 *         the list
	 */
	public int indexOf(E element) {
		Node<E> current = head;
		for (int i = 0; i < size(); i++) {
			if (get(i) == element) {
				return i;
			}
			current = current.next;
		}
		return -1;
	}

	/**
	 * A node inner class to hold the data values and a pointer to the next
	 * element
	 * 
	 * @author Joel Reji
	 * @author Allen Thomas
	 *
	 * @param <E>
	 *            is a generic object for manipulation
	 */
	@SuppressWarnings("hiding")
	private class Node<E> {
		/** The data of the object */
		private E data;
		/** The next value in the list */
		private Node<E> next;

		/**
		 * The second constructor for the Node inner class
		 * 
		 * @param data
		 *            is the data of the object
		 * @param next
		 *            is the next value in the list
		 */
		private Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
}
