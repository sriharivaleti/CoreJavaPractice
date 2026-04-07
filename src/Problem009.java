import java.util.Arrays;
import java.util.stream.IntStream;

//10 Given an array, find the sum of unique elements
//int[] arr ={1,6,7,8,1,6,9,1}
public class Problem009 {
    public static void main(String[] args) {
        int[] arr ={1,6,7,8,1,6,9,1};
        IntStream stream = Arrays.stream(arr); //create stream
        System.out.println("unique elements in array");
        int sum = stream.distinct().peek(System.out::println).sum();
        System.out.println("sum of unique elements in array");
        System.out.println(sum);
    }
}
