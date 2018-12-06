package java8;

import java.util.function.BiFunction;

public class BiFuntionExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String result = calculator.calc((a, b) -> ": " + (a * b), 3, 5);

        System.out.println(result);


        BiFunction<String, String,String> bi = (x, y) -> {
            return x + y;
        };

        System.out.println(bi.apply("java2s.com", " tutorial"));

    }
}

class Calculator {
    public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
        return bi.apply(i1, i2);
    }

}
