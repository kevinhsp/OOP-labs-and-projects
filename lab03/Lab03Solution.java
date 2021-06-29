import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Totally fine
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Supeng He(supeng)
 *  @version 2020.07.18
 */
public class Lab03Solution extends NetIsland
{
    //~ Fields ................................................................

    

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Lab03Solution object.
     */
    public Lab03Solution()
    {
        // Nothing to initialize, leaving the world a default size
        NetRemover cc = new NetRemover(3 , 1);  //new code
        this.add(cc);   //set cc
        cc.turn(RIGHT); // face south
        //new code
        
    }

    //~ Methods ...............................................................


}
