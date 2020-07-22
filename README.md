# Portfolio
import java.util.Scanner;
class PlayingCardsProgram
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int choice;
    int num;

    System.out.println ("Playing cards program.");
    System.out.println ("Give me some numbers and \nI Will tell you the appropriate playing card.");
    System.out.println ("==============================================");

    System.out.println ("How many numbers?");
    num = input.nextInt();

    while(num > 0) 
    {
        System.out.println ();
        System.out.println ("Enter Number: ");
        choice = input.nextInt();
    if (choice >=1 && choice <= 14)
    {
      num--;
      switch(choice) 
      {
        case 1: 
        System.out.println ("You have an Ace.");
        break;

        case 2: 
        System.out.println ("You have a 2.");
        break;

        case 3: 
        System.out.println ("You have a 3.");
        break;

        case 4: 
        System.out.println ("You have a 4.");
        break;

        case 5: 
        System.out.println ("You have a 5.");
        break;

        case 6:
         System.out.println ("You have a 6.");
         break;

        case 7: 
        System.out.println ("You have a 7.");
        break;

        case 8: 
        System.out.println ("You have an 8.");
        break;

        case 9: 
        System.out.println ("You have a 9.");
        break;

        case 10: 
        System.out.println ("You have a 10.");
        break;

        case 11: 
        System.out.println ("You have an Ace.");
        break;

        case 12: 
        System.out.println ("You have a Jack.");
        break;

        case 13: 
        System.out.println ("You have a Queen.");
        break;

        case 14: 
        System.out.println ("You have a King.");
        break;
      }
    }
    else 
    System.out.println ("ERROR: Out of range (1-14). Reenter: " + num);
  }
  }
}
