import sofia.micro.*;
import java.util.Scanner;

//-------------------------------------------------------------------------
/**
 *  Tux is a remotely controllable actor that reads commands
 *  from a scanner and carries out the corresponding actions
 *  one at a time as act() is called.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.13
 */
public class RemoteTux extends Actor
{
    //~ Fields ................................................................

    private Scanner input;


    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new RemoteTux object that reads commands
     * from a predefined URL (the URL is in the lab assignment).
     */
    public RemoteTux()
    {
        System.out.println("You have not implemented the RemoteTux() "
            + "constructor yet");
    }


    // ----------------------------------------------------------
    /**
     * Creates a new RemoteTux object that reads commands
     * from the given scanner.
     * @param scanner The scanner to read commands from.
     */
    public RemoteTux(Scanner scanner)
    {
        input = scanner;
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Reads one word from the scanner (if there is any), and executes
     * the corresponding command.  If the scanner has no words remaining,
     * then nothing happens.
     */
    public void act()
    {
        throw new UnsupportedOperationException(
            "You have not implemented act() yet");
    }


    // ----------------------------------------------------------
    /**
     * Moves the actor forward one square.
     */
    public void forward()
    {
        throw new UnsupportedOperationException(
            "You have not implemented forward() yet");
    }


    // ----------------------------------------------------------
    /**
     * Turns the actor left 90 degrees.
     */
    public void left()
    {
        throw new UnsupportedOperationException(
            "You have not implemented left() yet");
    }


    // ----------------------------------------------------------
    /**
     * Turns the actor right 90 degrees.
     */
    public void right()
    {
        throw new UnsupportedOperationException(
            "You have not implemented right() yet");
    }
}
