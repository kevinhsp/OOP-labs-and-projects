import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 * A smarter-ish PatrolJeroo that knows how to turn castle
 * corners that have turrets.
 * 
 * Our goal in the class is to make the jeroo more smart.
 * That is, it should realize when there is no turret
 */
public class TurretJeroo extends PatrolJeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    /**
     * Creates a new TurretJeroo object.
     */
    public TurretJeroo()
    {
        super();
    }


    //~ Methods ...............................................................

    /**
     * Patrol around a corner that has a turret.
     */
    public void turnCorner()
    {
        this.turn(LEFT);
            
        super.turnCorner();
        super.turnCorner();
        super.turnCorner();
           
        this.turn(LEFT);
    }
}
