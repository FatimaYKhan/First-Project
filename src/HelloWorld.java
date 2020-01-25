import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("On what day of the month were you born?");
        int Date = console.nextInt();
        // System.out.println(Date);
        System.out.println("What is the name of the month in which you were born?");
        String Month = console.next();
        // System.out.println(Month);
        System.out.println("During what year were you born?");
         int Year = console.nextInt();
        // System.out.println(Year);
        System.out.println("You were born on " + Month + " " + Date + ", " + Year + ". You're mighty old!");
    }
}