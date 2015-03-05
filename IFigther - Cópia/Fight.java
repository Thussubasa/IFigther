import greenfoot.*;

/**
 * Class MyWorld: sample world to show how to make use of my world super-class SWorld
 */
public class Fight extends SWorld
{

    /**
     * Creates a scrolling world using a main actor, a background, some obstacles, and a non-scrolling score.
     */
    public Fight()
    {    
        super(800, 400, 1, 1000);
        setMainActor(new Henrique(), 110, 390);
        mainActor.setLocation(100, 250);
        GreenfootImage bg = new GreenfootImage("Scenery.png");
        setScrollingBackground(bg);
        populate();
        Greenfoot.setSpeed(45);
        
    }
    
    public void populate(){
         
         addObject(new LifePlayer1(),  139, 38);
    }
}
