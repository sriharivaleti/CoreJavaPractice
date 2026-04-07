import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Group /Pair anagrams from a list of Strings.
public class Problem015 {
    public static void main(String[] args) {
        String[] input = {"vile","silent","listen","evil","study","integral","dusty","triangle"};
        Stream<String> input1 = Stream.of(input);
        Map<List<Character>, List<String>> collect = input1.collect(
                Collectors.groupingBy(
                x -> x.chars().mapToObj(c -> (char)c).sorted().collect(Collectors.toList()),
                        Collectors.toList()
                )
        );
        Set<List<String>> collect1 = collect.values().stream().collect(Collectors.toSet());
        System.out.println(collect1);
    }
}
