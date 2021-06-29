import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 * Generally OK
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He(supeng)
 *  @version 2020.07.18
 */

//---PickFlowers class extend from Jeroo class,//
//and is the subclass of Jeroo//
//This class provide some methods to help pick all flowers//
public class PickFlowers extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     Creates a new PickFlowers facing east with no flowers.
     * @param x         The x-coordinate of the Jeroo's location.
     * @param y         The y-coordinate of the Jeroo's location.
     */
    public PickFlowers(int x, int y)
    {
        super(x, y);
    }
    /**
     * First degin a turn around method
     * this help save steps
     */
    public void turnAround() {
          //turn right twice
        this.turn(RIGHT);
        this.turn(RIGHT);
    }
    //~ Methods ...............................................................
    /**
    * a method to pick all flowers
    * until face the water
    * this help pick up flowers in whole line
    */
    public void harvestRow() {
        while (!this.seesWater(AHEAD)) {     // while no water is ahead
            if (this.seesFlower(HERE)) {    // Jeroo picks flowers
                this.pick();
            }
            this.hop();
        }
        if (this.seesFlower(HERE)) {     // if flower is here when facing water
            this.pick();    //pick up flower
        }
    }
    /**
     * design a method to pick first flower 
     * in stright line
     * then pick it
     * this will help to pick one flower
     */
    public void pickFirstFlower() {
        while (!this.seesFlower(HERE)) {     // while there is no flower here
            this.hop();        // jump ahead
        }
        this.pick();    //  Jeroo  picks up the flower
    }   //end
    /**
     * design a method to hop until ahead water
     * this will help save steps.
     * although I can use harvestRow();
     * If there is no flower,
     * this method may save computations
     */
    public void rushEnd() {
        while (!this.seesWater(AHEAD)) {   // till face water ahead
            this.hop();     // jump ahead
        }
    }
}
