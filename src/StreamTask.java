import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return Arrays.stream(numbers).filter(n -> n % 2 == 0).map(n -> n * n).sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return Arrays.stream(numbers).filter(n -> n % 2 != 0).sorted().toArray();
    }
}
