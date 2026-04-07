//Given an array of integers, group the numbers by the range
//int[] arr = {2, 3, 10, 14, 20, 24, 30, 34,40, 44,50,54};
//{0=[2, 3], 10=[10, 14], 20=[20, 24], 30=[30, 34], 40=[40, 44], 50=[50, 54]}

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Problem012 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 14, 20, 24, 30, 34,40, 44,50,54};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        LinkedHashMap<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(x -> x / 10 * 10, LinkedHashMap::new, Collectors.toList()));
        System.out.println(collect);
    }
}

