import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;  

/**
 * Write a description of class Sair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sair extends Menu
{
   public boolean IniciarSelected = true;
    public boolean InstruçõesSelected = false;
    public boolean SairSelected = false;
    public boolean troca = false;
    
    public int canChange = 0;
    public int canChange2 = 0;
    
   public void act() 
    {
        if(Greenfoot.isKeyDown("down") && IniciarSelected){
                IniciarToInstruções();
       }
        
       if(Greenfoot.isKeyDown("down") && InstruçõesSelected && canChange > 5){
           InstruçõesToSair();
        }
        
      //Instrução Para Iniciar
      
       if(Greenfoot.isKeyDown("up") && InstruçõesSelected  && canChange2 > 5){
          InstruçõesToIniciar();
        }  
       
      // Sair Para Instrução  
        
       if(Greenfoot.isKeyDown("up") && SairSelected && !troca){
          troca = true;
          SairToInstruções();
        } 
        
       if(Greenfoot.isKeyDown("enter") && SairSelected){
            System.exit(0);
        }
        
       if(InstruçõesSelected){
           canChange++;
           canChange2++;
        }
        
       if(canChange2 > 6){
           troca = false;
           canChange2 = 0;
        }
       
       if(SairSelected){
           canChange = 0; 
        }
        
      if(IniciarSelected){
          troca = false;
          canChange = 0;
          canChange2 = 0;
      }
      
      
      if(troca){
          canChange2++;
        }
        
      if(SairSelected){
          setImage("SairSelected.png");
        }
      else if(!SairSelected){
          setImage("SairNonSelected.png");
        }
    }  
    
    public void IniciarToInstruções(){
        IniciarSelected = false;       
        InstruçõesSelected = true;
        SairSelected = false;
    }
    
    public void InstruçõesToSair(){
        IniciarSelected = false;
        InstruçõesSelected = false;
        SairSelected = true;        
    }
    
    public void InstruçõesToIniciar(){
        IniciarSelected = true;
        InstruçõesSelected = false;
        SairSelected = false;        
    }
    
    public void SairToInstruções(){
       IniciarSelected = false;
       InstruçõesSelected = true;
       SairSelected = false;        
    }
}
