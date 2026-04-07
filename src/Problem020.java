//Given the string[] group the strings based on the middle character
// String[] str = {"a", "ab", "ewe", "jji", "jhj", "kwk", "aha", "java", "python", "", null, "  "};

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem020 {
    public static void main(String[] args) {
        String[] str = {"a", "ab", "ewe", "jji", "jhj", "kwk", "aha", "java", "python", "", null, "  "};
        List<String> collect = Arrays.stream(str).filter(x -> x != null && !x.isBlank()).collect(Collectors.toList());
        Map<Character, List<String>> collect1 = collect.stream().collect(Collectors.groupingBy(x -> x.charAt((x.length()-1)/2), Collectors.toList()));
        System.out.println(collect1);

    }
}
