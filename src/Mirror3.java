public class Mirror3 {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        topHalf();
        bottomHalf();
    }

    public static void printString(String str, int n) {
        for (int i = 1 ; i <= n ; i++)
            System.out.print(str);
    }

    public static void topHalf() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            printString(" ", line * -2 + ( 2 * SIZE ));

            System.out.print("<>");
            printString(".", line * 4 - 4);

            System.out.print("<>");
            printString(" ", line * -2 + ( 2 * SIZE ));

            System.out.println("|");
        }
    }

    public static void bottomHalf() {
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            printString(" ", line * -2 + ( 2 * SIZE ));

            System.out.print("<>");
            printString(".", line * 4 - 4);

            System.out.print("<>");
            printString(" ", line * -2 + ( 2 * SIZE ));

            System.out.println("|");
        }
    }
}