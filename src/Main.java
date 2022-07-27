import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int a, b;
        double c;

        System.out.print("1. Kenari Giriniz: ");
        a = inp.nextInt();
        System.out.print("2. Kenari Giriniz: ");
        b = inp.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus: " + c);

        double q,w,e,u,cevre,alan;

        System.out.print("1. Kenar: ");
        q = inp.nextDouble();
        System.out.print("2. Kenar: ");
        w = inp.nextDouble();
        System.out.print("3. Kenar: ");
        e = inp.nextDouble();

        u = (q+w+e)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-q)*(u-w)*(u-e));

        System.out.println("Cevre: " + cevre);
        System.out.println("Alan: " + alan);
    }
}
