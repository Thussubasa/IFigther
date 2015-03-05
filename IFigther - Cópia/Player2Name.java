import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Player2Name here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2Name extends Negao
{
    private Font font = new Font ("Pudmonkey", Font.PLAIN, 18);
    private Color color = Color.WHITE;
    GreenfootImage image = new GreenfootImage (100,60); 

    public void setText (String msg) {
        GreenfootImage image = getImage ();
        image.clear ();
        image.setFont (font);
        image.setColor(color);
        int x= 5;
        int y = image.getHeight () /2;
        image.drawString ("Neg‹o", x, y);
    }

    public void act() 
    {
        setText("Neg‹o");
        setImage(image);
        
        
    }    
}
