import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Count number of words in the given string
public class Problem004 {
    public static void main(String[] args) {
        String s = "I am learning learning streams in java java streams streams";
        Stream<String> stream = Arrays.stream(s.split(" "));
        Map<String, Long> collect = stream.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println("collect : "+collect);
        collect.entrySet().stream().forEach(System.out::println);
    }

}
