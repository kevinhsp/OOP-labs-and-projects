// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Supeng He(supeng)
import sofia.micro.*;
import sofia.micro.jeroo.*;
import static sofia.micro.jeroo.CompassDirection.*;
import static sofia.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
/**
 *  Hope Good
 *  Test SquarePlanter
 *
 *  @author Supeng He(supeng)
 *  @version 2020.07.25
 */
public class SquarePlanterTest extends TestCase
{
    //~ Fields ................................................................
    private Island island;
    private SquarePlanter jeroo;
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new TestSquarePlanter test object.
     */
    public SquarePlanterTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * let jeroo start with (1,1)
     * with 5 * 4 flowers
     */
    public void setUp()
    {
        /*# Insert your own setup code here */
        
        
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * test for 5 per side, should
     * have 20 flowers with a 6*6 square
     */
    
    public void testMyProgram1() {
        
        jeroo.plantSquare();
        assertEquals(20, island.getObjects(Flower.class).size());       
        // there should have 20 flowers 
    }
    /**
     * test for 4 per side, should
     * have 16 flowers with a 5*5 square
     */
    public void testMyProgram2() {
        jeroo.remove();
        jeroo = new SquarePlanter(4);
        island.add(jeroo, 1, 6);
        jeroo.myProgram();
        // there should have 16 flowers
        
        assertEquals(16, island.getObjects(Flower.class).size());      
    } 
}
