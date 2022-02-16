import java.util.Scanner;

public class j3Challenge2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("a=");
        a = in.nextInt();
        System.out.println("b=");
        b = in.nextInt();
        System.out.println("c=");
        c = in.nextInt();
        if (a<b && a<c) System.out.println("a is the minimum");
        else
        if (b<a && b<c) System.out.println("b is the minimum");
        else System.out.println("c is the minimum");


    }
}