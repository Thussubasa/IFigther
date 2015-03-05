import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Iniciar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Iniciar extends Menu
   
{
   public boolean IniciarSelected = true;
    public boolean Instru��esSelected = false;
    public boolean SairSelected = false;
    public boolean troca = false;
    
    public int canChange = 0;
    public int canChange2 = 0;    
   public void act() 
    {
      // Iniciar Para Instru��es
      if(Greenfoot.isKeyDown("down") && IniciarSelected){
           IniciarToInstru��es();
      }
      // Instru��es Para Sair  
      if(Greenfoot.isKeyDown("down") && Instru��esSelected && canChange > 5){
           Instru��esToSair();
      }
      //Instru��o Para Iniciar
      if(Greenfoot.isKeyDown("up") && Instru��esSelected  && canChange2 > 5){
          Instru��esToIniciar();
      }  
      // Sair Para Instru��o          
      if(Greenfoot.isKeyDown("up") && SairSelected && !troca){
          troca = true;
          SairToInstru��es();
      } 
      // Iniciar Jogo   
      if(Greenfoot.isKeyDown("enter") && IniciarSelected){
          Greenfoot.setWorld(new Stage1()) ;
      }
        
      if(Instru��esSelected){
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
        
      if(IniciarSelected){
            //Greenfoot.playSound("select.wav");
            setImage("IniciarSelected.png");
      }
      else if(!IniciarSelected){
            setImage("IniciarNonSelected.png");
      }
    }  
    
    public void IniciarToInstru��es(){
        IniciarSelected = false;       
        Instru��esSelected = true;
        SairSelected = false;
    }
    
    public void Instru��esToSair(){
        IniciarSelected = false;
        Instru��esSelected = false;
        SairSelected = true;        
    }
    
    public void Instru��esToIniciar(){
        IniciarSelected = true;
        Instru��esSelected = false;
        SairSelected = false;        
    }
    
    public void SairToInstru��es(){
       IniciarSelected = false;
       Instru��esSelected = true;
       SairSelected = false;        
    }
}
