import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Generally Good
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He(supeng)
 *  @version 2020.07.18
 */
public class ScavengerHunt extends LongIsland
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ScavengerHunt object.
     */
    public ScavengerHunt()
    {
        // Nothing to initialize, leaving the world a default size
    }

    /**
     * Create my own program solution
     * which pick all the flowers
     * and don't be trap be net
     * finally stand on the flower in the middle .
     * I use relatively bulky codes to aviod nets
     * use some methods to pick flowers
     */
    //~ Methods ...............................................................
    public void myProgram() {
        // set Jeroo kevin at (2,2) face east
        PickFlowers kevin = new PickFlowers(2, 2);
        this.add(kevin);
        ////let kevin at the place face first flower
        kevin.turn(RIGHT);   // adjust the position of kevin
        kevin.hop(2);    // adjust the position of kevin
        kevin.turn(LEFT);   // adjust the position of kevin
        kevin.hop(3);    // adjust the position of kevin
        kevin.turn(LEFT);   // adjust the position of kevin
        //pick the first flower until water is ahead of kevin
        kevin.harvestRow();  
        //pick the second flower on the bottom left 
        kevin.turn(RIGHT);   // adjust the position of kevin
        kevin.hop();     // adjust the position of kevin
        kevin.turn(RIGHT);   // adjust the position of kevin
        kevin.pickFirstFlower();   // go to pick the second flower
        //go back pick flowers on the first line
        kevin.turnAround();  // adjust the position of kevin
        kevin.rushEnd();    // adjust the position of kevin
        kevin.turn(RIGHT);   // adjust the position of kevin
        kevin.harvestRow();   // pick flowers on the first line
        //go ahead pick flowers on the bottom line
        //let kevin face the flower on the bottom right 
        kevin.turn(RIGHT);   // adjust the position of kevin
        kevin.hop();    // adjust the position of kevin
        kevin.turn(LEFT);    // adjust the position of kevin
        kevin.hop();   // adjust the position of kevin
        kevin.turn(RIGHT);    // adjust the position of kevin
        kevin.pickFirstFlower();  //pick up the flower on the bottom right 
        // kevin pick flowers on the bottom  line
        kevin.turn(RIGHT);    // adjust the position of kevin
        kevin.harvestRow();     // kevin picks up the flower
        // last flower
        kevin.turnAround();   // adjust the position of kevin
        kevin.hop();     // adjust the position of kevin
        kevin.turn(LEFT);  // face the last flower
        kevin.pickFirstFlower();    //kevin picks last flower
        
    }

}
