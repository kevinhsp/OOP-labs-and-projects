import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  A jeroo that traverses all locations on an island, and uses
 *  a buddy to make a copy of any pattern of flowers it finds.
 *
 *  @author Supeng He (supeng)
 *  @version 2020.08.06
 */
public class CopyingJeroo extends Jeroo
{
    //~ Fields ................................................................
    private Jeroo copier;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new CopyingJeroo object.
     * @param cc is the copier we create
     */
    public CopyingJeroo(Jeroo cc)
    {
        super();
        copier = cc;
    }

    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Creates a new CopyingJeroo object.
     */
    public void myProgram()
    {
        for ( int i = 0; i < 3; i++) {
            while (!this.seesWater(AHEAD)) {
                if (this.seesFlower(HERE)) {
                    copier.plant();
                    this.hop();
                }
                else {
                    this.hop();
                }
            }
            this.turn(RIGHT);
            if (this.seesFlower(HERE)) {
                copier.plant();
                this.hop();
            }
            else {
                this.hop();
            }
            this.turn(RIGHT);
            while (!this.seesWater(AHEAD)) {
                if (this.seesFlower(HERE)) {
                    copier.plant();
                    this.hop();
                }
                else {
                    this.hop();
                }
            }
            this.turn(LEFT);
            if (this.seesFlower(HERE)) {
                copier.plant();
                this.hop();
            }
            else {
                this.hop();
            }
            this.turn(LEFT);
        }
        while (!this.seesWater(AHEAD)) {
            if (this.seesFlower(HERE)) {
                copier.plant();
                this.hop();
            }
            else {
                this.hop();
            }
        }
        this.turn(RIGHT);
        if (this.seesFlower(HERE)) {
            copier.plant();
            this.hop();
        }
        else {
            this.hop();
        }
        this.turn(RIGHT);
        while (!this.seesWater(AHEAD)) {
            if (this.seesFlower(HERE)) {
                copier.plant();
                this.hop();
            }
            else {
                this.hop();
            }
        }
        if (this.seesFlower(HERE)) {
            copier.plant();
        }
    }

    // ----------------------------------------------------------
    /**
     * Hop forward until we reach the water.
     */
    public void hopToWater()
    {
        while (!this.seesWater(AHEAD))
        {
            this.hop();
        }
    }

    /**
     * override hop
     */
    public void hop() {
        super.hop();
        copier.hop();
    }

    /**
     * override turn
     * @param direction is the direction of left or right
     */
    public void turn(RelativeDirection direction) {
        if (direction == LEFT) {
            super.turn(LEFT);
            copier.turn(LEFT);
        }
        if (direction == RIGHT) {
            super.turn(RIGHT);
            copier.turn(RIGHT);
        }
    }
}
