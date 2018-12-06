package java8;

import java.util.function.BiConsumer;

public class MultiStatementInLabda {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> bi = (a, b) -> add(a, b);
        bi.accept(5, 7);
    }


    // multi statement in new method
    private static void add(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
