import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Round1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Round1 extends Actor
{
    /**
     * Act - do whatever the Round1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Global.pause = true;
        if(Greenfoot.isKeyDown("space")){
            Global.play = true;
        }
        
            
        if(Global.play){
            Global.pause = false;
        }

        if(Global.pause){
            Global.play = false;
        }
    }    
}
