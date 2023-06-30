package chapter16;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {
    public static void main(String[] args) {
        System.out.println(Character.getNumericValue('a'));
        System.out.println(Arrays.toString("t_T".getBytes()));

        Set<String> names = new TreeSet<>();
        names.add("Tinuade");
        names.add("tayo");
        names.add("Timothy");
        names.add("tinuke");

        System.out.println(names);
    }
}
