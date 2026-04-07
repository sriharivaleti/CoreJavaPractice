import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

//09 Arrange the numbers in Descending/Ascending Order
//int arr = {1,2,3,4,5}
public class Problem008 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Stream<Integer> boxed = Arrays.stream(arr).boxed();
        System.out.println("Numbers in ascending order:");
        boxed.sorted().forEach(System.out::println);
        System.out.println("Numbers in descending order:");
        Stream<Integer> boxed2 = Arrays.stream(arr).boxed();
        boxed2.sorted(Collections.reverseOrder()).forEach(System.out::println);

    }
}
