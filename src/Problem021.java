import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//22 Find the sum of all the elements in a list. understand mapToInt
public class Problem021 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,1,0,8,9,7,12,6,4,3);
        int sum = list.stream().mapToInt(x -> x).sum();
        System.out.println(sum);
        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        int[] arr = {5,1,0,8,9,7,12,6,4,3};
        int sum1 = Arrays.stream(arr).sum();
        System.out.println(sum1);
    }
}
