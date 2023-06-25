package Hashing;

import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Search - contains
        if (set.contains(1)){
            System.out.println("set contains 1");
        }
        if (!set.contains(6)){
            System.out.println("not contain 6");
        }

        // Delete
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("deleted");
        }

        // size
        System.out.println("size is " + set.size());

        // print all elements
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();

        // hasNext, next
        // it.hasNext - true or false

        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

    }
}
