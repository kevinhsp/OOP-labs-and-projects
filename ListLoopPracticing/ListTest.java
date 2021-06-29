import sofia.micro.*;
import java.util.ArrayList;
import java.util.List;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your test class here.
 *  Summarize what your test objectives are.
 *
 *  @author Supeng He(supeng)
 *  @version 2020.08.13
 */
public class ListTest extends TestCase
{
    //~ Fields ................................................................
    private ListWorld listWorld;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ListTest test object.
     */
    public ListTest()
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
        listWorld = new ListWorld();
    }


    public void testSumOneToN() 
    {
        assertEquals(15, listWorld.sumOneToN(5));
        assertEquals(28, listWorld.sumOneToN(7));
    }
    
    public void testFindFirstOccurrence() 
    {
        List<String> names = new ArrayList<String>();
        names.add("Edward");
        names.add("Linda");
        names.add("Howard");
        names.add("Amanda");
        
        assertEquals("Edward", 
            listWorld.findFirstOccurrence(names, "rd"));
        assertEquals("Linda", 
            listWorld.findFirstOccurrence(names, "da"));
        assertNull(listWorld.findFirstOccurrence(names, "zz"));
    }
    
    public void testFindLastOccurrence() 
    {
        
        List<String> names = new ArrayList<String>();
        names.add("Edward");
        names.add("Linda");
        names.add("Howard");
        names.add("Amanda");
        
        assertEquals("Howard", 
            listWorld.findLastOccurrence(names, "rd"));
        assertEquals("Amanda", 
            listWorld.findLastOccurrence(names, "da"));
        assertNull(listWorld.findLastOccurrence(names, "zz"));
    }
    
    public void testFindLargest() 
    {
        
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(11);
        numbers.add(15);
        numbers.add(10);
        
        assertEquals(15, listWorld.findLargest(numbers).intValue());
        
        numbers.remove(2);
        assertEquals(12, listWorld.findLargest(numbers).intValue());

        
    }
    
    public void testFindAverage() 
    {
        // Write test cases here (+5 points)
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(11);
        numbers.add(15);
        numbers.add(10);
        numbers.add(12);
        assertEquals(12, listWorld.findAverage(numbers).intValue());
    }
}
