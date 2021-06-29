import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 * A Jeroo that is capable of patrolling around a "castle" of water.
 */
public class PatrolJeroo extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    /**
     * Default Constructor to Create a new PatrolJeroo object.
     */
    public PatrolJeroo()
    {
        super();
    }


    //~ Methods ...............................................................

    /**
     * Patrol around the entire castle.
     */
    public void patrolCastle()
    {
        this.patrolWall();
        this.patrolWall();
        this.patrolWall();
        this.patrolWall();
    }


    /**
     * Patrol along one wall.
     */
    public void patrolWall()
    {
        this.hop();
        this.hop();
        this.turnCorner();
    }


    /**
     * Patrol around the corner.
     */
    public void turnCorner()
    {
        this.hop();
        this.turn(RIGHT);
        this.hop();
    }
}
