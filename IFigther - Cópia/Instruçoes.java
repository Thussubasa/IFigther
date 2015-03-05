import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruçoes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruçoes extends World
{

    /**
     * Constructor for objects of class Instruçoes.
     * 
     */
    public Instruçoes()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("escape")){
            Greenfoot.setWorld(new MainMenu()) ;
        }
    }
}
