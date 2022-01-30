import java.util.Scanner;

public class ScannerTokens {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // cut and paste the following input OR you can enter them one "token" at a time to see what happens
        // 23  John Smith   42.0  "Hello world"  $2.50  "  19"
        System.out.print("Enter multiple tokens: ");
        System.out.println();
        System.out.println(console.next() + " ..."); // 23
        System.out.println(console.next() + " ..."); // John
        System.out.println(console.next() + " ..."); // Smith
        System.out.println(console.next() + " ..."); // 42.0
        System.out.println(console.next() + " ..."); // "Hello
        System.out.println(console.next() + " ..."); // world"
        System.out.println(console.next() + " ..."); // $2.50    [which is read as a String due to the "$"]
        System.out.println(console.next() + " ..."); // "
        System.out.println(console.next() + " ..."); // 19"
//        System.out.println(console.next() + " ..."); // hangs waiting for next token... :)

        // Nine tokens
    }
}