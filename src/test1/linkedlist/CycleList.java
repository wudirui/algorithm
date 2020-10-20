package test1.linkedlist;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CycleList {

    public static void main(String[] args) {
        Set<CycleList> set = new HashSet<>();
        CycleList cycleList = new CycleList();
        boolean add = set.add(cycleList);
        System.out.println(add);
        System.out.println(set.add(cycleList));
    }
}
