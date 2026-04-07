import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

//print 2nd largest string in the provided sentence
public class Problem002 {
    public static void main(String[] args) {
        String s = "I am learning Stream api in java";
        Stream<String> s1 = Stream.of(s.split(" "));
      //  s1.sorted(Comparator.reverseOrder()).forEach(System.out::println);
        String s2 = s1.sorted(Comparator.<String, Integer>comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(s2);
    }


}
