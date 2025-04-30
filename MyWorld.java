import greenfoot.*;

/**
 * The World our hero lives in.
 * 
 * @author Gauri
 * @version April 2025
 */

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        // Create a label
        Label scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50); 
        createApple();
    }
    
    /**
     * Create a new apple at random location at top of screen
     */
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
