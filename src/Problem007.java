import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a word, find the occurrence of each character
//String s="Mississippi";
public class Problem007 {
    public static void main(String[] args) {
        String s="Mississippi";
        Stream<String> stream = Arrays.stream(s.split(""));
        stream.collect(Collectors.groupingBy(x->x, TreeMap::new,Collectors.counting())).entrySet().stream().forEach(System.out::println);
    }
}
