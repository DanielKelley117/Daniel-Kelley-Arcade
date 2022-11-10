import java.util.Random;
import java.util.Scanner;
public class Queen
{
    //Fields are initialized
    private final String riddleOne = "When long I bring boredom, when short I bring fear. What am I?";
    private final String riddleTwo = "If you know me, you'll want to share me. But if you share me, I'll be gone. What am I?";
    private final String riddleThree = "Hit me hard and I will crack. But I'll just keep staring back. What am I?";
    private final String riddleFour = "I am an instrument who's music always comes from the heart. What am I?";
    private final String riddleOneAns1 = "Time";
    private final String riddleOneAns2 = "Time.";
    private final String riddleTwoAns1 = "Secret";
    private final String riddleTwoAns2 = "Secret.";
    private final String riddleThreeAns1 = "Mirror";
    private final String riddleThreeAns2 = "Mirror.";
    private final String riddleFourAns1 = "Organ";
    private final String riddleFourAns2 = "Organ.";
    private String riddle;

    //Constructor initializes riddle to nothing.
    public Queen()
    {
        riddle = "";
    }

    //Setter
    public void setRiddle(String question)
    {
        riddle = question;
    }

    //Getter
    public String getRiddle()
    {
        return riddle;
    }

    /*Requires nothing
      Prompts a riddle to the user and takes in a response
      Returns a boolean value whether or not the user's answer was the correct one
    */
    public boolean test()
    {
        Random rand = new Random();
        int prompt = rand.nextInt();

        if (prompt < 25)
        {
            this.setRiddle(riddleOne);
        }

        if (prompt >= 25 && prompt < 50)
        {
            this.setRiddle(riddleTwo);
        }

        if (prompt >= 50 && prompt < 75)
        {
            this.setRiddle(riddleThree);
        }

        if (prompt >= 75)
        {
            this.setRiddle(riddleFour);
        }

        System.out.println("Here is your riddle: " + this.getRiddle());
        Scanner response = new Scanner(System.in);
        String choice = response.nextLine();

        if (this.getRiddle().equalsIgnoreCase(riddleOne) && (choice.equalsIgnoreCase(riddleOneAns1) || choice.equalsIgnoreCase(riddleOneAns2)))
        {
            System.out.println("You win!");
            return true;
        }

        else if (this.getRiddle().equalsIgnoreCase(riddleTwo) && (choice.equalsIgnoreCase(riddleTwoAns1) || choice.equalsIgnoreCase(riddleTwoAns2)))
        {
            System.out.println("You win!");
            return true;
        }

        else if (this.getRiddle().equalsIgnoreCase(riddleThree) && (choice.equalsIgnoreCase(riddleThreeAns1) || choice.equalsIgnoreCase(riddleThreeAns2)))
        {
            System.out.println("You win!");
            return true;
        }

        else if (this.getRiddle().equalsIgnoreCase(riddleFour) && (choice.equalsIgnoreCase(riddleFourAns1) || choice.equalsIgnoreCase(riddleFourAns2)))
        {
            System.out.println("You win!");
            return true;
        }

        else
        {
            System.out.println("You lose.");
            return false;
        }

    }

}