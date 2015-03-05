import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

 /**
  * Menu Principal
  * 
  * @author (Clayton Fidelis) 
  * @version (13 / 09 / 2013)
  */

public class MainMenu extends World
{
    public MainMenu() 
    {
        super(800, 400, 1);
        populate();
        Greenfoot.setSpeed(40);
    }
    
    public void populate(){
         addObject(new Iniciar(),  400, 220);
         addObject(new Instruções(),  400, 260);
         addObject(new Sair(),  400, 300);       
    }
}