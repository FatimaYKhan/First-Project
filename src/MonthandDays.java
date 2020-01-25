import java.util.Scanner;

public class MonthandDays {

    public static void main(String[] args) {

        daysInMonth();
    }

    public static void daysInMonth() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the month? Write (1-12)");
        int month = input.nextInt();
        while (month >= 1 && month <= 12) {
            if (month == 1)
                System.out.println("Days = 31");
            else if (month == 2) {
                System.out.println("Days = 28");

            } else if (month == 3) {
                System.out.println("Days = 31");
            } else if (month == 4) {
                System.out.println("Days = 30");
            } else if (month == 5) {
                System.out.println("Days = 31");
            } else if (month == 6) {
                System.out.println("Days = 30");
            } else if (month == 7) {
                System.out.println("Days = 31");
            } else if (month == 8) {
                System.out.println("Days = 31");
            } else if (month == 9) {
                System.out.println("Days = 30");
            } else if (month == 10) {
                System.out.println("Days = 31");
            } else if (month == 11) {
                System.out.println("Days = 30");
            } else if (month == 12) {
                System.out.println("Days = 31");
            }
            break;

        }
    }
}

