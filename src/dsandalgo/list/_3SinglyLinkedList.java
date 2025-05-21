package dsandalgo.list;

public class _3SinglyLinkedList {

    public static void main(String[] args) {

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFront(new Employee("irfan","basha",10));
        employeeLinkedList.addToFront(new Employee("sadaf","sumala",100));
        employeeLinkedList.addToFront(new Employee("abc","def",1040));

        employeeLinkedList.printList();

        System.out.println(employeeLinkedList.size());

        System.out.println(employeeLinkedList.isEmpty());

        employeeLinkedList.deleteAtFront();

        employeeLinkedList.printList();

        System.out.println(employeeLinkedList.size());
    }
}
