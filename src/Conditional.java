import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the temprature of your coffee?");
        int temperature = input.nextInt();

        if (temperature  >=70) {
            System.out.println("Batch ruined");
// this my new feature 
        }
            else if (temperature <= 59) {

                System.out.println("Heat more");}
            else{
            System.out.println("Optimum tempertarue reached");
                }
            }
        }


