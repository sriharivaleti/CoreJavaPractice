import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Print the words which 2 vowels in it
public class Problem005 {
    public static void main(String[] args) {
        String s = "I am learning streams in java";
        System.out.println("original string : "+s);
        Stream<String> s1 = Stream.of(s.split(" "));
        List<String> collect = s1.filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == 2).peek(System.out::println).collect(Collectors.toList());
        System.out.println("collect : "+collect);
    }
}
