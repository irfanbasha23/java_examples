package generics;

import java.util.List;

public class UnboundedWildCardGeneric {

    public void printList(List<?> lists) {
        for(Object element : lists) {
            System.out.println(element);
        }
    }
}
