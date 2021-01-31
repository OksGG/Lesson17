package gusakova;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> stringList = new HashSet<>();
        stringList.add("foo");
        stringList.add("buzz");
        stringList.add("bar");
        stringList.add("fork");
        stringList.add("bort");
        stringList.add("spoon");
        stringList.add("!");
        stringList.add("dude");

        removeEvenLength(stringList);
        System.out.println(stringList);
    }


    static Set<String> removeEvenLength(Set<String> set) {

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            final String word = iterator.next();
            if (word.length() % 2 == 0) {
                iterator.remove();
            }
        }
        return set;
    }


}



