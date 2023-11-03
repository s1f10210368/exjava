package lecture5.ex1;

import java.util.function.Function;

public class Factorial implements Function<Integer, Long> {
    @Override
    public Long apply(Integer n) {
        if (n < 0) {
            throw new IllegalArgumentException("階乗は負の整数に対して定義されていません。");
        }
        if (n <= 1) {
            return 1L;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}

