import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Divide given integer list into lists of even and odd numbers
//int[] arr = {1,2,3,4,5,6,7,8};
//output: [[1,3,5,7],[2,4,6,8]]
public class Problem006 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList()); // boxed used to convert array to list.
        Map<Boolean,List<Integer>> mapOfCategory =
                list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0,Collectors.toList()));
        System.out.println(mapOfCategory);

        List<List<Integer>> collect = mapOfCategory.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
        System.out.println(collect);

        //using partitioned by
        Map<Boolean,List<Integer>> mapOfCategory2 =
                list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0,Collectors.toList()));
        System.out.println(mapOfCategory2);
        List<List<Integer>> collect2 = mapOfCategory2.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
        System.out.println(collect2);
    }
}
