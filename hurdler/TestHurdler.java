import sofia.micro.*;
import sofia.micro.jeroo.*;
import static sofia.micro.jeroo.CompassDirection.*;
import static sofia.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
/**
 *  Good Good
 *  jeroo kevin ability of hurdle island.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.07.20
 */
public class TestHurdler extends TestCase
{
    //~ Fields ................................................................
    private HurdleIsland island;
    private Hurdler kevin;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new TestHurdler test object.
     */
    public TestHurdler()
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
        island = new HurdleIsland();
        kevin = new Hurdler();
        
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Let kevin at location (4, 10), test whether it can arrive at (7, 10)
     */
    public void testMyProgram1() {
        island.add (kevin, 4, 10);  // set location
        
        kevin.myProgram();    
        
        assertEquals(7, kevin.getGridX());
        assertEquals(10, kevin.getGridY());  //success
       
    }
    
}
