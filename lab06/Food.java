// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Supeng He (supeng)

import sofia.util.Random;
import sofia.micro.*;

//-------------------------------------------------------------------------
/**
 *  Feels bad
 *
 *  @author Supeng He(supeng)
 *  @version 2020.07.28
 */
public class Food extends SimpleActor
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Food object.
     */
    public Food()
    {
        super();
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Take one step, either forward or after turning left or right.
     */
    public void act() { //I guess in this part there are some bugs...
        if (this.getGridX() == 0 ) {
            if (this.getGridY() == 0) {
                this.move();
                this.turn(RIGHT);
                this.move();
            }
            if (this.getGridY() == (this.getWorld().getHeight() - 1)) {
                this.move();
                this.turn(LEFT);
                this.move();
            }
            else {
                if (this.getDirection() != EAST) {
                    this.turn(RIGHT);
                    this.turn(RIGHT);
                    this.move();
                }
                else {
                    this.move();
                }
            }
        }
        else if (this.getGridX() == (this.getWorld().getWidth() - 1)) {
            if (this.getGridY() == 0) {
                this.turn(RIGHT);
                this.turn(RIGHT);
                this.move();
                this.turn(LEFT);
                this.move();
            }
            else if (this.getGridY() == (this.getWorld().getHeight() - 1)) {
                this.turn(RIGHT);
                this.turn(RIGHT);
                this.move();
                this.turn(RIGHT);
                this.move();
            }
            else {
                this.turn(RIGHT);
                this.turn(RIGHT);
                this.move();
            }
        }
        else if (this.getGridY() == 0) {
            this.turn(RIGHT);
            this.turn(RIGHT);
            this.move();
        }
        else if (this.getGridY() == (this.getWorld().getHeight() - 1)) {
            this.turn(RIGHT);
            this.turn(RIGHT);
            this.move();
        }
        else {
            int value = Random.generator().nextInt(100);
            if ( value < 25 ) {
                this.turn(RIGHT);
                this.move();
            }
            else if ( value < 50) {
                this.turn(LEFT);
                this.move();
            }
            else {
                this.move();
            }
        }
    }

}
