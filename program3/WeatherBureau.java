import java.util.*;

//-------------------------------------------------------------------------
/**
 *  Cool
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.13
 */
public class WeatherBureau 
{
    //~ Fields ................................................................
    private HashMap<String, WeatherStation> bureau;
    private WeatherStation currentStation;
    // instance fields--replace the example below with your ow
    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new WeatherBureau object.
     */
    public WeatherBureau()
    {
        bureau = new HashMap<String, WeatherStation>();
    }

    //~ Methods ...............................................................
    // ----------------------------------------------------------
    /**
     * @param text is a text input
     * record a string text into Map
     */
    public void recordDailySummary(String text)
    {
        Scanner fromString = new Scanner(text);
        String newId = fromString.next();  // scan to the id and store
        fromString.next();
        fromString.next();
        fromString.next();
        String date = fromString.next();   // scan to the date 
        String [] dateParts = date.split("/");
        int month = Integer.parseInt(dateParts[0]); // get the month, and store
        double rainFall = Double.parseDouble(fromString.next());  
        // get the rainFall, and store it
        fromString.close();
        // if bureau contains this weather station
        // let weather station record it. 
        if (rainFall != -1) {
            if (bureau.containsKey(newId)) {   
                currentStation = bureau.get(newId);
                currentStation.recordDailyRain(month, rainFall);
            }
            else {
                // create a new weather station and record it
                WeatherStation ww = new WeatherStation(newId);
                ww.recordDailyRain(month, rainFall);
                bureau.put(newId, ww);
            }
        }
    }

    /**
     * @param input is a scanner input
     * record a scanner input into Map
     */
    public void recordDailySummaries(Scanner input) {
        while (input.hasNextLine()) {
            recordDailySummary(input.nextLine());
        }
    }

    /**
     * @param identifier the id of station
     * @return the weatherStation with identifier
     */
    public WeatherStation getStation(String identifier) {
        WeatherStation ws = bureau.get(identifier);
        return ws;
    }

    /**
     * @param month is the month we want to put in
     * @return the lowestStation for input month.
     * Create a list including all the weather station
     * assume the first one the lowest
     * and compare one by one
     */
    public WeatherStation lowestStation(int month) {
        if (bureau.isEmpty()) {
            return null;
        }
        else {
            // try to create a list of all weather Stations 
            //then getAvgForMonth(month) of weather Stations 
            List<WeatherStation> lowestRainfall = new 
                ArrayList<WeatherStation>(bureau.values());
            WeatherStation low = null;
            double lowest = 99999;
            for ( int i = 0; i < lowestRainfall.size(); i++) {
                if ((lowestRainfall.get(i).getAvgForMonth(month) < lowest) && 
                    ((lowestRainfall.get(i).getAvgForMonth(month) != -1))) {
                    low = lowestRainfall.get(i);
                    lowest = lowestRainfall.get(i).getAvgForMonth(month);
                }
            }
            return low;
        }
    }

    /**
     * @return the lowestStation for all month.
     * Create a list including all the weather station
     * assume the first one the lowest
     * and compare one by one
     * using getAvgForMonth(getLowestMonth)
     * just choose the month with lowest
     */
    public WeatherStation lowestStation() {
        WeatherStation ww = null;
        double lowest = 9999;
        for (int i = 1; i <= 12; i++) {
            WeatherStation ss = lowestStation(i);
            if ((ss != null) && (ss.getAvgForMonth(i) < lowest)) {
                lowest = ss.getAvgForMonth(i);
                ww = ss;
            }
        }
        return ww;
    }    
}