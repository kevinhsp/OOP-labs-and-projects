import sofia.micro.*;
import static sofia.micro.jeroo.CompassDirection.*;
import static sofia.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
/**
 *  Tests for the Predator class.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.03
 */
public class PredatorTest extends TestCase
{
    //~ Fields ................................................................
    private PizzaHut pp;
    private Food ff;
    private Predator pr;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new PredatorTest test object.
     */
    public PredatorTest()
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
        pr = new Predator();

    }

   
    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * test at both(2,2)
     */
    public void test() {
        pp.add(ff, 2, 2);
        pp.add(pr, 2, 2);
        for ( int i = 0; i < 1000; i++) {
            pr.act();
            pr.act();
        }
        assertEquals(1, pp.getObjects(Food.class).size());
        assertEquals(1, pp.getObjects(Predator.class).size());
    }
}
