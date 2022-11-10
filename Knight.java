import java.util.Scanner;
import java.util.Random;
public class Knight
{
    //Class fields are defined
    private String userChoice;
    private String compChoice;
    private int userWins;
    private int compWins;

    //Constructor initializes all fields
    public Knight()
    {
        userChoice = "";
        userWins = 0;
        compChoice = "";
        compWins = 0;
    }

    //Setters
    public void setUserChoice(String newChoice)
    {
        userChoice = newChoice;
    }

    public void setCompChoice(String newChoice)
    {
        compChoice = newChoice;
    }

    public void setUserWins(int wins)
    {
        userWins = wins;
    }

    public void setCompWins(int wins)
    {
        compWins = wins;
    }

    //Getters
    public String getUserChoice()
    {
        return userChoice;
    }

    public String getCompChoice()
    {
        return compChoice;
    }

    public int getUserWins()
    {
        return userWins;
    }

    public int getCompWins()
    {
        return compWins;
    }

    /* Requires nothing
       Continuously prompts the user for input for rock paper scissors while the user and the computer don't have 3 wins
       returns true if user gets 3 wins, false otherwise
    */
    public boolean rockPaperScissors()
    {

        while (this.getUserWins() < 3 && this.getCompWins() < 3)
        {
            Scanner option = new Scanner(System.in);
            System.out.println("Enter 'Rock' 'Paper' or 'Scissors': ");
            this.setUserChoice(option.nextLine());

            while (!this.getUserChoice().equalsIgnoreCase("Rock") && !this.getUserChoice().equalsIgnoreCase("Paper") && !this.getUserChoice().equalsIgnoreCase("Scissors"))
            {
                System.out.println("That is not a valid option. Enter 'Rock' 'Paper' or 'Scissors': ");
                Scanner retry = new Scanner (System.in);
                this.setUserChoice(retry.nextLine());
            }

            Random rand = new Random();
            int compGuide = rand.nextInt(21);
            if (compGuide <= 7)
            {
                this.setCompChoice("Rock");
            }

            if (compGuide > 7 && compGuide <= 14)
            {
                this.setCompChoice("Paper");
            }

            if (compGuide > 14 && compGuide <= 21)
            {
                this.setCompChoice("Scissors");
            }

            if (this.getUserChoice().equalsIgnoreCase("Rock") && this.getCompChoice().equalsIgnoreCase("Scissors"))
            {
                System.out.println("You win this round. The Knight chose " + this.getCompChoice());
                this.setUserWins(this.getUserWins() + 1);
            }

            if (this.getUserChoice().equalsIgnoreCase("Scissors") && this.getCompChoice().equalsIgnoreCase("Paper"))
            {
                System.out.println("You win this round. The Knight chose " + this.getCompChoice());
                this.setUserWins(this.getUserWins() + 1);
            }
            if (this.getUserChoice().equalsIgnoreCase("Paper") && this.getCompChoice().equalsIgnoreCase("Rock"))
            {
                System.out.println("You win this round. The Knight chose " + this.getCompChoice());
                this.setUserWins(this.getUserWins() + 1);
            }

            if (this.getUserChoice().equalsIgnoreCase("Scissors") && this.getCompChoice().equalsIgnoreCase("Rock"))
            {
                System.out.println("You lose this round. The Knight chose " + this.getCompChoice());
                this.setCompWins(this.getCompWins() + 1);
            }

            if (this.getUserChoice().equalsIgnoreCase("Rock") && this.getCompChoice().equalsIgnoreCase("Paper"))
            {
                System.out.println("You lose this round. The Knight chose " + this.getCompChoice());
                this.setCompWins(this.getCompWins() + 1);
            }

            if (this.getUserChoice().equalsIgnoreCase("Paper") && this.getCompChoice().equalsIgnoreCase("Scissors"))
            {
                System.out.println("You lose this round. The Knight chose " + this.getCompChoice());
                this.setCompWins(this.getCompWins() + 1);
            }

            if (this.getUserChoice().equalsIgnoreCase(this.getCompChoice()))
            {
                System.out.println("This round was a tie. The Knight also chose " + this.getCompChoice());
            }

            System.out.println("You currently have " + this.getUserWins() + " wins, while the Knight has " + this.getCompWins());
        }

        if (userWins == 3)
        {
            System.out.println("Great job! You got 3 wins first!");
            return true;
        }

        if (compWins == 3)
        {
            System.out.println("Well that sucks. The Knight got 3 wins before you");
            return false;
        }
        return false;
    }

}