import sofia.micro.jeroo.*;

/**
 * Don't forget to write class comments
 */
public class BuddyIsland extends Island
{
    
    /**
     * And also comments before every method
     */
    public void myProgram() {
        JerooWithBuddy bobby = new JerooWithBuddy();
        this.add(bobby, 10, 5);
        LazyJeroo lazy = new LazyJeroo();
        this.add(lazy, 10, 6);
        bobby.hopWithBuddy(lazy);
    }
}
