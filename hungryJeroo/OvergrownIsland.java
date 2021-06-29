import sofia.micro.jeroo.*;
import java.util.Random;

//-------------------------------------------------------------------------
/**
 *  For the class demonstration, we do not need to edit this class. 
 *  Howevever, you may edit/adapt it as you wish, and modify this class
 *  summary to fit the new version.
 */
public class OvergrownIsland extends Island
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new OvergrownIsland object.
     */
    public OvergrownIsland()
    {
        prepare();
    }


    //~ Methods ...............................................................
    
    private void prepare() {
        Random random = new Random();
        for (int i = 1; i < getWidth() - 1; i++) {
            for (int j = 1; j < getHeight() - 1; j++) {
                if (random.nextBoolean()) {
                    add(new Flower(), i, j);
                }
            }
        }
    }
    
    public void myProgram() {
        HungryJeroo jeroo = new HungryJeroo();
        add(jeroo, 1, 1);
        jeroo.harvest();
    }

}
