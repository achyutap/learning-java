import java.util.Scanner;

public class percentage_cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Marks of subject 1:");
        byte sub1 = input.nextByte();
        System.out.println("Marks of subject 2:");
        byte sub2 = input.nextByte();
        System.out.println("Marks of subject 3:");
        byte sub3 = input.nextByte();
        System.out.println("Marks of subject 4:");
        byte sub4 = input.nextByte();
        System.out.println("Marks of subject 5:");
        byte sub5 = input.nextByte();

        float percentage = (float) ((sub1 + sub2 + sub3 + sub4 + sub5)*100)/500;
        System.out.println("Percentage of this boy is:");
        System.out.println(percentage + " %");

    }
}
