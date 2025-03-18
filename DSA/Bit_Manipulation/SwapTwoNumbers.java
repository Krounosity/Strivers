import java.util.Arrays;
import java.util.List;

class SwapTwointegers {
    static List<Integer> get(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        return Arrays.asList(a, b);
    }
}