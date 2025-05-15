package dsandalgo.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class _2Vector {

    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Irfan","basha",1234));
        employeeList.add(new Employee("Syed","basha",4556));
        employeeList.add(new Employee("John","Doe",5346));
        employeeList.add(new Employee("Erik","Doe",3534));

        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());
        System.out.println(employeeList.set(1, new Employee("abc","ass",1)));

        System.out.println(employeeList.size());

        Employee[] objectList = employeeList.toArray(new Employee[employeeList.size()]);

        System.out.println(employeeList.contains(new Employee("Irfan","basha",1234)));
        // To make this true, you need implement equals and hashcode method

        employeeList.remove(2);
        // After remove, the elements shift automatically
        employeeList.forEach(e -> System.out.println(e));
    }
}
