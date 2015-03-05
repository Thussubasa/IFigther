import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class Player1Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends Actor
{
    /**
     * Act - do whatever the Player1Win wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Font font = new Font ("Pudmonkey", Font.PLAIN, 25);
  
    public void act(){
        GreenfootImage img = new GreenfootImage (200,100);
        img.setColor (Color.WHITE);
        img.setFont(font);
        if(Global.player1Wins){
            img.drawString("Henrique Wins",3,15);
        }
        if(Global.player2Wins){
            img.drawString("Neg‹o Wins",3,15);
        }
        setImage(img);
    } 
}
