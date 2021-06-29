import sofia.micro.*;
import sofia.graphics.*;

// -------------------------------------------------------------------------
/**
 *  Cool
 *  Summarize what your test objectives are.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.14
 */
public class RainfallAnalyzerTest extends TestCase
{
    //~ Fields ................................................................
    private WeatherBureau bureau; 
    private RainfallAnalyzer ra;
    private WeatherBureau bb;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new WeatherBureauTest test object.
     */
    public RainfallAnalyzerTest()
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
        bureau = new WeatherBureau();
        ra = new RainfallAnalyzer();
        bb = ra.getBureau();
    }

    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * this will test input scanner in it
     * test whether the lowest station id is true
     * and count of precipation in lowest stations month
     */
    public void testScannerinput()
    {
        setIn(
            "KE000063661 3.117 35.617 515 1/10/16 0.02 87 98 73\n" +
            "KE000063612 3.117 35.617 515 2/10/16 0.04 87 98 73\n" +
            "KE000063612 3.117 35.617 515 2/10/16 0.02 87 98 73\n" +
            "KE000063661 3.117 35.617 515 1/10/16 0.01 87 98 73\n" 
        );
        bb.recordDailySummaries(in());
        // place your assertions here
        assertEquals("KE000063723", bb.lowestStation().getId());
        assertEquals(1, bb.lowestStation().getCountForMonth(1));
    }

    /**
     * test whether the original input return 
     * true id and count of month
     */
    public void testlowest() {
        assertEquals("KE000063723", bb.lowestStation().getId());
        assertEquals(9, bb.lowestStation().getCountForMonth(12));
    }

    /**
     * Add a four line input to test the lowest is true or not
     */
    public void testLowestMonth()
    {
        setIn(
            "KE000063612 3.117 35.617 515 2/10/16 0.04 87 98 73\n" +
            "KE000063612 3.117 35.617 515 2/10/16 0.02 87 98 73\n" +
            "KE000063611 3.117 35.617 515 1/10/16 0.001 87 98 73\n" +
            "KE000063611 3.117 35.617 515 1/10/16 0.1 87 98 73\n"
        );
        bureau.recordDailySummaries(in());
        // place your assertions here
        assertEquals(2, bureau.lowestStation().getLowestMonth());
    }

    /**
     * test whether the RainfallAnalyzer get a true texttype
     */
    public void testSomething() {
        assertEquals("KE000063723: 9: 0.00", ra.getText().getText());
    }

    /**
     * test when Weatherbureau is empty, 
     * whether it will return null
     */
    public void testEmpty() {
        assertEquals(null, bureau.lowestStation(1));
    }

    /**
     * test add two strings whether is runs true
     */
    public void testRecordString() {
        bureau.recordDailySummary(
            "KE000063612 3.117 35.617 515 2/10/16 0.04 87 98 73");
        bureau.recordDailySummary(
            "KE000063612 3.117 35.617 515 2/10/16 0.05 87 98 73");
        assertEquals(2, bureau.getStation("KE000063612").getCountForMonth(2));
    }
}
