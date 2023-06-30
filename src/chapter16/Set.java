package chapter16;

import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        java.util.Set<Integer> nums = new TreeSet<>();
        //iT doesn't matter if you add in order it automatically arranges from lowest to Highest
        nums.add(23);
        nums.add(1);
        nums.add(30);
        nums.add(10);

        System.out.println(nums);
    }
}
