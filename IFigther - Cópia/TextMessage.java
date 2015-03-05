import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class TextMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextMessage extends Actor
{
    private Font font = new Font ("Pudmonkey", Font.PLAIN, 18);
    private Color color = Color.WHITE;
    
    /**
     * Act - do whatever the TextMessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TextMessage () {
        GreenfootImage image = new GreenfootImage (200,60);
        setImage (image);
    }

    public void setText (String msg) {
        GreenfootImage image = getImage ();
        image.clear ();
        image.setFont (font);
        image.setColor(color);
        int x= 5;
        int y = image.getHeight () /2;
        image.drawString (msg, x, y);
    }

    public void act() 
    {
        // Add your action code here.
    }    
}
