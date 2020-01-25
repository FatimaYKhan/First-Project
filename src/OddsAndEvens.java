import java.util.Random;
import java.util.Scanner;
public class OddsAndEvens {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Lets play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Hi " + name + ", Which do you choose? (O)dds or  (E)vens? ");
        String choice = input.next();

        if (choice.contains("o")) {
            System.out.println(name + " has picked " + choice + "! The computer will be evens");

        } else {
            System.out.println(name + " has picked " + choice + "! The computer will be odds");


        }
        System.out.println("----------------------------------");
        System.out.println();


        int Usernum = 0;
while (Usernum<=0 || Usernum>=5) {
    System.out.println("How many \"fingers\" do you put out? ");
    Usernum = input.nextInt();
}
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\". ");

        System.out.println("----------------------------------");
        System.out.println();
        int sum = computer + Usernum;
        System.out.println(Usernum + " + " + computer + " = " + sum);
        String winner = null;
        if ( sum%2==0 && choice.contains("e")){
            winner = name;
        }
    else if ( sum%2==0 && choice.contains("o")){
        winner = "Computer";
    }
    else if ( sum%2==1 && choice.contains("e")){
        winner = "Computer";
    }
    else if ( sum%2==1 && choice.contains("o")){
        winner = name;
    }
    System.out.println(sum+" is ..."+ (sum%2==0?"evens!":"odds!") );
    System.out.println("that means " + winner + " wins ");


            }
        }




