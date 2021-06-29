import sofia.micro.*;

// -------------------------------------------------------------------------
/**
 *  Tests for the Shark class.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.07
 */
public class SharkTest extends TestCase
{
    //~ Fields ................................................................

    private Ocean ocean;
    private Shark shark;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SharkTest test object.
     */
    public SharkTest()
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
        ocean = new Ocean();
        shark = new Shark();
    }


    // ----------------------------------------------------------
    /**
     * Test the second constructor for Ocean, that adds minnows
     * and sharks.
     */
    public void testOceanConstructor()
    {
        ocean = new Ocean(7, 3);
        
        // Make sure 7 minnows were created
        assertEquals(7, ocean.getObjects(Minnow.class).size());

        // Make sure 3 sharks were created
        assertEquals(3, ocean.getObjects(Shark.class).size());
    }


    // ----------------------------------------------------------
    /**
     * Test distanceOf() for a straight horizontal distance.
     */
    public void testDistance1()
    {
        Minnow minnow = new Minnow();
        ocean.add(minnow, 50, 100);
        ocean.add(shark, 50, 50);

        // When comparing floating point numbers, ALWAYS provide
        // a third arg saying how close they are expected to be,
        // since floating point math isn't exact.
        assertEquals(50.0, shark.distanceTo(minnow), 0.1);
    }


    // ----------------------------------------------------------
    /**
     * Test distanceOf() for a diagonal distance.
     */
    public void testDistance2()
    {
        Minnow minnow = new Minnow();
        ocean.add(minnow, 100, 100);
        ocean.add(shark, 50, 50);

        // When comparing floating point numbers, ALWAYS provide
        // a third arg saying how close they are expected to be,
        // since floating point math isn't exact.
        assertEquals(70.7, shark.distanceTo(minnow), 0.1);
    }
    /**
     * test there are 3 minnows and 1 shark,
     * check after act twice the stomach should have 2.
     */
    public void testHH() {
        Minnow minnow = new Minnow();
        ocean.add(minnow, 2, 2);
        Minnow minnow1 = new Minnow();
        ocean.add(minnow1, 50, 52);
        Minnow minnow2 = new Minnow();
        ocean.add(minnow2, 100, 52);
        ocean.add(shark, 1, 2);
        shark.act();
        shark.act();
        assertEquals(2, shark.getStomachContents().size());
    }
    /**
     * test no minow,
     * stomach should have 0
     */
    public void testH() {
        ocean.add(shark, 1, 2);
        shark.act();
        assertEquals(0, shark.getStomachContents().size());
    }
}
