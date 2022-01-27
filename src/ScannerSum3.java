import java.util.*;

public class ScannerSum3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = readSum3(console);
        System.out.println("The sum is " + sum);
    }

    public static int readSum3(Scanner console) {
        System.out.print("Type 3 numbers: ");
        int num1 = console.nextInt();
        int num2 = console.nextInt();
        int num3 = console.nextInt();
        return num1 + num2 + num3;
    }
}