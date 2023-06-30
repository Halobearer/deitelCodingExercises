package chapter17.StreamsApi;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSample2 {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);
        System.out.println(nums.stream()//stream() is a method in the Collections interface, it can also be found in other
                //places as well, but we need to first pass the List through a stream to access .map()
                .map(x -> x + 5)//This will add 5 to eac element
                .map(x -> x - 2)//Then this will minus 5 from each of the already added element
                //x->x +5 is a function
                .toList());
        //map(Function<? super T, ? extends R> mapper)____ T means input, R means output
        //In this Situation T is (1, 2, 3, 4) since it's the input::::::::::::::
//        Multiplying elements of the stream by 2
//        IntStream intStream = nums.stream()
//                .mapToInt(x -> x * 2);

        int integers = IntStream
                .rangeClosed(0, 10)
                .boxed()
                .reduce(0, Integer::sum);
//                .rangeClosed(0, 10)/*0-10*/
//                .boxed()
//                .collect(Collectors.toList());
        System.out.println(integers);
    }

    public static List<Integer> mapMethod(List<Integer> numbers) {
        return numbers
                .stream()//Get me a stream
                .map(num -> num * 2)//Multiply each element of the stream by 2
                .collect(Collectors.toList());//Print the Result
    }
}
