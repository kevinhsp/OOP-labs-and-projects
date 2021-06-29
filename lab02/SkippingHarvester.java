import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  FFFFF
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He(supeng)
 *  @version 2020.07.16
 */
public class SkippingHarvester extends Harvester
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new PlantingHarvester object.
     * @param x         The x-coordinate of the Jeroo's location.
     * @param y         The y-coordinate of the Jeroo's location..
     */
    public SkippingHarvester(int x, int y)
    {
        super(x , y);  //super
    }
    // ----------------------------------------------------------
    /**
     * Turn the Harvester hop forward 
     * and then pick a flower, 
     * direction.
     *
     * @precondition  None.
     *
     * @postcondition The Harvester hop and pick.
     * @postcondition The Harvester hop.
     */
    public void hop2AndPick()
    {
        hopAndPick();   //new code
        hop();   //new code
    }

    //~ Methods ...............................................................


}
