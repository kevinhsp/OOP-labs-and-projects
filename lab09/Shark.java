import sofia.micro.*;
import java.util.*;

//-------------------------------------------------------------------------
/**
 *  A shark that chases and eats minnows.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.07
 */
public class Shark extends Actor
{
    //~ Fields ................................................................
    private List<Actor> stomach;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Shark object.
     */
    public Shark()
    {
        super();
        stomach = new ArrayList<Actor>();
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * Calculate the distance to another actor.
     * 
     * @param actor The other actor.
     * @return The distance from this shark to the other actor.
     */
    public double distanceTo(Actor actor)
    {
        int xDistance = (actor.getGridX() - this.getGridX()); 
        int yDistance = (actor.getGridY() - this.getGridY());  

        return Math.sqrt(xDistance * xDistance + yDistance * yDistance) ;  
    }

    // ----------------------------------------------------------
    /**
     * Find the minnow nearest to this shark.
     * 
     * @return The minnow that is closest, if there is one, or
     *         null if there are no more minnows in the ocean.
     */
    public Minnow nearestMinnow()
    {
        Minnow nearest = null;
        List<Minnow> minnowList = this.getWorld().getObjects(Minnow.class);
        double minvalue = 9999;
        for ( int i = 0; i < minnowList.size(); i++) {
            if (this.distanceTo(minnowList.get(i)) < minvalue) {
                minvalue = distanceTo(minnowList.get(i));
                nearest = minnowList.get(i);
            }
        }
        return nearest;
    }

    // ----------------------------------------------------------
    /**
     * Eat a minnow by removing it from the world and adding it
     * to this shark's stomach contents.
     * 
     * @param minnow The minnow to eat.
     */
    public void eat(Minnow minnow)
    {
        minnow.remove();
        stomach.add(minnow);
    }

    // ----------------------------------------------------------
    /**
     * Sharks move towards the nearest minnow, eating it if they
     * reach it.
     */
    public void act()
    {
        if (this.nearestMinnow() != null) {
            this.turnTowards(this.nearestMinnow());
            this.move(this.distanceTo(this.nearestMinnow()));
            this.eat(this.nearestMinnow());
        }
    }

    /**
     * list for stomach contents
     * @return the stomach list
     */
    public List<Actor> getStomachContents() {
        return stomach;
    }
}
