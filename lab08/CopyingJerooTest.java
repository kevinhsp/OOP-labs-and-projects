import sofia.micro.*;
import sofia.micro.jeroo.*;
import static sofia.micro.jeroo.CompassDirection.*;
import static sofia.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
/**
 *  Unit tests for the CopyingJeroo class.
 *
 *  @author Supeng He(supeng)
 *  @version 2020.08.06
 */
public class CopyingJerooTest extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new CopyingJerooTest test object.
     */
    public CopyingJerooTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        /*# Insert your own setup code here */
    }


    // ----------------------------------------------------------
    /**
     * Check hopToWater(), assuming that setUp() places the
     * jeroo at (1, 1) facing east.
     */
    public void testHopToWater()
    {
        DualIsland island = new DualIsland();
        Jeroo copier = new Jeroo();
        CopyingJeroo jeroo = new CopyingJeroo(copier);
        island.add(jeroo, 1, 1);
        island.add(copier, 10, 1);
        jeroo.hopToWater();
        assertEquals(8, jeroo.getGridX());
        assertTrue(jeroo.seesWater(AHEAD));
    }
    /**
     * check copier hop
     */
    public void testHop() {
        DualIsland island = new DualIsland();
        Jeroo copier = new Jeroo();
        CopyingJeroo jeroo = new CopyingJeroo(copier);
        island.add(jeroo, 1, 1);
        island.add(copier, 10, 1);
        jeroo.hop();
        assertEquals(11, copier.getGridX());
    }
    /**
     * check copier turn
     */
    public void testTurnLeft() {
        DualIsland island = new DualIsland();
        Jeroo copier = new Jeroo();
        CopyingJeroo jeroo = new CopyingJeroo(copier);
        island.add(jeroo, 1, 1);
        island.add(copier, 10, 1);
        jeroo.turn(LEFT);
        assertEquals(true, copier.isFacing(NORTH));
    }
     /**
     * check copier turn
     */
    public void testTurnRight() {
        DualIsland island = new DualIsland();
        Jeroo copier = new Jeroo();
        CopyingJeroo jeroo = new CopyingJeroo(copier);
        island.add(jeroo, 1, 1);
        island.add(copier, 10, 1);
        jeroo.turn(RIGHT);
        assertEquals(true, copier.isFacing(SOUTH));
    }
    /**
     * test program
     */
    public void testmyProgram() {
        DualIsland island = new DualIsland();
        Jeroo copier = new Jeroo(1000);
        CopyingJeroo jeroo = new CopyingJeroo(copier);
        island.add(jeroo, 1, 1);
        island.add(copier, 10, 1);
        jeroo.myProgram();
        assertEquals(8, copier.getGridY());
    }
    /**
     * test program
     */
    public void testmyProgramCorner() {
        DualIsland island = new DualIsland();
        island.add(new Flower(), 8 , 1);
        island.add(new Flower(), 8 , 2);
        island.add(new Flower(), 1 , 2);
        island.add(new Flower(), 1 , 3);
        island.add(new Flower(), 8 , 3);
        island.add(new Flower(), 1 , 4);
        island.add(new Flower(), 8 , 4);
        island.add(new Flower(), 1 , 5);
        island.add(new Flower(), 8 , 5);
        island.add(new Flower(), 1 , 6);
        island.add(new Flower(), 8 , 6);
        island.add(new Flower(), 1 , 7);
        island.add(new Flower(), 8 , 7);
        island.add(new Flower(), 8 , 8);
        island.add(new Flower(), 1 , 8);
        Jeroo copier = new Jeroo(1000);
        CopyingJeroo jeroo = new CopyingJeroo(copier);
        island.add(jeroo, 1, 1);
        island.add(copier, 10, 1);
        jeroo.myProgram();
        assertEquals(8, copier.getGridY());
    }
}
