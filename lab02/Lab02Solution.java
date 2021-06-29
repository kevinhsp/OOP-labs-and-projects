import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Nice
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.07.16
 */
public class Lab02Solution extends PlantationIsland
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Lab02Solution object.
     */
    public Lab02Solution()
    {
        // Nothing to initialize, leaving the world a default size
    }
     /**
     * Creates a new myprogram.
     */
    public void myProgram()
    {
        // --- add new ---
        Harvester susu = new Harvester(2 , 3);   // new code
        this.add(susu);  // new code
        // --- harvest clean flowers---
        susu.harvestRow();  // new code
        // --- Skippingharvest clean flowers---
        SkippingHarvester xingxing = new SkippingHarvester(2 , 5);   // new code
        this.add(xingxing);  // new code
        xingxing.harvestRow();   // new code
        // --- Plantingharvest clean and plant flowers---
        PlantingHarvester zhuzhu = new PlantingHarvester(2 , 7); // new code
        this.add(zhuzhu);  // new code
        zhuzhu.hop2AndPick();  // new code
        zhuzhu.hop2AndPick();  // new code
        zhuzhu.hop2AndPick();  // new code
        //~ set location................................

    }
}
