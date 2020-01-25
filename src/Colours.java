import java.util.Scanner;

public class Colours {
public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("What colour do you want? ");
    String Colour = input.next();

         if (Colour.equalsIgnoreCase("G"))
         {
             System.out.println("Green");}
             else if (Colour.equalsIgnoreCase("B")){
             System.out.println("Blue");
         }
             else if (Colour.equalsIgnoreCase("R")){
             System.out.println("Red");
         }
             else System.out.println("Unknown Colour: " + Colour);
         }


     }


