package java8.TestDefaultAccess;

import java8.TestDefaultAccess1.DefaultAccess1;

public class DefaultAccess extends DefaultAccess1 {

    public DefaultAccess(String a, String b) {
        super(a, b);
    }

    public static void main(String[] args) {
        DefaultAccess a = new DefaultAccess("Hello", " Phong");
        //protected is ok
        System.out.println(a.a);

        //default is error
//        System.out.println(a.b);
    }
}
