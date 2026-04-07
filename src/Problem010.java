//Given a string, find the first non-repeated character
//Word : "Hello Sreehari How Are You"

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem010 {
    public static void main(String[] args) {
        String input = "Hello Sreehari How Are You";
        System.out.println("Approach Using Filter");
        Stream<String> stream = Arrays.stream(input.split(""));
        stream.filter(x -> input.indexOf(x) == input.lastIndexOf(x)).findFirst().ifPresent(System.out::println);
        System.out.println("Approach Using HashMap");
        Map<Character, Long> collect = input.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
        Map.Entry<Character, Long> characterLongEntry = collect.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get();
        System.out.println(characterLongEntry.getKey());
    }
}
