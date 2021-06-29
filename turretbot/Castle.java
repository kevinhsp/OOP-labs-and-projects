import sofia.micro.lightbot.*;

//-------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author your name (your-pid)
 *  @version (place the date here, in this format: yyyy.mm.dd)
 */
public class Castle extends Level
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Castle object.
     */
    public Castle()
    {
        super(12, 8);
        prepare();
    }

    //~ Methods ...............................................................

    /**
     * Prepares the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        sofia.micro.lightbot.Block block = new sofia.micro.lightbot.Block();
        this.add(block, 1, 2);
        sofia.micro.lightbot.Block block2 = new sofia.micro.lightbot.Block();
        this.add(block2, 2, 2);
        sofia.micro.lightbot.Block block3 = new sofia.micro.lightbot.Block();
        this.add(block3, 3, 2);
        sofia.micro.lightbot.Block block4 = new sofia.micro.lightbot.Block();
        this.add(block4, 3, 3);
        sofia.micro.lightbot.Block block5 = new sofia.micro.lightbot.Block();
        this.add(block5, 3, 4);
        sofia.micro.lightbot.Block block6 = new sofia.micro.lightbot.Block();
        this.add(block6, 2, 4);
        sofia.micro.lightbot.Block block7 = new sofia.micro.lightbot.Block();
        this.add(block7, 2, 4);
        sofia.micro.lightbot.Block block8 = new sofia.micro.lightbot.Block();
        this.add(block8, 1, 4);
        sofia.micro.lightbot.Block block9 = new sofia.micro.lightbot.Block();
        this.add(block9, 1, 3);
        block7.remove();
        sofia.micro.lightbot.Block block10 = new sofia.micro.lightbot.Block();
        this.add(block10, 6, 1);
        sofia.micro.lightbot.Block block11 = new sofia.micro.lightbot.Block();
        this.add(block11, 7, 2);
        sofia.micro.lightbot.Block block12 = new sofia.micro.lightbot.Block();
        this.add(block12, 8, 2);
        sofia.micro.lightbot.Block block13 = new sofia.micro.lightbot.Block();
        this.add(block13, 9, 2);
        sofia.micro.lightbot.Block block14 = new sofia.micro.lightbot.Block();
        this.add(block14, 10, 1);
        sofia.micro.lightbot.Block block15 = new sofia.micro.lightbot.Block();
        this.add(block15, 9, 3);
        sofia.micro.lightbot.Block block16 = new sofia.micro.lightbot.Block();
        this.add(block16, 9, 4);
        sofia.micro.lightbot.Block block17 = new sofia.micro.lightbot.Block();
        this.add(block17, 10, 5);
        sofia.micro.lightbot.Block block18 = new sofia.micro.lightbot.Block();
        this.add(block18, 8, 4);
        sofia.micro.lightbot.Block block19 = new sofia.micro.lightbot.Block();
        this.add(block19, 7, 4);
        sofia.micro.lightbot.Block block20 = new sofia.micro.lightbot.Block();
        this.add(block20, 7, 3);
        sofia.micro.lightbot.Block block21 = new sofia.micro.lightbot.Block();
        this.add(block21, 6, 5);
    }
    
    /**
     * You are going to work with me to create two bots to patrol the two castles
     * In the method below, you will:
     *   1. Create 2 bots: 1 PatrolBot and 1 TurretBot
     *   2. Add those two bots in the grid position that you see on the slide 
     *   3. Ask each of the bots to patrol the castle
     */
    public void myProgram() {
        // Magic goes in here
    }
}
