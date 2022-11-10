import java.util.Random;
import java.util.Scanner;
public class Rook
{
    //Fields are declared
    private int guesses;
    private boolean success;
    private int numOfInterest;

    //Rook class initializes all fields
    public Rook()
    {
        guesses = 5;
        success = false;
        Random rand = new Random();
        numOfInterest = rand.nextInt(20);
    }

    //Getters
    public int getGuesses()
    {
        return guesses;
    }

    public boolean getSuccess()
    {
        return success;
    }

    public int getNumInterest()
    {
        return numOfInterest;
    }

    //Setters
    public void setGuesses(int tries)
    {
        guesses = tries;
    }

    public void setSuccess(boolean correct)
    {
        success = correct;
    }

    public void setNumInterest(int newNum)
    {
        numOfInterest = newNum;
    }

    /*Requires nothing
      Returns nothing
      Continuously prompts the user for a random number until the correct number is given
      Modifies success to true if the correct number is given.
    */
    public void findNumber()
    {
        String message = "";
        message += numOfInterest;
        Scanner input;
        String choice = "";
        int compare;
        while ((this.getGuesses() > 0) && !choice.equals(message))
        {
            input = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 20!");
            choice = input.nextLine();
            this.setGuesses(this.getGuesses() - 1);
            try
            {
                compare = Integer.parseInt(choice);
                if (compare < numOfInterest)
                {
                    System.out.println("Your number was too low!");
                }

                if (compare > numOfInterest)
                {
                    System.out.println("Your number was too high!");
                }
            }
            catch (Exception e)
            {
                System.out.println("You need to enter an integer! The princess is counting on you!");
            }
            System.out.println("You now have " + this.getGuesses() + " guesses.");


        }
        if (choice.equals(message))
        {
            this.setSuccess(true);
        }
    }


}