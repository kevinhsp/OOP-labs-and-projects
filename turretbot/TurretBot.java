import sofia.micro.lightbot.*;

/**
 * Javadoc comments are written here to draw your attention.
 * It is NOT an example of how you should write comments. -- AG
 */
public class TurretBot extends PatrolBot
{
    public TurretBot()
    {
       //
    }
    
    /**
     * The only difference between a PatrolBot and a TurretBot is in how they turn corners.
     * Here, we define turnCorner() method for the TurretBot (named turry)
     * Notice how we can use all other methods inherited from the PatrolBot
     * Also notice the use of the keywords "this" and "super" 
     */
    public void turnCorner()
    {
        this.turnLeft();
        super.turnCorner();
        super.turnCorner();
        super.turnCorner();
        this.turnLeft();
    }
}
