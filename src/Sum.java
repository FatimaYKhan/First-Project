import java.util.Currency;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Greetings(input);
        Budget(input);
        Time(input);
        Distance(input);
    }
        public static void Greetings ( Scanner input){

            System.out.println("Welcome to Vacation Planner!");
            System.out.print("What is your name? ");
            String name = input.nextLine();
            System.out.print("Nice to meet you " + name +  ", where are you travelling to? ");
            String destination = input.nextLine();
            System.out.println("Great! " + destination + " sounds like a great trip");
            System.out.println("************ \n");
        }

        public static void Budget (Scanner input){

            System.out.print("How many days are you going to spend travelling? ");
            int days = input.nextInt();
            System.out.print("How much money, in USD, are you planning to spend on your trip? ");
            double amount = input.nextDouble();
            System.out.print("What is the three letter currency symbol for your travel destination? ");
            String currency = input.next();
            System.out.print("How many " + currency + " are there in 1 USD? ");
            double conversionRate = input.nextDouble();
            System.out.println("\n");
            double dailySpendDollar = (amount/days);

            System.out.println("If you are travelling for " + days + " days that is the same as " + days*24 + " hours or " + days*24*60 + " minutes" );
            System.out.println("If you are going to spend $" + amount + " USD that means per day you can spend up to $" + amount/days + " USD");
            System.out.println("Your total budget in " + currency + " is " + amount*conversionRate + " " + currency + ", which per day is " + amount*conversionRate/days + " " + currency);
            System.out.println("************ \n");
    }

        public static void Time (Scanner input){

            System.out.print("What is the time difference, in hours, between your home and your destination ");
            int timeDifference = input.nextInt();
            System.out.println("That means that when it is midnight at home it will be " + (timeDifference%12)+":00" + " in your travel destination");
            System.out.println("and when it is noon at home it will be " + (12+timeDifference%24) + ":00");
            System.out.println("************ \n");
    }

        public static void Distance (Scanner input){

            System.out.print("What is the square area of your destination country in km2? ");
            int Area = input.nextInt();
            System.out.println("In miles that is " + Area*0.62137);
        }


}