import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pause extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && Global.play){
            Global.pause = true;
            Global.play = false;
            setImage("Play.png");
        }     
        else
         if(Greenfoot.mouseClicked(this) && Global.pause){
             Global.pause = false;
             Global.play = true;
             setImage("Pause.png");
        }   
    }    
}
