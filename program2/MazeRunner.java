import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Program2
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.07.29
 */
public class MazeRunner extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MazeRunner object.
     * inheritant the Jeroo class
     * set MazeRunner havs 15 flowers
     */
    public MazeRunner()
    {
        super(15);
    }
    /**
     * Firstly,
     * For handle flowers and nets,
     * just seeflower under feet---pick it,
     * seenet ahead ---toss it and hop
     * For Navigation it is relatively complex,
     * I devide it to 3 situations:
     * First one is seesWater Ahead
     *     then if there is water left 
     *        no water right then jeroo turn right
     *        if there is water right jeroo turn around
     *     else if there is water right
     *        (because we checked if water left before)
     *        so jeroo just turn left
     *     else (which means water is only ahead)
     *         jeroo turn right
     * Second is seesWater Left
     * because we have considered all consequences
     * of water ahead
     * we just need to consider both water left and right
     * if it is, jeroo hop
     * else jeroo turn right
     * same, we considered all other consequences except
     * jeroo only seewater right
     * if it is then jeroo will go hop
     * One important thing
     * everytime when jeroo will hop,
     * we will check net head
     */

    //~ Methods ...............................................................
    public void myProgram() {
        // this long while condition limit the program will keep running
        //until there is no flower, no net and jeroo is at (1,1).
        while (!(this.getWorld().getObjects(Net.class).isEmpty() &&
               this.getWorld().getObjects(Flower.class).isEmpty() &&
               this.getGridX() == 1 && this.getGridY() == 1)) {  
            if (this.seesFlower(HERE)) {
                this.pick();    //for picking up flowers under feet
            }
            else if (this.seesWater(AHEAD)) {
                if (this.seesWater(LEFT)) {
                    if (this.seesWater(RIGHT)) {
                        this.turn(RIGHT);  // if water is ahead
                        this.turn(RIGHT);  // and water is at right
                        this.cleanNet();   // and water is at left 
                        // jeroo turn around
                    }
                    else {
                        // when water is only on the ahead and left
                        this.turn(RIGHT);
                        this.cleanNet();
                    }
                }
                else if (this.seesWater(RIGHT)) {
                    // when water is only on the ahead and right 
                    this.turn(LEFT);
                    this.cleanNet();
                }
                else {
                    // when water is only ahead
                    this.turn(RIGHT);
                    this.cleanNet();
                }
            }
            else if (this.seesWater(LEFT)) {
                if (!this.seesWater(RIGHT)) {
                    this.turn(RIGHT);  //when water is only on left and right
                    this.cleanNet();
                }
                else {
                    this.cleanNet();  // when water is only on left
                }
            }
            else {
                this.cleanNet();   //when water is only on right
            }
            
        }
    }
    /**
     * this is to check whether sees net ahead
     * if not just hop
     * else toss and hop
     */
    public void cleanNet() {
        if (this.seesNet(AHEAD)) {
            this.toss();  //if sees net ahead toss and move
            this.hop();
        }
        else {
            this.hop(); // else just move
        }
    }
}
