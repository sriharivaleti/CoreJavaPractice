import java.util.Arrays;

//Given a string, find the first repeated character
//Word "The House Of Dragons in jio hotstar"
public class Problem011 {
    public static void main(String[] args) {
        String s = "The House Of Dragons in jio hotstar";
        Arrays.stream(s.split("")).filter(x -> s.indexOf(x) != s.lastIndexOf(x)).findFirst().ifPresent(System.out::println);
    }
}
