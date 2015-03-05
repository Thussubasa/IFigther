import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Write a description of class Desenha_Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacarPlayer1 extends Actor
{
    private Font font = new Font ("Pudmonkey", Font.PLAIN, 25);
    
    public void act() 
    {
        GreenfootImage img = new GreenfootImage (100,30);
        img.setColor (Color.WHITE);
        img.setFont(font);
        img.drawString(""+Global.Player1Rounds,3,15);
        setImage(img);
    }    
}
