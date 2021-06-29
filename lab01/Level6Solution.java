import sofia.micro.lightbot.*;

//-------------------------------------------------------------------------
/**
 *  Level 6, together with its solution using a single Light-Bot.
 *
 *  @author Supeng He(supeng)
 *  @version 2020.07.09
 */
public class Level6Solution extends Level6a
{
    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Turn on the light.
     */
    public void myProgram()
    {
        LightBot andy = new LightBot();
        this.add(andy, 2, 6);
        andy.turnLeft();
        andy.move();
        andy.jump();
        andy.jump();
        andy.turnRight();
        andy.jump();
        andy.jump();
        andy.turnLightOn();
        andy.jump();
        andy.turnRight();
        andy.move();
        andy.move();
        andy.move();
        andy.turnLightOn();
        andy.turnRight();
        andy.turnRight();
        andy.move();
        andy.move();
        andy.move();
        andy.move();
        andy.move();
        andy.move();
        andy.turnLightOn();
    }

}
