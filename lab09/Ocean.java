import sofia.micro.*;
import sofia.graphics.*;
import sofia.util.Random;
//-------------------------------------------------------------------------
/**
 *  An ocean world for sharks and minnows to swim around in.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.07
 */
public class Ocean extends World
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new, empty Ocean object.
     */
    public Ocean()
    {
        super(400, 400, 1);
        setBackgroundColor(Color.blue);
    }


    // ----------------------------------------------------------
    /**
     * Creates a new Ocean object populated with sharks and minnows.
     * @param minnows The number of minnows to create.
     * @param sharks  The number of sharks to create.
     */
    public Ocean(int minnows, int sharks)
    {
        this();
        for (int i = 0; i < minnows; i++) {
            this.addMinnow();
        }
        for (int i = 0; i < sharks; i++) {
            this.addShark();
        }
    }


    //~ Methods ...............................................................
    /**
     * create new random Minnow
     */
    public void addMinnow() {
        int x = Random.generator().nextInt(this.getWidth());
        int y = Random.generator().nextInt(this.getHeight());
        Minnow mm = new Minnow();
        this.add( mm, x, y);
    }
    /**
     * create new random shark
     */
    public void addShark() {
        int x = Random.generator().nextInt(this.getWidth());
        int y = Random.generator().nextInt(this.getHeight());
        Shark mm = new Shark();
        this.add( mm, x, y);
    }
}
