import sofia.micro.lightbot.*;

//-------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author your name (your-pid)
 *  @version (place the date here, in this format: yyyy.mm.dd)
 */
public class LevelSoln extends Level
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new LevelSoln object.
     */
    public LevelSoln()
    {
        // Nothing to initialize, leaving the world a default size
        Block block = new sofia.micro.lightbot.Block();
        add(block, 4,3);
        LightableTile light = new LightableTile();
        add(light, 6,3);
    }


    //~ Methods ...............................................................


    public void myProgram()
    {
        LightBot andy = new LightBot();
        add( andy, 3,3 );
        andy.turnRight();
        andy.move();
        
    }
}
