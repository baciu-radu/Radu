import java.util.Locale;
import java.util.Scanner;

public class j3Challeng4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, i;
        System.out.println("n=");
        n = in.nextInt();
        String[] strings = new String[n];

        for (i = 0; i < n; i++) {
            System.out.println("strings[" + i + "]=");
            strings[i] = in.next();
        }
        //display init values:
        System.out.println("\nInitial Values:");
        for (String str : strings) {
            System.out.println(str);
        }
        //display uppercase values
        System.out.println("\n Uppercase Values:\n");
        for (i = 0; i < n; i++) {
            System.out.println(strings[i].toUpperCase(Locale.ROOT));
        }

    }
}
