import sofia.micro.*;
import static sofia.micro.jeroo.CompassDirection.*;
import static sofia.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
/**
 *  Tests for the Food class.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.07.28
 */
public class FoodTest extends TestCase
{
    //~ Fields ................................................................
    private PizzaHut pp;
    private Food ff;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new FoodTest test object.
     */
    public FoodTest()
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
        pp = new PizzaHut();
        ff = new Food();
    }


    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Test at mid
     * should do random walk
     */
    public void testMid() {
        pp.add(ff, pp.getWidth() / 2, pp.getHeight() / 2);
        for ( int i = 0; i < 1000; i++) {
            ff.act();
        }
        assertEquals(1, pp.getObjects(Food.class).size());
    }
    /**
     * Test at Corner
     * should not do random walk
     * test at top left
     */
    public void testCorner1() {
        pp.add(ff, 0, 0);
        for ( int i = 0; i < 1000; i++) {
            ff.act();
        }
        assertEquals(1, pp.getObjects(Food.class).size());
    }
    /**
     * test at bottom left
     */
    public void testCorner2() {
        pp.add(ff, 0, pp.getHeight() - 1);
        for ( int i = 0; i < 1000; i++) {
            ff.act();
        }
        assertEquals(1, pp.getObjects(Food.class).size());
    }
    /**
     * test at bottom right
     */
    public void testCorner3() {
        pp.add(ff, pp.getWidth() - 1, pp.getHeight() - 1);
        for ( int i = 0; i < 1000; i++) {
            ff.act();
        }
        assertEquals(1, pp.getObjects(Food.class).size());
    }
    /**
     * test at top right
     */
    public void testCorner4() {
        pp.add(ff, pp.getWidth() - 1, 0);
        for ( int i = 0; i < 1000; i++) {
            ff.act();
        }
        assertEquals(1, pp.getObjects(Food.class).size());
    }
    /**
     * 
     */
    public void testLeftside() {
        pp.add(ff, 0, 5);
        for ( int i = 0; i < 1000; i++) {
            ff.act();
        }
        assertEquals(1, pp.getObjects(Food.class).size());
    }
}
