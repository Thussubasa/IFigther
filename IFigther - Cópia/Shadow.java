import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shadow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shadow extends Fighters
{
    /**
     * Act - do whatever the Shadow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.isKeyDown("d") && !Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("m") && !Greenfoot.isKeyDown("j") && !Greenfoot.isKeyDown("k")&& !Global.player2Defense){
            moveRight();               
        }
       if (Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("m") && !Greenfoot.isKeyDown("j") && !Greenfoot.isKeyDown("k")&& !Global.player2Defense){
            moveLeft();               
        }
    }  
    public void moveRight(){    
        turn(-360);
        move();
        turn(360);
               
    }
    public void moveLeft(){         
        if(!Global.Contact){ 
            turn(180);
            move(4);
            turn(-180);            
        }
    }
}
