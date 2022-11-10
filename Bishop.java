import java.util.Random;
import java.util.Scanner;
public class Bishop
{
    //Fields are defined
    private String scramble;
    private final String opt1 = "rthae";
    private final String opt2 = "diwn";
    private final String opt3 = "ria";
    private final String opt4 = "riptjue";
    private final String opt1Ans = "Earth";
    private final String opt2Ans = "Wind";
    private final String opt3Ans = "Air";
    private final String opt4Ans = "Jupiter";

    //Constructor initialized scramble to an empty string
    public Bishop()
    {
        scramble = "";
    }

    //Setter for scramble
    public void setScramble(String normal)
    {
        scramble = normal;

    }

    //Getter for scramble
    public String getScramble()
    {
        return scramble;
    }

    /*Requires: nothing
      Prompts user for the correct word.
      If the user is right, returns true, otherwise returns false.
    */
    public boolean unScramble()
    {
        Random rand = new Random();
        int prompt = rand.nextInt(100);
        if (prompt < 25)
        {
            this.setScramble(opt1);
        }

        if (prompt >= 25 && prompt < 50)
        {
            this.setScramble(opt2);
        }

        if (prompt >= 50 && prompt < 75)
        {
            this.setScramble(opt3);
        }

        if (prompt >= 75)
        {
            this.setScramble(opt4);
        }

        System.out.println("Unscramble this word!: " + this.getScramble());
        Scanner input = new Scanner(System.in);
        String userGuess = input.nextLine();

        if (this.getScramble().equalsIgnoreCase(opt1) && userGuess.equalsIgnoreCase(opt1Ans))
        {
            System.out.println("You win!");
            return true;
        }

        else if (this.getScramble().equalsIgnoreCase(opt2) && userGuess.equalsIgnoreCase(opt2Ans))
        {
            System.out.println("You win!");
            return true;
        }

        else if (this.getScramble().equalsIgnoreCase(opt3) && userGuess.equalsIgnoreCase(opt3Ans))
        {
            System.out.println("You win!");
            return true;
        }

        else if (this.getScramble().equalsIgnoreCase(opt4) && userGuess.equalsIgnoreCase(opt4Ans))
        {
            System.out.println("You win!");
            return true;
        }

        else
        {
            System.out.println("That's not the correct answer. You lose");
            return false;
        }
    }




}