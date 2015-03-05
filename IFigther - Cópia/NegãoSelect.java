import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Neg‹oSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Neg‹oSelect extends Actor
{
    /**
     * Act - do whatever the Neg‹oSelect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MouseInfo mouse = Greenfoot.getMouseInfo();  
    
    public void act() 
    {
        if(Greenfoot.getMouseInfo().getX() > 400){
            setImage("Neg‹oSelected.png");
        }
        else
            setImage("Neg‹oNonSelected.png");
    }    
}
