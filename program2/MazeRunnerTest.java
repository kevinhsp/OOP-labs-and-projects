import sofia.micro.*;
import sofia.micro.jeroo.*;
import static sofia.micro.jeroo.CompassDirection.*;
import static sofia.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
/**
 *  Test my program clean all nets and flowers stop at (1,1)
 *  Summarize what your test objectives are.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.07.29
 */
public class MazeRunnerTest extends TestCase
{
    //~ Fields ................................................................
    /**
     * create new MazeRunner called kevin
     * create new MazeIsland called island
     */
    private MazeRunner kevin;
    private MazeIsland island;
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ProgramTest test object.
     */
    public MazeRunnerTest()
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
    /*# Insert your own test methods here */
    /**
     * this test is to check whether kevin 
     * will stop at (1, 1)
     * there is no flowers and nets
     * at map(7)
     */
    public void testProgram7() {
        island = new MazeIsland(7);
        kevin = new MazeRunner();
        island.add(kevin, island.getWidth() - 2, island.getHeight() - 2);
        kevin.myProgram();
        assertEquals(0, island.getObjects(Flower.class).size()); 
        assertEquals(0, island.getObjects(Net.class).size()); 
        assertEquals(1, kevin.getGridX()); 
        assertEquals(1, kevin.getGridY()); 
    }
     /**
     * this test is to check whether kevin 
     * will stop at (1, 1)
     * there is no flowers and nets
     * at map(17)
     */
    public void testProgram17() {
        island = new MazeIsland(17);
        kevin = new MazeRunner();
        island.add(kevin, island.getWidth() - 2, island.getHeight() - 2);
        kevin.myProgram();
        assertEquals(0, island.getObjects(Flower.class).size()); 
        assertEquals(0, island.getObjects(Net.class).size()); 
        assertEquals(1, kevin.getGridX()); 
        assertEquals(1, kevin.getGridY()); 
    }
    /**
     * this test is to check whether kevin 
     * can hop when there is not net
     */
        /**
     * this test is to check whether kevin 
     * will stop at (1, 1)
     * there is no flowers and nets
     * at map(20)
     */
    public void testProgram20() {
        island = new MazeIsland(20);
        kevin = new MazeRunner();
        island.add(kevin, island.getWidth() - 2, island.getHeight() - 2);
        kevin.myProgram();
        assertEquals(0, island.getObjects(Flower.class).size()); 
        assertEquals(0, island.getObjects(Net.class).size()); 
        assertEquals(1, kevin.getGridX()); 
        assertEquals(1, kevin.getGridY()); 
    }
     /**
     * this test is to check whether kevin 
     * can hop  when facing net
     */  
    public void testCleanNet1() {
        island = new MazeIsland(17);
        kevin = new MazeRunner();
        island.add(kevin, 1, 3);  // a location with no net ahead
        kevin.cleanNet();
        assertEquals(2, kevin.getGridX()); 
        assertEquals(3, kevin.getGridY());
    }
    /**
     * this test is to check whether kevin 
     * can hop  when facing net
     */    
    public void testCleanNet2() {
        island = new MazeIsland(17);
        kevin = new MazeRunner();
        island.add(kevin, 6, 3);  //a location with one net ahead
        kevin.cleanNet();
        assertEquals(7, kevin.getGridX()); 
        assertEquals(3, kevin.getGridY()); 
        
    }
}
