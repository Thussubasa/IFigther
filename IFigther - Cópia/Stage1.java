import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Cen‡rio das lutas
 * 
 * @author (Clayton Fidelis) 
 * @version (13 / 09 / 2013)
 */
public class Stage1 extends World
{
    private Henrique Player1;
    private Negao Player2;
    private Fighters Fighters;
    private Time Timer;  
    
    public Stage1(){    
        super(800, 400, 1); 
        populate();
        Greenfoot.setSpeed(45); 
        Global.currentRound = 1;
        Global.currentRound = 1;
        Global.Player1Rounds = 0;
        Global.Player2Rounds = 0;
        Global.Player1HP = 321;
        Global.Player2HP = 321;
        Global.timer = 99;
    }
    
     public void act()  
    {  
        if(Global.Player1Rounds == 2){
            Global.player1Wins = true;
        }
        else
            Global.player1Wins = false;
            
        if(Global.player1AtEdge && Global.Player1HP < 21){
            if(Global.Player1Rounds == 1 || Global.Player2Rounds == 1){
                newRound();
            }
            
        }
            
        if(Global.Player2Rounds == 2){
            Global.player2Wins = true;
        }
        else
            Global.player2Wins = false;
            
        if(Global.Player1Rounds == 2 || Global.Player2Rounds == 2){
            addObject(new KO(), 440, 157); 
            addObject(new Winner(), 439, 340);
        }
        
        if(Global.Player1HP < 21 || Global.Player2HP < 21 || Global.timer <= 0){
            
        }
        
        if((Global.Player1Rounds + Global.Player2Rounds) == 0){
            Global.currentRound = 1;
        }
        if((Global.Player1Rounds + Global.Player2Rounds) == 1){
            Global.currentRound = 2;
        }
        if((Global.Player1Rounds + Global.Player2Rounds) == 2){
            Global.currentRound = 3;
        }
    }
            

    public void populate(){
        Player1 = new Henrique(); 
        Player2 = new Negao(); 
        Timer = new Time();
        addObject(new HUD(), 400, 45); 
        
        addObject(Player2, 690, 285); 
        addObject(Player1,  110, 285);  
        addObject(Timer, 402, 45);
        addObject(new Round(), 439, 67); 
        addObject(new LifePlayer1(), 190, 45);         
        addObject(new LifePlayer2(), 608, 45);
        addObject(new PlacarPlayer1(), 373, 53);
        addObject(new PlacarPlayer2(), 505, 53);
        addObject(new Player1Name(), 128, 51); 
        addObject(new Player2Name(), 764, 51);
        addObject(new LifePattern(), 190, 45); 
        addObject(new LifePattern(), 608, 45); 
        addObject(new TimeCirclePattern(), 399, 44);         
        addObject(new Quit(), 65, 375); 
        addObject(new Pause(), 25, 375); 
        
    }
    
   
    
    public void newRound(){ // Cria um novo round
        //Global.pause = true;
        removeObject(Player1);
        removeObject(Player2);
        populate();
        Global.Player1HP = 321;
        Global.Player2HP = 321;
        Global.currentRound++;
        Global.timer = 99;
        
        if(Global.currentRound == 2){
            addObject(new Round2(), 400 , 200);
        }
        if(Global.Player1Rounds == 1 && Global.Player2Rounds == 1 && Global.currentRound == 3){
           // addObject(new Round3(), 400 , 200);
        }
    }
}
