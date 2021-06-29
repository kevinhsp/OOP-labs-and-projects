import sofia.micro.*;
import java.util.List;

//-------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.13
 */
public class ListWorld extends World
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new ListWorld object.
     */
    public ListWorld()
    {
        // Nothing to initialize, leaving the world a default size
    }


    //~ Methods ...............................................................

    /**
     * Determines the sum of all real numbers between 1 and
     * n, inclusively.
     * @param n The last digit to include in the sum
     * @return The sum of all numbers between 1 and n
     */
    public int sumOneToN(int n) 
    {
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
    /**
     * Finds the first occurrence of the provided match in 
     * the list of items.
     * @param items The list of all items to consider
     * @param match The string to match
     * @return A matching item, if a match is found. Otherwise, null.
     */
    public String findFirstOccurrence(List<String> items, String match) 
    {   
        String aa = null;
        for (String i:items) {
            if (i.contains(match)) {
                aa = i;
                break;
            }
        }
        return aa;
    }
    
    /**
     * Finds the last occurrence of the provided match in 
     * the list of items.
     * @param items The list of all items to consider
     * @param match The string to match
     * @return A matching item, if a match is found. Otherwise, null.
     */    
    public String findLastOccurrence(List<String> items, String match) 
    {
        String aa = null;
        for (String i:items) {
            if (i.contains(match)) {
                aa = i;
            }
        }
        return aa;
    }
    
    /**
     * Finds the largest number in the provided list of positive numbers
     * @param numbers A list of positive numbers
     * @return The largest number in the list
     */
    public Integer findLargest(List<Integer> numbers)
    {
        int largestNub = numbers.get(0);
        int largestIndex = 0;
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largestNub) {
                largestNub = numbers.get(i);
                largestIndex = i;
            }
        }
        return largestNub;
    }
    
    /**
     * Finds the average of the provided list of numbers.
     * @param numbers A list of numbers
     * @return An average of the provided numbers.
     */
    public Integer findAverage(List<Integer> numbers)
    {
        int count = numbers.size();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numbers.get(i);
        }
        return sum/count;
    }
}
