import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  An island with hurdles (lines of nets) that serve as obstacles
 *  for the jeroo.
 */
public class HurdleIsland extends Island
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new HurdleIsland object.
     * You have to create a new object and place that object in the island.
     */
    public HurdleIsland()
    {
        prepare();
    }

    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        sofia.micro.jeroo.Net net = new sofia.micro.jeroo.Net();
        this.add(net, 3, 10);
        sofia.micro.jeroo.Net net2 = new sofia.micro.jeroo.Net();
        this.add(net2, 3, 9);
        sofia.micro.jeroo.Net net3 = new sofia.micro.jeroo.Net();
        this.add(net3, 3, 8);
        sofia.micro.jeroo.Net net4 = new sofia.micro.jeroo.Net();
        this.add(net4, 3, 7);
        sofia.micro.jeroo.Net net5 = new sofia.micro.jeroo.Net();
        this.add(net5, 3, 6);
        sofia.micro.jeroo.Net net6 = new sofia.micro.jeroo.Net();
        this.add(net6, 3, 5);
        sofia.micro.jeroo.Net net7 = new sofia.micro.jeroo.Net();
        this.add(net7, 3, 4);
        sofia.micro.jeroo.Net net8 = new sofia.micro.jeroo.Net();
        this.add(net8, 6, 10);
        sofia.micro.jeroo.Net net9 = new sofia.micro.jeroo.Net();
        this.add(net9, 6, 9);
        sofia.micro.jeroo.Net net10 = new sofia.micro.jeroo.Net();
        this.add(net10, 8, 10);
        sofia.micro.jeroo.Net net11 = new sofia.micro.jeroo.Net();
        this.add(net11, 8, 9);
        sofia.micro.jeroo.Net net12 = new sofia.micro.jeroo.Net();
        this.add(net12, 8, 8);
        sofia.micro.jeroo.Net net13 = new sofia.micro.jeroo.Net();
        this.add(net13, 8, 7);
        sofia.micro.jeroo.Net net14 = new sofia.micro.jeroo.Net();
        this.add(net14, 8, 6);
        sofia.micro.jeroo.Net net15 = new sofia.micro.jeroo.Net();
        this.add(net15, 3, 3);
        sofia.micro.jeroo.Net net16 = new sofia.micro.jeroo.Net();
        this.add(net16, 3, 2);
        sofia.micro.jeroo.Net net17 = new sofia.micro.jeroo.Net();
        this.add(net17, 3, 1);
    }
}
