import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//24 Convert a list of integers to a list of their squares
public class Problem023 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(collect);
    }
}



