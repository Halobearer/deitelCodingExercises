package chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSample {
    public static void main(String[] args) {


        //Another Way to create a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers);
        List<String> names = List.of("James", "Birthday Girl", "Austin");
        System.out.println(names.get(2));


        List<Integer> nums = new ArrayList<>(30);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        nums.remove(10);
    }
}
