package stream;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {

        //using forEach without stream
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        number.forEach(n -> System.out.println(n));

        //using map method
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);


        List<String> names = Arrays.asList("Sita", "Ram", "Shyam");


        //using filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);


        //using sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);


        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);


        Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);


        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

        //reduce?

        List<Integer> nums = Arrays.asList(1, 6, 9, 3, 5);

        //first stream
        Stream<Integer> data = nums.stream();

        Stream<Integer> mappedData = data.map(n -> n * n);
        mappedData.forEach(n -> System.out.println(n));

        //second stream
        Stream<Integer> data1 = nums.stream();

        long cnt = data1.count();
        System.out.println(cnt);
    }
}




