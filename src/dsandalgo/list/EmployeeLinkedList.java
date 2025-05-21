package dsandalgo.list;

public class EmployeeLinkedList {

    private Node head;
    private int size;

    public void addToFront(Employee e) {
        Node node = new Node(e); // Create a new node
        node.setNext(head); // set the next value for the node
        head = node; // male node as the head
        size++;
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }


    public Node deleteAtFront() {
        if(isEmpty()) {
            return null;
        }
        Node temp = head;
        head = head.getNext();
        size--;
        temp.setNext(null);
        return temp;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node start = head;
        while(start != null) {
            System.out.println(start.getEmployee());
            start = start.getNext();
        }
    }
}
