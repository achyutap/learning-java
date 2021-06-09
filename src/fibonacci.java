import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 0;
        Scanner input = new Scanner(System.in);
        int how = input.nextInt();
        System.out.println(1);
        System.out.println(1);
        while (how > 0) {
            c = a + b;
            System.out.println(c);
            b = c + a;
            System.out.println(b);
            a = b + c;
            System.out.println(a);
            how--;
        }
    }
}
