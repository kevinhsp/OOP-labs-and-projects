import sofia.micro.jeroo.*;

/**
 * Remember to write comments before the class
 */
public class JerooWithBuddy extends Jeroo
{
    
    /**
     * And comment before each method/constructor
     */
    public JerooWithBuddy()
    {
        super();
    }
    
    /**
     * Remember to write proper comments
    */
    public void hopToWater()
    {
        while (!this.seesWater(AHEAD))
        {
            this.hop();
        }
    }
    public void hopWithBuddy(Jeroo buddy) {
        while(!this.isFacing(WEST)) {
            this.turn(LEFT);
            buddy.turn(LEFT);
        }
        
        while(!this.seesWater(AHEAD)) {
            this.hop();
            buddy.hop();
        }
    }
    
}
