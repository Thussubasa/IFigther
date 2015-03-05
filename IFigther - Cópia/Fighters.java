import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

public class Fighters extends Actor
{
    private static final double WALKING_SPEED = 5.0;
    public Henrique Player1;
    public Negao Player2;
  
    public int Player2HP = 321;
    public boolean isTouching = false;
    
    protected LifePlayer1 hud_hp;
    protected int hp = 100; // Ship hit points
    protected int hp_max = 100; // Max hit points
    protected static Henrique p1;
    
    public Fighters()
    {
    }

    public void act()
    {
        
     
    }
   
    public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    
    public void move()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * WALKING_SPEED);
        int y = (int) Math.round(getY() + Math.sin(angle) * WALKING_SPEED);
        
        setLocation(x, y);
    }
    
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
    public boolean touching(Class clss)
    {
        Actor actor = getOneObjectAtOffset(-18, 0, clss);
        return actor != null;        
    }
    
    
    }

   

