import sofia.micro.*;
import sofia.micro.jeroo.*;
import static sofia.micro.jeroo.CompassDirection.*;
import static sofia.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
/**
 *  Good Good
 *  Test jeroo whether can be safe. 
 *
 *  @author Supeng He (Supeng)
 *  @version 2020.07.20
 */
public class TestAlive extends TestCase
{
    //~ Fields ................................................................
    private HurdleIsland island;
    private Hurdler kevin;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new TestAlive test object.
     */
    public TestAlive()
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

    /**
     * Test 1: 
     * If there is no net, test jeroo's safety.
     * Let kevin at location (4, 1), it should arrive (10, 1) safely.
     */
    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    public void testMyProgram1() {
        island.add (kevin, 4, 1);  // set location
        
        kevin.myProgram();    // 
        
        assertEquals(10, kevin.getGridX());
        assertEquals(1, kevin.getGridY());    //success
    }
    
    
    /** 
     * Test 2:
     * If the net's total length is 10
     * Can jeroo still be alive on the island
     * without getting stucked in water or trapped by net
     */
    
    public void testMyProgram2() {
        island.add (kevin, 1, 1);  // set location
        
        kevin.myProgram();    // Just run the program, check error
        
        // Fail
        
    }
}
