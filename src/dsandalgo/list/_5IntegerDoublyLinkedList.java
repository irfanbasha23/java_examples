package dsandalgo.list;

public class _5IntegerDoublyLinkedList {

    public static void main(String[] args) {

        IntegerDoublyLinkedList list = new IntegerDoublyLinkedList();
        list.addSorted(20);
        list.addSorted(35);
        list.addSorted(-15);
        list.addSorted(7);
        list.addSorted(55);
        list.addSorted(1);
        list.addSorted(-22);
        list.printList();
    }
}
