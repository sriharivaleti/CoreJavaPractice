import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//In a given array of integers, return true if it contains distinct values. int[] arr = {5,1,0,8,9,7,3,4,4,3}; use noneMatch
public class Problem019 {
    public static void main(String[] args) {
        int[] arr = {5,1,0,8,9,7,12,6,4,3};
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Integer, Long> collect1 = collect.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect1);
        boolean b = collect1.values().stream().noneMatch(x -> x > 1);
        System.out.println(b);
    }
}
