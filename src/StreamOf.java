import java.util.Arrays;
import java.util.List;

public class StreamOf {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anuradha", "Aziz", "Sameera", "Nirupama", "Pavithra", "Awanthi");
        names.stream()
                .map( String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .sorted()
                .forEach(System.out::println);

    }
}
