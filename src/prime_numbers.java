import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        switch (age) {
            case 18:
                System.out.println("Hey young man");
                break;
            case 30:
                System.out.println("Hey man");
                break;
            case 70:
                System.out.println("Hey old man");
                break;
            default:
                System.out.println("Hey boy");
        }


    }
}
