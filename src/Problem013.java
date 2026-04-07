//Given a list of strings, create a list that contains only integers

import java.util.Arrays;
import java.util.List;

public class Problem013 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("java8","streams","code9x","how");
        input.stream().filter(s -> s.matches(".*\\d.*")).forEach(System.out::println);

    }
}
