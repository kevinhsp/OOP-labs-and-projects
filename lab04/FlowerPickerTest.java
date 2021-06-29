// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Supeng He (supeng)

import sofia.micro.*;
import sofia.micro.jeroo.*;
import static sofia.micro.jeroo.CompassDirection.*;
import static sofia.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
/**
 *  Gooodd
 *  Summarize what your test objectives are
 *  Test picking up two line flowers
 *
 *  @author Supeng He (supeng)
 *  @version 2020.07.20
 */
public class FlowerPickerTest extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new FlowerPickerTest test object.
     */
    public FlowerPickerTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Test the pickLine() method on flower patch A's northwest corner.
     */
    public void testPickLine()
    {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.add(picker, 2, 2);
        // 2. Call the method(s) you are testing
        picker.pickLine();   
        // 3. Make assertions capturing your expected outcomes
        assertEquals(6, picker.getGridX());
        assertEquals(2, picker.getGridY());
        assertTrue(picker.isFacing(EAST));
    }
    // -------------------------
    /**
     * Test the turnAroundRight() method on flower patch A's northwest corner.
     */
    public void testTurnAroundRight() {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.add(picker, 6, 2);
        // 2. Call the method(s) you are testing
        picker.turnAroundRight();
        // 3. Make assertions capturing your expected outcomes
        assertEquals(6, picker.getGridX());
        assertEquals(3, picker.getGridY());
        assertTrue(picker.isFacing(WEST));
    }
    // ------------------------
    /**
     * Test the testpick2Lines() method on flower patch A's northwest corner.
     */
    public void testpick2Lines() {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.add(picker, 2, 2);
        // 2. Call the method(s) you are testing
        picker.pick2Lines();
        // 3. Make assertions capturing your expected outcomes
        assertEquals(2, picker.getGridX());
        assertEquals(3, picker.getGridY());
        assertTrue(picker.isFacing(WEST));
        
    }
}
