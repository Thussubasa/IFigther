import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Player1Name here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1Name extends Henrique
{
   private Font font = new Font ("Pudmonkey", Font.PLAIN, 18);
    private Color color = Color.WHITE;
    GreenfootImage image = new GreenfootImage (200,60);    ;
    /**
     * Act - do whatever the TextMessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player1Name () {
        
    }

    public void setText (String msg) {
        GreenfootImage image = getImage ();
        image.clear ();
        image.setFont (font);
        image.setColor(color);
        int x= 5;
        int y = image.getHeight () /2;
        image.drawString ("Henrique", x, y);
    }

    public void act() 
    {
        setText("Henrique");
        setImage(image);
        
        
    }    
}
