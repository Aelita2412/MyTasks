package code;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NewTest {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
        List<String> list2 = list;
        //list2.add(10);
        for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext(); )
            System.out.println( itemItr.next() );
    }
}