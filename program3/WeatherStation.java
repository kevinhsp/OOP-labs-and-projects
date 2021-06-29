import java.util.*;

//-------------------------------------------------------------------------
/**
 *  Cool
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.10
 */
public class WeatherStation 
{
    //~ Fields ................................................................
    private double[] rainMonth;  // array to hold 12 monthly
    //sum of precipitation numbers for all the days
    private String identifier; // Station ID
    private int[] rainRecord;  // number of rainy days for 12 months

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * @param x is a string of station id
     * Creates a new WeatherStation object.
     * for rainMonth and rainRecord [0] = Jan, [11] = Dec
     */
    public WeatherStation(String x)
    {
        identifier = x;
        rainMonth = new double[12];
        rainRecord = new int[12];
        for (int i = 0; i < rainMonth.length; i++) {
            rainMonth[i] = 0;
            rainRecord[i] = 0;
        }
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     *
     * @return Returns the weather station ID for this weather station..
     */
    public String getId()
    {
        return identifier;
    }

    /**
     * @param month is the month with rainfall
     * @param rainfall is the precipitation
     * add rainfall to the month
     */
    public void recordDailyRain(int month, double rainfall) {
        rainMonth[month - 1] = rainMonth[month - 1] + rainfall;
        rainRecord[month - 1] = rainRecord[month - 1] + 1;
    }

    /**
     * @param month is the month of station want to get 
     * @return the number of daily rainfall values 
     * that have been recorded for the specified month
     * 0 = no record
     */
    public int getCountForMonth(int month) {
        return rainRecord[month - 1];
    }

    /**
     * @param month is the month of station want to get 
     * @return Returns the average daily rainfall 
     * for the specified month.
     */
    public double getAvgForMonth(int month) {
        if (rainMonth[month - 1] != 0) {
            return rainMonth[month - 1] / rainRecord[month - 1];
        }
        else {
            return -1;
        }
    }

    /**
     * @return Returns the month has the lowest average rainfall
     */
    public int getLowestMonth() {
        double lowestAvg = 99999; // set a lowestAvg as very high number
        int lowestMonth = 1; // assume lowestMonth is Jan. 
        for (int i = 1; i <= 12; i++) {
            if ((getAvgForMonth(i) < lowestAvg) && (getAvgForMonth(i) != -1)) {
                lowestAvg = getAvgForMonth(i);
                lowestMonth = i; 
            }
        }
        return lowestMonth;
    }
}
