import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 * A Jeroo island that has two lakes/ponds that are
 * representing castles.
 */
public class Castles extends Island
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    /**
     * Creates a new Castles object.
     */
    public Castles()
    {
        super(14, 10);
        prepare();
    }

    //~ Methods ...............................................................

    /**
     * Creates the lakes/castles. To remove a turret, simply
     * comment out one of the lines below that's adding the
     * turret.
     */
    private void prepare()
    {
        this.add(new Water(), 2, 3);
        this.add(new Water(), 3, 3);
        this.add(new Water(), 4, 3);
        this.add(new Water(), 4, 4);
        this.add(new Water(), 3, 4);
        this.add(new Water(), 2, 4);
        this.add(new Water(), 2, 5);
        this.add(new Water(), 3, 5);
        this.add(new Water(), 4, 5);
        this.add(new Water(), 8, 3);
        this.add(new Water(), 9, 3);
        this.add(new Water(), 10, 3);
        this.add(new Water(), 10, 4);
        this.add(new Water(), 9, 4);
        this.add(new Water(), 8, 4);
        this.add(new Water(), 8, 5);
        this.add(new Water(), 9, 5);
        this.add(new Water(), 10, 5);
        
        // Top-left turret/pond
        this.add(new Water(), 7, 2);
        
        // Top-right turret/pond
        this.add(new Water(), 11, 2);

        // Bottom-right turret/pond
        this.add(new Water(), 11, 6);
        
        // Bottom-left turret/pond
        this.add(new Water(), 7, 6);
    }
    
    /**
     * Add a TurretJeroo to the world and have her
     * patrol around the castle.
     */
    public void myProgram() {
        //Create new Jeroos
        PatrolJeroo pat = new PatrolJeroo();
        TurretJeroo jerry = new TurretJeroo();
        this.add(jerry, 8, 2);
        this.add(pat, 2, 2);
        //Pat patrols simple castle
        pat.patrolCastle();
        //Jerry patrols turreted castle
        jerry.patrolCastle();
    }
}
