package dsandalgo.list;

public class EmployeeDoublyLinkedList {

    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    public void addToFront(Employee e) {
        DoublyNode node = new DoublyNode(e); // Create a new node
        node.setNext(head);
        if(head == null) {
            tail = node;
        } else {
            head.setPrev(node);
        }
        head = node; // male node as the head
        size++;
    }

    public void addToTail(Employee employee) {
        DoublyNode node = new DoublyNode(employee);
        if(tail == null) {
            head = tail = node;
        } else {
            node.setPrev(tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }


    public DoublyNode deleteAtFront() {
        if(isEmpty()) {
            return null;
        }
        DoublyNode temp = head;
        if(head == tail) {
            head = tail = null;
            return null;
        } else {
            head = head.getNext();
            head.setPrev(null);
            size--;
            return temp;
        }
    }

    public DoublyNode deleteAtEnd() {
        if(isEmpty()) {
            return null;
        }
        DoublyNode temp = tail;
        if(head == tail) {
            head = tail = null;
            return null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
            size--;
            return temp;
        }
    }

    public boolean addBefore(Employee e, Employee newE) {
        if(isEmpty()) return false;
        DoublyNode index = head;
        while(index != null && !index.getEmployee().equals(e)) {
            index = index.getNext();
        }
        if(index == null) {
            return false;
        }
        DoublyNode newNode = new DoublyNode(newE);
        newNode.setNext(index);
        newNode.setPrev(index.getPrev());
        if(head == index) {
            head = newNode;
        } else {
            newNode.getPrev().setNext(newNode);
        }
        size++;
        return false;
    }

    public int size() {
        return size;
    }

    public void printList() {
        DoublyNode start = head;
        while(start != null) {
            System.out.println(start.getEmployee());
            start = start.getNext();
        }
    }
}
