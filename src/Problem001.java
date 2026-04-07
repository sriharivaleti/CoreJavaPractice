//Print longest length word in the given sentence

import java.util.Comparator;
import java.util.stream.Stream;

public class Problem001 {
    public static void main(String[] args) {
        String s = "I am learning stream api in java";
        Stream<String> split = Stream.of(s.split(" "));
        String s1 = split.max(Comparator.comparing(String::length)).get();
        System.out.println(s1);
    }
}
