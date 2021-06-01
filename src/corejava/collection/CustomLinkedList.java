package corejava.collection;

public class CustomLinkedList {

	Node head;

	static class Node {

		Object data;
		Node next;

		Node(Object d) {
			this.data = d;
			this.next = null;
		}
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public void add(Object data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		}

		else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = newNode;
		}
	}

	public Node reverse(Node node) {

		Node prev = null, next = null;
		Node current = node;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
		return head;
	}

//	public static void main(String[] args) {
//
//		CustomLinkedList llist = new CustomLinkedList();
//		llist.add("one");
//		llist.add("two");
//		llist.add(4);
//		llist.add(null);
//		llist.add(null);
//
//		llist.printList();
//		llist.reverse(llist.head);
//		System.out.println("Reverese linked list");
//		llist.printList();
//	}

}
