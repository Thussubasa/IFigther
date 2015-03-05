import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Round3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Round3 extends Actor
{
    /**
     * Act - do whatever the Round3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.getKey() == "space"){
            Global.pause = false;
            getWorld().removeObject(this);
        }
    }    
}
