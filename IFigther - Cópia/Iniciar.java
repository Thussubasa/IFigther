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
    public boolean InstruçõesSelected = false;
    public boolean SairSelected = false;
    public boolean troca = false;
    
    public int canChange = 0;
    public int canChange2 = 0;    
   public void act() 
    {
      // Iniciar Para Instruções
      if(Greenfoot.isKeyDown("down") && IniciarSelected){
           IniciarToInstruções();
      }
      // Instruções Para Sair  
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
      // Iniciar Jogo   
      if(Greenfoot.isKeyDown("enter") && IniciarSelected){
          Greenfoot.setWorld(new Stage1()) ;
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
        
      if(IniciarSelected){
            //Greenfoot.playSound("select.wav");
            setImage("IniciarSelected.png");
      }
      else if(!IniciarSelected){
            setImage("IniciarNonSelected.png");
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
