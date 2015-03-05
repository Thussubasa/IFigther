import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; 
/**
 * Write a description of class LifePlayer2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifePlayer1 extends Henrique
{ 
    public GreenfootImage LifeBar = new GreenfootImage("LifeBar.png"); 
    
    public void act() 
    {  
        getImage().scale(Global.Player1HP,20);
        setImage(LifeBar);  
        setLocation(190-((321 - Global.Player1HP)/2), 45); 
        
        if(Global.Player1HP <21){
            Global.Player2Rounds ++;
            getWorld().removeObject(this);
        }
    }
}
 

