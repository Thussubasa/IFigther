import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class LifePlayer1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifePlayer2 extends Negao
{
    public GreenfootImage LifeBar = new GreenfootImage("LifeBar.png");    
    
    public void act() 
    {  
        getImage().scale(Global.Player2HP,20);
        setImage(LifeBar);      
        setLocation(608+((321 - Global.Player2HP)/2), 45); 
        
        if(Global.Player2HP <21){
            Global.Player1Rounds ++;
            getWorld().removeObject(this);
        }
    }
}
    



     
       


