import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  A jeroo that "hurdles" (crosses over) lines of nets that project
 *  up from the south shore.
 *
 *  @author Stephen Edwards (stedwar2)
 *  @version 2013.02.11
 */
public class Hurdler extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Hurdler object.
     */
    public Hurdler()
    {
        super();
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Runs across the south shore, hurdling any lines of nets
     * it encounters, until it reaches the east shore.
     */
    public void myProgram()
    {
        while (!this.seesWater(AHEAD))
        {
            if (this.seesNet(AHEAD))
            {
                this.jumpHurdle();
            }
            else
            {
                this.hop();
            }
        }
    }
    

    // ----------------------------------------------------------
    /**
     * Hurdle over a vertical line of nets touching the south
     * shore.
     */
    public void jumpHurdle()
    {
        this.turn(LEFT);
        this.followNet();
        this.overTheTop();
        this.followNet();
    }


    // ----------------------------------------------------------
    /**
     * Follow along a line of nets to the jeroo's right, until
     * either there are no more nets to follow, or the jeroo
     * is blocked by water ahead.
     */
    public void followNet()
    {
        while (this.seesNet(RIGHT))
        {
            this.hop();
        }
    }
    

    // ----------------------------------------------------------
    /**
     * Cross "over the top" of the hurdle (the line of nets) so
     * that the jeroo can follow the right side of the line of nets
     * back down to the south shore.
     */
    public void overTheTop()
    {
        this.turn(RIGHT);
        this.hop(2);
        this.turn(RIGHT);
    }
}
