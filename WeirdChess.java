import java.util.Scanner;

public class WeirdChess
{
    public static void main(String[] args) throws InterruptedException
    {
        //The user is welcomed to the game, and the story begins.
        System.out.println("Welcome to Weird Chess!");
        System.out.println("I'm sure you'll have a jolly fun time!");
        System.out.println("If you survive that is....");
        System.out.println("Let the game begin!\n");

        Scanner skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        String go = skip.nextLine();

        System.out.println("Oh fiddlebuscuits!");
        System.out.println("The princess has been captured by the kingdom of lizards.");
        System.out.println("The knights are too busy doing their stat homework, so it's up to you to save her!");
        System.out.println("\n\n\n\n\n");

        Thread.sleep(5000);
        System.out.println("What are you waiting for? Get to it!");
        skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        go = skip.nextLine();

        System.out.println("\n\n\n\n");
        System.out.println("You are travelling through a forest in the lizard kingdom, when suddenly:");
        System.out.println("Out jumps the lizard pawn!");
        System.out.println("'I'm going to eat you, or something like that' he snarls.");
        //A pawn object is created for the pawn boss.
        Pawn pawn = new Pawn();

        skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        go = skip.nextLine();
        System.out.println("\n\n\n\n");
        System.out.println("Don't worry, there's a simple way to defeat the pawn.");
        System.out.println("He loves berries and cream.");
        System.out.println("And he loves knock knock jokes way too much for his own good.");
        System.out.println(pawn);

        skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        go = skip.nextLine();

        System.out.println("If you tell the pawn a knock knock joke that he loves, he'll lose all his berries and cream!");
        System.out.println("Then he'll be sad and go home.");
        System.out.println("'I hold good grammar in very high regard! So your responses better have correct grammar!' the pawn says!");
        System.out.println("Finish the knock knock joke to defeat the pawn!");
        boolean pawnLaugh = pawn.joke();
        //If the user can't defeat the pawn, the game ends.
        if (pawnLaugh)
        {
            System.out.println("You did it!");
            System.out.println(pawn);
            System.out.println("Now you can move on!");
        }

        if (!pawnLaugh)
        {
            System.out.println(pawn);
            System.out.println("Oof. You didn't defeat the pawn. Sucks for you. Everyone was relying on you.");
            System.exit(0);
        }

        System.out.println("You continue on your journey into the Lizard Kingdom.");
        System.out.println("You begin to scale the wall, but oh no!");
        System.out.println("As you reach the top you see the Rook!");
        skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        go = skip.nextLine();
        System.out.println("\n\n");
        System.out.print("'You've seemed to get yourself in a right spot of cookie dough ice cream trouble laddie!'");
        System.out.println(" The Rook laughs.");
        skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        go = skip.nextLine();
        System.out.println("'I'll tell you what laddie! You caught me in a generous mood. So here's what's going to happen. ");
        System.out.println("I'm thinking of a number between 1 and 20! You have 5 guesses! If you can guess it, then I'll make you some spaghetti, and let you pass! ");
        System.out.println(" But if you can't, I'm going to make you a rock sandwich, and it's away from the lizard kingdom with you!'");
        //A Rook object is created for the Rook boss
        Rook rook = new Rook();
        rook.findNumber();

        //If the user can't defeat the Rook, then the game ends.
        if (rook.getSuccess())
        {
            System.out.println("You guessed the correct number!");
            System.out.println("'Ahh Bully!' The Rook says, 'Well, a deal's a deal. Enjoy the spaghetti, and you may now pass.'");
        }

        if (!rook.getSuccess())
        {
            System.out.println("Aw man! You couldn't guess the number! \nNow you'll have to eat a rock sandwich as you feel the full weight of your failure to save the princess.");
            System.exit(0);
        }

        System.out.println("You continue on with your journey, climbing down the wall.");
        System.out.println("You march right up to the castle. But oh no!");
        skip = new Scanner(System.in);
        System.out.println("Press enter to continue:");
        go = skip.nextLine();

        System.out.println("\n\n The knight stops you in your tracks!");
        System.out.println("'I wouldn't take another step closer if I were you laddie! I'm defending this castle!' The Knight growls.");
        System.out.println("'However, if you were to pay me, say, 10 dollars, I may be inclinded to let you through.'");
        skip = new Scanner(System.in);
        System.out.println("Press enter to continue:");
        go = skip.nextLine();
        System.out.println("Looks like you only have 9 dollars and 99 cents.");
        System.out.println("'You're one cent too short laddie! Looks like we're going to have to fight!' says the Knight");
        System.out.println("In the lizard kingdom they battle by Playing Rock Paper Scissors!\n If you can get 3 wins before the knight does, you can pass.\n But if the knight gets 3 wins first, then it's away from the lizard kingdom with you!");
        //A Knight object is created for the Knight boss
        Knight knight = new Knight();

        boolean beatKnight = knight.rockPaperScissors();

        //If the user can't beat the Knight boss, then the game ends.
        if (beatKnight)
        {
            System.out.println("'Oh chocolate chip cookies! You got 3 wins before me laddie' The knight curses.\n 'I guess I'll have to let you pass.'");
        }

        if (!beatKnight)
        {
            System.out.println("'I beat ye fair and square youngster. Now get off this property!'");
            System.exit(0);
        }

        System.out.println("You move past the knight and run into the castle!\n You hurry up, because time is running out!");
        System.out.println("You get to the spiral staircase, but someone is already there to greet you!");
        skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        go = skip.nextLine();
        System.out.println("\n But wait! It's a trap!\n The bishop stands before you, gloating.");
        System.out.println("'You may have been able to get past those simpletons, but you'll never get past me! Welcome to your doom!' The bishop cackles.");
        skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        go = skip.nextLine();
        System.out.println("'Instead of engaging in battle like a mindless brute, I prefer a battle of wits!'");
        System.out.println("'You must unscramble a word that I give you. \nYou may pass if you proceed, but if you fail, away with you!");
        //A Bishop object is created for the Bishop boss
        Bishop bishop = new Bishop();

        boolean beatBishop = bishop.unScramble();
        //If the user can't defeat the Bishop, then the game ends.
        if (beatBishop)
        {
            System.out.println("'You are more clever than you look. Very well, you may pass.' The bishop disappears in thin air.");
        }

        if (!beatBishop)
        {
            System.out.println("'You failed! Away from the lizard kingdom with you!'");
            System.exit(0);
        }

        System.out.println("\n\n You move forward and climb the spiral staircase.\nThe princess is close, you can feel it!");
        skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        go = skip.nextLine();
        System.out.println("\nYou reach the top of the staircase and see the door to the Queen's office!");
        System.out.println("You kick the door down and barge in.");
        skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        go = skip.nextLine();
        System.out.println("The Queen was expecting you. She sits at her desk and smiles.");
        System.out.println("'You've done well to make it this far' She says.");
        System.out.println("'But if you want to save the Princess, you'll have to make it past me.' she laughs.");
        System.out.println("'The princess is trapped in the 4th dimension.'");
        System.out.println("'To free her, you will need to solve my riddle.'");
        //A Queen object is created for the Queen boss
        Queen queen = new Queen();

        boolean beatQueen = queen.test();
        //If the user can't beat the Queen, then the game ends
        if (beatQueen)
        {
            System.out.println("'No! How could I be defeated?' the queen shrieks.");
        }

        if (!beatQueen)
        {
            System.out.println("'You didn't solve the riddle! Now the princess is mine forever!' The queen laughs");
            System.exit(0);
        }

        System.out.println("The queen leaves the room to go play Madden to comfort herself after her defeat.");
        System.out.println("Don't worry about the King. He's at Burger King, so you won't have to fight him.");
        System.out.println("A portal from the 4th dimension opens, and the princess steps out.");
        System.out.println("'Thank you so much for saving me.' She kindly says to you.");
        System.out.println("'Now let's throw a party at my castle to celebrate!'");
        skip = new Scanner(System.in);
        System.out.println("Press enter to continue");
        go = skip.nextLine();

        System.out.println("Everyone in the kingdom threw a party in your honor. Great job!");
        System.out.println("Congratulations! You saved the princess!");



    }


}