package java8;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMapExam {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> con = new ConcurrentHashMap<>();
        con.put(1, "one");
        con.put(2, "two");
    }
}
