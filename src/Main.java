import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream
                .range(1,20)
                .skip(10)
                .forEach(System.out::println);
    }
}
