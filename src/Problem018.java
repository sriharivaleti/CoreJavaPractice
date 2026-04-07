//Write a stream program to move all zero’s to beginning of array
//int [] arr = {5,0,1,0,8,0};

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem018 {
    public static void main(String[] args) {
        int [] arr = {5,0,1,0,8,0};
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x -> x != 0))
                .values().stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(collect);
    }
}





