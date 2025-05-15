package generics;

import java.util.List;

public class BoundedWildCardGeneric {

    public void printList(List<? extends Number> numberList) {
        for(Number element : numberList) {
            System.out.println(element);
        }
    }
}
