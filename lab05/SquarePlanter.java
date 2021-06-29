import sofia.micro.jeroo.*;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Supeng He (supeng)
//-------------------------------------------------------------------------
/**
 *  Cool
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He(supeng)
 *  @version 2020.07.25
 */
public class SquarePlanter extends Jeroo 
{
    //~ Fields ................................................................
    private int flower;


    //~ Constructor ...........................................................
    
    // ----------------------------------------------------------
    /**
     * Creates a new SquarePlanter object.
     * set a new flowersPerside
     * and give jeroo 4 * flowersPerside
     * @param flowersPerside is the all flowers /4  for jeroo
     */
    public SquarePlanter(int flowersPerside)
    {
        /*# Do any work to initialize your class here. */
        super(flowersPerside * 4);
        flower = flowersPerside;
    }
    

    //~ Methods...............................................................
    /**
     * Use for loop for flowers
     * plant one side flowers
     */
    public void plantOneSide() {
        for (int i = 0; i < flower; i++) {
            this.plant(); 
            this.hop();
        }
    }
    /**
     *Use for loop 
     *Plant all by running 4 times
     *everytime turn right
     */
    public void plantSquare() {
        for ( int i = 0; i < 4; i++) {
            this.plantOneSide();
            this.turn(RIGHT);  // add turn right
        }
    }
    /**
     * test myProgram with just plantSquare
     */
    public void myProgram() {
        this.plantSquare();
    }
}
