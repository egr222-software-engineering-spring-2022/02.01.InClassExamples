import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        // index
        String s1 = "Stuart Reges";
        String s2 = "Marty Stepp";

        System.out.println(s1.length());            // 12
        System.out.println(s1.indexOf("e"));        // 8
        System.out.println(s1.substring(7, 10));    // "Reg"

        String s3 = s2.substring(1, 7);
        System.out.println(s3.toLowerCase());       // "arty s"

//        String s = "Aceyalone";
//        s.toUpperCase();
//        System.out.println(s);  // what will print?

//        s = s1.toUpperCase();
//        System.out.println(s);  // what will print?

//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        System.out.println(str1 == str2);       // what will print?
    }
}