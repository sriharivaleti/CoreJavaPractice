import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//25 Find and print the distinct odd numbers
public class Problem024 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(11,3,6,5,9,3,6,4,7,2,12,16);
        List<Integer> collect = input.stream().distinct().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
