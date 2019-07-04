import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {
        Stream.of("Anuradha", "Sameera", "Nirupama", "Pavithra", "Awanthi")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

    }
}
