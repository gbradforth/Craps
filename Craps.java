/**
 * Let's play Craps!
 *
 * @author Gwen Bradforth
 * @version 1/14/20
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);    
        //ask if want to play
        System.out.println("Want to play craps (Y/n)? ");
        String play = in.nextLine();
        while (play.equals("") || play.substring(0,1).equalsIgnoreCase("y")) 
        {
            //ask for instructions
            System.out.println("Do you know how to play (y/N)? ");
            String inst = in.nextLine();
            if (inst.equals("") || inst.substring(0,1).equalsIgnoreCase("n"))
            {
                //give instructions
                System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes your 'point.'");
                System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the 'point' again, in which case they win; or they roll a 7, in which case they lose.");
            }
            while (true)
            {
                //round 1
                System.out.println("Roll for the first round by pressing [Enter]!");
                in.nextLine();
                Die die = new Die();
                int dice_roll = die.doubleRoll();
                System.out.println(dice_roll);
                int point = dice_roll;

                //output for die results
                if (dice_roll == 7 || dice_roll == 11)
                {
                    System.out.println("You win! ヽ(^◇^*)/");
                    break;
                }
                else if (dice_roll ==  2 || dice_roll == 3 || dice_roll == 12)
                {
                    System.out.println("You lose! (◡﹏◡✿)");
                    break;
                }
                else
                    System.out.println("That value is now your point. Roll again!");

                //round 2
                in.nextLine();
                dice_roll = die.doubleRoll();
                System.out.println(dice_roll);
                while (dice_roll != point)
                {
                    if (dice_roll == 7) {
                        System.out.println("You lose! (◡﹏◡✿)");
                        break;
                    }
                    else {
                        System.out.println("Not your point. Roll again!");
                        in.nextLine();
                        dice_roll = die.doubleRoll();
                        System.out.println(dice_roll);
                    }
                }
                if (dice_roll == point)
                    System.out.println("That's your point! You win! ヽ(゜∇゜)ノ");
                break;
            }
            System.out.println("Want to play again(Y/n)? ");
            play = in.nextLine();
        }
        System.out.println("Goodbye! (;-_-)/");
    }
}