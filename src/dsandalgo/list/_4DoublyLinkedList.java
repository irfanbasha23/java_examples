package dsandalgo.list;

public class _4DoublyLinkedList {

    public static void main(String[] args) {
        EmployeeDoublyLinkedList employeeLinkedList = new EmployeeDoublyLinkedList();
        employeeLinkedList.addToFront(new Employee("irfan","basha",10));
        employeeLinkedList.addToFront(new Employee("sadaf","sumala",100));
        employeeLinkedList.addToFront(new Employee("abc","def",1040));


        employeeLinkedList.addToTail(new Employee("abcd","defg",1040));

        employeeLinkedList.printList();

        System.out.println(employeeLinkedList.size());

        System.out.println(employeeLinkedList.isEmpty());

        employeeLinkedList.deleteAtFront();

        employeeLinkedList.printList();

        System.out.println(employeeLinkedList.size());

        employeeLinkedList.deleteAtEnd();

        employeeLinkedList.printList();

        System.out.println(employeeLinkedList.size());

        employeeLinkedList.addBefore(new Employee("irfan","basha",10), new Employee("newsadaf","sumala",100));

        employeeLinkedList.printList();

        System.out.println(employeeLinkedList.size());
    }
}
