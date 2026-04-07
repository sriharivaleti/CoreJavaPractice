import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//remove duplicates in the string
public class Problem003 {
    public static void main(String[] args) {
        String s = "arasfgsdr";
        System.out.println("original string : "+s);
        IntStream chars = s.chars();
        System.out.print("after removing duplicates : ");
         chars.distinct().mapToObj(i -> (char) i).forEach(System.out::print);

    }
}
