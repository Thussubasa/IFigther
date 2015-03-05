import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Time here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Time extends HUD
{

    
    private Font font = new Font ("Pudmonkey", Font.PLAIN, 30);
    private Color color = Color.WHITE;
    GreenfootImage image = new GreenfootImage (50,60); 
    public int timeSeconds;
    
    private long timeStarted = System.currentTimeMillis();  
  
    public void act(){ 
        if(!Global.pause){
            Global.timer++;
        }
        timeSeconds = 99 - (Global.timer/60);
        setText("" + timeSeconds);
        setImage(image); 
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
    
    public void timer(){
        
    }
    
    
}
