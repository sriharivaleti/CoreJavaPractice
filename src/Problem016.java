import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Write a stream program to multiply alternative numbers in an array
//int[] arr = {4,5,1,7,2,2,2,1,4};
//64
public class Problem016 {
    public static void main(String[] args) {
        int[] arr = {4,5,1,7,2,2,2,1,4};
        List<Integer> collect = IntStream.range(0, arr.length).filter(i -> i % 2 == 0).mapToObj(i -> arr[i]).collect(Collectors.toList());
        Integer reduce = collect.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce);
    }
}
