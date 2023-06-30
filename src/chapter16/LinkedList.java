package chapter16;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {

        List<String> names = new java.util.LinkedList<>();
        names.add("Folahan");
        names.add("Malik");

        System.out.println(names);

        boolean b = names.contains("Folahan");
        System.out.println(b);

        List<String> list = List.of("Malik");
        boolean b1 = names.containsAll(list);
        System.out.println(b1);


        System.out.println(names.get(0));

    }
}
