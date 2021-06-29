import sofia.micro.*;
import sofia.util.Random;
//-------------------------------------------------------------------------
/**
 *  A predator chases the nearest food object, and eats it if it
 *  can catch it.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.07.28
 */
public class Predator extends SimpleActor
{
    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Predator object.
     */
    public Predator()
    {
        super();
    }


    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * Take one step closer toward the nearest food object, eating
     * it if we land on it.
     * if not intersecting, keep chasing pizza
     * or eat, and create a new random pizza.
     */
    public void act() {
        Food food = getOneIntersectingObject(Food.class);  
        int x = Random.generator().nextInt(this.getWorld().getWidth());
        int y = Random.generator().nextInt(this.getWorld().getHeight());
        if (food != null) {      // if food get intersected
            food.remove();    // remove food
            Food newFood = new Food();   
            this.getWorld().add(newFood, x, y);  // create new food
        }
        else {
            if (this.getDirection() == directionOf(Food.class)) {
                this.move();
            }
            else {   //this explain food in different directions
                // then predator should turn to the direction
                if (this.getDirection() == EAST) {
                    if (directionOf(Food.class) == WEST) {
                        this.turn(RIGHT);
                        this.turn(RIGHT);
                        this.move();
                    }
                    else if (directionOf(Food.class) == NORTH) {
                        this.turn(LEFT);
                        this.move();
                    }
                    else {
                        this.turn(RIGHT);
                        this.move();
                    }
                }
                else if (this.getDirection() == WEST) {
                    if (directionOf(Food.class) == EAST) {
                        this.turn(RIGHT);
                        this.turn(RIGHT);
                        this.move();
                    }
                    else if (directionOf(Food.class) == NORTH) {
                        this.turn(RIGHT);
                        this.move();
                    }
                    else {
                        this.turn(LEFT);
                        this.move();
                    }
                }
                else if (this.getDirection() == NORTH) {
                    if (directionOf(Food.class) == SOUTH) {
                        this.turn(RIGHT);
                        this.turn(RIGHT);
                        this.move();
                    }
                    else if (directionOf(Food.class) == WEST) {
                        this.turn(LEFT);
                        this.move();
                    }
                    else {
                        this.turn(RIGHT);
                        this.move();
                    }
                }
                else {
                    if (directionOf(Food.class) == NORTH) {
                        this.turn(RIGHT);
                        this.turn(RIGHT);
                        this.move();
                    }
                    else if (directionOf(Food.class) == WEST) {
                        this.turn(RIGHT);
                        this.move();
                    }
                    else {
                        this.turn(LEFT);
                        this.move();
                    }
                }
            }
        }
    }
}
