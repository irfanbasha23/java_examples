package generics;

import java.util.List;

public class LowerBoundedWildCardGeneric {

    public void printList(List<? super Integer> list) {
        list.add(1);
        list.add(2);
    }
}
