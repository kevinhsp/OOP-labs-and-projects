import sofia.micro.lightbot.*;

/**
 * PatrolBot is a subclass of LightBot (the super class)
 * Notice this comment as well -- this is an example of a Javadoc comment
 */
public class PatrolBot extends LightBot
{
    /**
     * Constructor -- to be discussed later in the class
     */
    public PatrolBot()
    {
       // This is an in-line comment -- no need to do anything here yet
    }
    

    public void patrolCastle()
    {
        this.walkOneWall();
        this.walkOneWall();
        this.walkOneWall();
        this.walkOneWall();
    }
    
    public void walkOneWall()
    {
        this.move();
        this.move();
        this.turnCorner();
    }
    
    /**
     * Pay attention to this method. See how the bot turns a corner
     * Compare it with the TurretBot's turnCorner() method
     * Notice the use of the keywords "this" and "super"
     */
    public void turnCorner()
    {
        super.move();
        this.turnRight();
        this.move();
    }
}
