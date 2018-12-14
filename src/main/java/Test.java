import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a year: ");
        int
                year = reader.nextInt();
        boolean result = LeapYear.isLeapYear(year);
        if (result) System.out.printf("%d is a leap year!", year);
        else System.out.printf("%d is not a leap year!", year);
    }
}
