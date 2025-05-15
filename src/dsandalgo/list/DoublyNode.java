package dsandalgo.list;

public class DoublyNode {

        private Employee employee;
        private DoublyNode next;
        private DoublyNode prev;

    public DoublyNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode prev) {
        this.prev = prev;
    }

    public DoublyNode(Employee e) {
            this.employee = e;
        }

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public DoublyNode getNext() {
            return next;
        }

        public void setNext(DoublyNode next) {
            this.next = next;
        }

        public String toString() {
            return employee.toString();
        }
}
