import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Wuwu
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He(supeng)
 *  @version 2020.07.16
 */
public class Harvester extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Harvester facing east with no flowers.
     * @param x         The x-coordinate of the Jeroo's location.
     * @param y         The y-coordinate of the Jeroo's location.
     */
    public Harvester(int x, int y)
    {
       super(x, y);   //super
    }
    // ----------------------------------------------------------
    /**
     * Turn the Harvester hop forward and then pick a flower
     * direction.
     *
     * @precondition  None.
     *
     * @postcondition The Harvester pop.
     * @postcondition The Harvester pick.
     */
    public void hopAndPick()
    {
        hop(); //new code
        pick(); //new code
    }
    /**
     * Turn the Harvester hop forward and then pick a flower 
     * twice
     * direction.
     *
     * @precondition  None.
     *
     * @postcondition The Harvester hopAndPick.
     * @postcondition The Harvester hopAndPick.
     */
    public void hop2AndPick()
    {
        hopAndPick(); //new code
        hopAndPick(); //new code
    }    
    /**
     * Turn the Harvester hop forward and then pick a flower in a row
     * direction.
     *
     * @precondition  None.
     *
     * @postcondition The Harvester hopAndPick twice.
     * @postcondition The Harvester hopAndPick twice.
     */
    public void harvestRow()
    {
        hop2AndPick();  //new code
        hop2AndPick();  //new code
        hop2AndPick();  //new code
    }

}
