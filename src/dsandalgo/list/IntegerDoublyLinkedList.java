package dsandalgo.list;

public class IntegerDoublyLinkedList {

    private IntegerNode head;

    public void addSorted(Integer value) {
        IntegerNode node = new IntegerNode(value);
        if(head == null || head.getValue() >= value) {
            addToFront(value);
            return;
        }
        IntegerNode current = head.getNext();
        IntegerNode prev = head;
        while(current != null && current.getValue() < value) {
            prev = current;
            current = current.getNext();
        }
        node.setNext(current);
        prev.setNext(node);
    }

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value); // Create a new node
        node.setNext(head); // set the next value for the node
        head = node; // male node as the head
    }
    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }

    public void printList() {
        IntegerNode temp = head;
        while(temp != null) {
            System.out.print(temp.getValue());
            System.out.print("->");
            temp = temp.getNext();
        }
    }
}
