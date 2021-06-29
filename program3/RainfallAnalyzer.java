import sofia.micro.*;
import student.IOHelper;
import java.util.*;
import sofia.graphics.*;  // To access TextShape and Color classes

//-------------------------------------------------------------------------
/**
 *  Leant a lot.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.13
 */
public class RainfallAnalyzer extends World
{
    //~ Fields ................................................................
    private WeatherBureau wb;
    private WeatherStation ws;
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new RainAnalyzer that takes in a Scanner Input
     * setting size as ( 8, 5, 72)
     * 
     * @param input is a scanner
     */
    public RainfallAnalyzer(Scanner input) {
        super(8, 5, 72);
        wb = new WeatherBureau();
        wb.recordDailySummaries(input);
    }

    /**
     * Creates a new RainfallAnalyzer object.
     */
    public RainfallAnalyzer()
    {
        this(IOHelper.createScannerForURL(
                "http://courses.cs.vt.edu/~cs1114/Kenya-2014-2016.txt"));
        ws = wb.lowestStation();
        TextShape text =  this.getText();
        text.setColor(Color.black);
        text.setTypeSize(40);
        this.add(text, 3, 2);
    }

    /**
     * @return the weatherBureau
     */
    //~ Methods ...............................................................
    public WeatherBureau getBureau() {
        return wb;
    }

    /**
     * @return a texshape 
     * which represent the lowestStation
     * lowestMonth and lowestRainFall with 2 decimals
     */
    public TextShape getText() {
        String lowestStation = ws.getId();
        int lowestMonth = ws.getLowestMonth();
        double lowestRainFall = ws.getAvgForMonth(ws.getLowestMonth());
        TextShape ts = new TextShape(lowestStation + ": " +
                lowestMonth + ": " + String.format("%.2f", lowestRainFall));
        return ts;

    }

    /**
     * @return the weatherstation
     */
    public WeatherStation getStation() {
        return ws;
    }
}
