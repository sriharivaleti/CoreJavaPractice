import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {

                int[] arr = {2, 7, 11, 15};
                int target = 9;

                Map<Integer, Integer> map = new HashMap<>();

                int[] result = IntStream.range(0, arr.length)
                        .filter(i -> {
                            int complement = target - arr[i];
                            if (map.containsKey(complement)) {
                                return true;
                            }
                            map.put(arr[i], i);
                            return false;
                        })
                        .mapToObj(i -> new int[]{map.get(target - arr[i]), i})
                        .findFirst()
                        .orElse(null);

                System.out.println(Arrays.toString(result));

        }
    }





