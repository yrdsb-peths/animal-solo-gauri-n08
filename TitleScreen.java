import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Title Sceen.
 * 
 * @author (Gauri) 
 * @version (May 2025)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Set the background image
        setBackground(new GreenfootImage("background.png"));

        addObject(titleLabel, getWidth()/2, 100);
        prepare();
    }

    /*
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar 
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);

        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,getWidth()/2,getHeight()/2);
        Label arrowLabel = new Label("Use \u2190 and \u2192 to Move", 30);
        addObject(arrowLabel,getWidth()/2,getHeight()/2 + 90);
        Label spaceLabel = new Label("Press <space> to Start", 30);
        addObject(spaceLabel,getWidth()/2,getHeight()/2 + 130);
    }
}
