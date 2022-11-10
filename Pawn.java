import java.util.Scanner;

public class Pawn
{
    //Fields are declared
    private int berries;
    private int cream;

    //Initializes berries and cream fields
    public Pawn()
    {
        berries = 5;
        cream = 5;
    }

    //Setters
    public void setBerries(int numBerries)
    {
        berries = numBerries;

    }

    public void setCream(int numCream)
    {
        cream = numCream;

    }

    //Getters
    public int getBerries()
    {
        return berries;
    }

    public int getCream()
    {
        return cream;
    }

    /*Requires nothing
      Prompts the user for the right input to complete the knock knock joke
      Returns a boolean value stating whether or not the joke was completed correctly
    */
    public boolean joke()
    {
        System.out.println("Knock Knock");
        Scanner who = new Scanner(System.in);
        String whoLine = who.nextLine();
        if (!whoLine.equals("Who is there?") && !whoLine.equals("Who's there?"))
        {
            return false;

        }
        System.out.println("Orange");
        Scanner orangeWho = new Scanner(System.in);
        String orangeLine = orangeWho.nextLine();
        if (!orangeLine.equals("Orange who?") && !orangeLine.equals("orange who?"))
        {
            return false;
        }
        System.out.println("Orange you glad this joke is over?");
        this.setBerries(0);
        this.setCream(0);
        return true;

    }

    //toString method saying how much berries and cream the Pawn currently has.
    public String toString()
    {
        return "The pawn currently has " + this.getBerries() + " berries, and " + this.getCream() + " cream!";
    }


}