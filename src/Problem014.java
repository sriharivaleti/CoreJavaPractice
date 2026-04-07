//Find the products of the first two elements in an array

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Problem014 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 8};
        List<Integer> boxed = Arrays.stream(arr).boxed().collect(Collectors.toList());
       Integer i = boxed.stream().limit(2).reduce(1,(x,y)->x*y);
        System.out.println(i);
    }
}
