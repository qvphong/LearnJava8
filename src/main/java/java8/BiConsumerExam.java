package java8;

import java.util.function.BiConsumer;

public class BiConsumerExam {
    public static void main(String[] args) {
        BiConsumer<String, String> con = (a, b) -> System.out.println(a +" " + b);
        con.accept("hello", "phong");
    }
}
