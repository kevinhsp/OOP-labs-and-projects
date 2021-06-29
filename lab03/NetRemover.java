import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Fine
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He(supeng)
 *  @version 2020.07.17
 */
public class NetRemover extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Harvester facing east with no flowers.
     * @param x         The x-coordinate of the Jeroo's location.
     * @param y         The y-coordinate of the Jeroo's location.
     */
    public NetRemover(int x, int y)
    {
       super(x, y);   //super
    }
     /**
     * Creates a new myprogram to pick up flowers.
     * clean nets
     */
    public void GetAllFlowers() {
        // see flowers here pick
        // see net ahead check has flowers
        // has flowers toss
        //else turn left 
        // see water ahead turn left
        for (int i = 0; i < 8; i++) { 
            this.harvestRow();
            if (i % 2 == 0) {
                this.turn(LEFT);
                if (this.seesNet(AHEAD)) {
                    this.toss();
                }
                if (!this.seesWater(AHEAD)) {
                    this.hop();
                    this.turn(LEFT);
                }
            }
            else {
                this.turn(RIGHT);
                if (this.seesNet(AHEAD)) {
                    this.toss();
                }
                if (!this.seesWater(AHEAD)) {
                    this.hop();
                    this.turn(RIGHT);
                }
            }
        }
    }
    /**
     * flowers and clean net
     * since all flowers are in one column
     * pick all flowers first
     * then turn around
     * when face net, just toss flowers
     * to prevent dying, when there is not flower
     * and face net, then turn left.
     */
    public void harvestRow() {
        while (!this.seesWater(AHEAD))
        {
            if (this.seesNet(AHEAD)) {
                if (this.hasFlower()) {
                    this.toss();   //Check has flower then toss
                }
                else {
                    this.turn(LEFT);   // no flower turn left
                }
            }
            if (this.seesFlower(HERE)) {
                this.pick();
            }
            
            this.hop();
        }
        if (this.seesFlower(HERE)) {
            this.pick();   //see Water(AHEAD)
        }
        if (this.seesNet(AHEAD)) {
            if (this.hasFlower()) {
                this.toss();
            }
            else {
                this.turn(RIGHT);
            }
        }
    }
}
