import java.util.Scanner;

public class j3Challenge3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i;
        Integer[] array = new Integer[100];
        System.out.println("n=");
        n = in.nextInt();

        //read array from console
        for (i = 0; i < n; i++) {
            System.out.println("array[" + i + "]=]");
            array[i] = in.nextInt();
        }
        //display array
        System.out.println("display array:");
        for (i = 0; i < n; i++) {
            System.out.println("array[" + i + "]="+array[i]);
        }
        System.out.println("\nDisplay Max&Min:");
        //find maximum and minimum
        int max, min;
        max = array[0];
        min = array[0];
        for (i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        //print max and min
        System.out.println("Max=" + max);
        System.out.println("\nMin=" + min);
    }
}