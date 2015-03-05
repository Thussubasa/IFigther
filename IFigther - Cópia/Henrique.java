import greenfoot.*;
import java.lang.String;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Henrique here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Henrique extends Fighters
{   
    public int punch1Timer = 0;
    public int punch2Timer = 0;
    public int kick1Timer = 0;
    public int kick2Timer = 0;
    public int specialTimer = 0;
    public int idleTimer = 0;
    public int defenseTimer = 0;
    public int fireHit = 20;
    public int walkTimer = 0;
    public int damageTimer;
    public int delay;
    public int loseTimer;

    public boolean canMoveRight = true;
    public boolean isTouching = false;

    public int punching1 = 0;
    public int punching2 = 0;
    public int kicking1 = 0;
    public int kicking2 = 0;
    public boolean defending = false;

    public int punch1Hit = 10;
    public int punch2Hit = 10;
    public int kick1Hit = 20;
    public int kick2Hit = 20; 
        
    public void act()  
    {
        Global.Player1X = getX();
        Fight();
        if(atWorldEdge()){
            Global.player1AtEdge = true;
        }
        else
            Global.player1AtEdge = false;
        
        if(Global.Player1HP < 21 && Global.Player2Rounds == 1){
            loseRound();
        }
        
        if(Global.Player1HP < 21 && Global.Player2Rounds == 2){
                lose();
        }            
        
        if(!Global.pause && !Global.player2Wins && !Global.player1Wins){
            keys();
        }
        Global.Player1X = getX();
        if(touching(Negao.class)) {      
             Global.Contact = true;
        } 
        else
             Global.Contact = false;
        
        if(fireHit == 0){
            fireHit = 20;
        }
        
        if(Global.Contact){
            if(Greenfoot.isKeyDown("n") || Greenfoot.isKeyDown("m") || Greenfoot.isKeyDown("j") || Greenfoot.isKeyDown("k")){
                damageTimer++;
                Global.player2Damage = true;                
            }
            else{
                damageTimer = 0;
                Global.player2Damage = false;
            }
                
            if(Greenfoot.isKeyDown("n")){
                delay = 12;  
                damage();                
            }         
            if(Greenfoot.isKeyDown("m")){
                delay = 9;   
                damage();                
            }            
            if(Greenfoot.isKeyDown("j")){
                delay = 6;
                damage();                
            }            
            if(Greenfoot.isKeyDown("k")){
                delay = 12;
                damage();                
            }            
            }
    }  

    public void keys(){ 
        if (!Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("g") && 
        !Greenfoot.isKeyDown("c") && !Greenfoot.isKeyDown("v") && 
        !Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("d") &&
        !Greenfoot.isKeyDown("s") && Global.Player2Rounds < 2 && Global.Player1HP > 21 ){
            idleAnimation();
        }

        if (Greenfoot.isKeyDown("f")){
            punch1();
        } 
        else 
            punch1Timer = 0;
            
        if (Greenfoot.isKeyDown("g")){
            punch2();
        } 
        else 
            punch2Timer = 0;

        if (Greenfoot.isKeyDown("c")){
            kick1();
        } 
        else 
            kick1Timer = 0;         

        if (Greenfoot.isKeyDown("v")){
            kick2();
        } 
        else 
            kick2Timer = 0; 

        if (Greenfoot.isKeyDown("d") && !Greenfoot.isKeyDown("c") && !Greenfoot.isKeyDown("v") && !Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("g")&& !defending){
            moveRight();
            
        }

        if (Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("c") && !Greenfoot.isKeyDown("v") && !Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("g") && !defending){
            moveLeft();
        } 
        else 
            defending = false;

        if (Greenfoot.isKeyDown("s") && !Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("m") && !Greenfoot.isKeyDown("j") && !Greenfoot.isKeyDown("k") ){
            defense();
            Global.player1Defense = true;
        }
        else{
            Global.player1Defense = false;
            defenseTimer = 0;
        }
    }

    public void punch1(){
        punch1Timer ++;
        if(punch1Timer == 3){
            setImage("HenriquePunch1-1.png");
        }
        if(punch1Timer == 6){
            setImage("HenriquePunch1-2.png");  
            Global.player1Punch1 = true;
        }
        else
            Global.player1Punch1 = false; 
        if(punch1Timer > 14){
            idleAnimation();
        }
    }

    public void punch2 (){
        punch2Timer ++;
        if(punch2Timer == 3)
            setImage("HenriquePunch2-1.png");
        if(punch2Timer == 6)
            setImage("HenriquePunch2-2.png");  
        if(punch2Timer == 9)
            setImage("HenriquePunch2-3.png");  
        if(punch2Timer == 12){
            setImage("HenriquePunch2-4.png");
            Global.player1Punch2 = true;
        }
        else
            Global.player1Punch2 = false; 
        if(punch2Timer == 20)
            setImage("HenriquePunch2-5.png");  
        if(punch2Timer == 23)
            setImage("HenriquePunch2-6.png");  
        if(punch2Timer > 26)
            idleAnimation();
    }

    public void kick1 (){
        kick1Timer ++;  
        if(kick1Timer == 3)
            setImage("HenriqueKick1-1.png");
        if(kick1Timer == 6)
            setImage("HenriqueKick1-2.png");
        if(kick1Timer == 9)
            setImage("HenriqueKick1-3.png");
        if(kick1Timer == 12){
            setImage("HenriqueKick1-5.png");
            Global.player1Kick1 = true;
        }
        else
            Global.player1Kick1 = false; 
        if(kick1Timer == 20)
            setImage("HenriqueKick1-6.png");
        if(kick1Timer == 23)
            setImage("HenriqueKick1-7.png");
        if(kick1Timer > 26)
            idleAnimation(); 
    }

    public void kick2 (){
        kick2Timer ++;  
        if(kick2Timer == 3)
            setImage("HenriqueKick2-1.png");
        if(kick2Timer == 6)
            setImage("HenriqueKick2-2.png");
        if(kick2Timer == 9)
            setImage("HenriqueKick2-3.png");
        if(kick2Timer == 12)
            setImage("HenriqueKick2-5.png");
        if(kick2Timer == 15)
            setImage("HenriqueKick2-7.png");
        if(kick2Timer == 18){
            setImage("HenriqueKick2-6.png");
            Global.player1Kick2 = true;
        }
        else
            Global.player1Kick2 = false; 
        if(kick2Timer > 26){
            Global.player2Damage = false;
            idleAnimation();   
        }
    }
    
    public void defense (){
        defenseTimer ++;    
        
        if(defenseTimer == 3){
            setImage("HenriqueDefense1-3.png");
        }
        if(defenseTimer > 6){
            setImage("HenriqueDefense1-4.png");
        }
        defending = true;
    }

    public void moveRight(){    
        if(!touching(Negao.class)){
            turn(-360);
            move();
            turn(360);
            walkTimer ++;      
            if(walkTimer == 3){
                setImage("Henriquewalk1.png");
            }
            if(walkTimer == 6){
                setImage("Henriquewalk2.png");
            }
            if(walkTimer == 9){
                setImage("HenriqueWalk3.png");
            }
            if(walkTimer == 12){
                setImage("HenriqueWalk4.png");
            }
            if(walkTimer == 15){
                setImage("HenriqueWalk5.png");
            }    
            if(walkTimer == 18){
                setImage("HenriqueWalk6.png");
            }  
            if(walkTimer == 21){
                setImage("HenriqueWalk7.png");
            }              
            if(walkTimer > 24){
                walkTimer = 0;
            }          
        }
    }

    public void moveLeft(){        
        
        turn(180);
        move();
        turn(-180);
        walkTimer ++;
        if(walkTimer == 3){
                setImage("HenriqueWalk7.png");
            }
        if(walkTimer == 6){
                setImage("HenriqueWalk6.png");
            }
        if(walkTimer == 9){
                setImage("HenriqueWalk5.png");
        }
        if(walkTimer == 12){
                setImage("HenriqueWalk4.png");
        }
        if(walkTimer == 15){
                setImage("HenriqueWalk3.png");
        }    
        if(walkTimer == 18){
                setImage("Henriquewalk2.png");
        }  
        if(walkTimer == 21){
                setImage("Henriquewalk1.png");
            }              
        if(walkTimer > 24){
                walkTimer = 0;
            }          
    }    
   
    public void idleAnimation(){        
            idleTimer ++;
            if(idleTimer == 3 )
                setImage("HenriqueIdle1-1.png");
            if(idleTimer == 6){
                setImage("HenriqueIdle1-2.png");  
             }
             if(idleTimer == 9){
                setImage("HenriqueIdle1-3.png");  
             }
              if(idleTimer == 12){
                setImage("HenriqueIdle1-4.png");  
             }
              if(idleTimer == 15){
                setImage("HenriqueIdle1-5.png");  
             }
              if(idleTimer == 18){
                setImage("HenriqueIdle1-6.png");  
             }
              if(idleTimer == 21){
                setImage("HenriqueIdle1-7.png");  
             }
              if(idleTimer == 24){
                setImage("HenriqueIdle1-8.png");  
             }
              if(idleTimer == 27){
                setImage("HenriqueIdle1-9.png");  
             }
              if(idleTimer == 30){
                setImage("HenriqueIdle1-10.png");  
             }
             if(idleTimer > 33)        
                idleTimer = 0;
        
    }
    
    public void Fight(){
        if(Global.Contact){   
            if(Global.player1Kick2 && !Global.player2Defense){
                Global.Player1Hits ++;
                if(Global.Player2HP > 10){
                    Global.Player2HP -= 10;
                }
                else{
                    Global.Player2HP -= 9;
                }               
            }
            if(Global.player1Kick1 && !Global.player2Defense){
                Global.Player2HP -= 15;
                Global.Player1Hits ++;
            }
            if(Global.player1Punch1 && !Global.player2Defense){
                Global.Player2HP -= 5;
                Global.Player1Hits ++;
            }
            if(Global.player1Punch2 && !Global.player2Defense){
                Global.Player2HP -= 10;
                Global.Player1Hits ++;
            }
        }        
    }
    
    public void damage(){
        if(damageTimer == delay){
                setImage("HenriqueDamage2-1.png");
        }
        
        if(damageTimer == delay+3){
                setImage("HenriqueDamage2-2.png");
        }
        if(damageTimer == delay+6){
                setImage("HenriqueDamage2-3.png");
        }        
        if(damageTimer > delay+9){
                Global.player1Damage = true;
                idleAnimation();  
        } 
    }
    
    public void lose(){
            loseTimer ++;
            if(loseTimer == 2){
                setImage("HenriqueDamage1-2.png");  
             }
            if(loseTimer == 4){
                setImage("HenriqueDamage1-3.png");  
                setLocation(getX() - 50, 285);
             }
            if(loseTimer == 6){
                setImage("HenriqueDamage1-4.png");  
             }
            if(loseTimer == 8){
                setImage("HenriqueDamage1-5.png");  
                setLocation(getX() - 25, 285);
             }
            if(loseTimer == 10){
                setImage("HenriqueDamage1-6.png");  
                setLocation(getX() - 25, 285);
             }
            if(loseTimer == 12){
                setImage("HenriqueDamage1-7.png");  
             }
            if(loseTimer == 14){
                setImage("HenriqueDamage1-8.png");  
             }
            
    }
    
    public void loseRound(){
            loseTimer ++;
            if(loseTimer == 2){
                setImage("HenriqueDamage1-2.png");  
             }
            if(loseTimer == 4){
                setImage("HenriqueDamage1-3.png");  
                setLocation(getX() - 50, 285);
             }
            if(loseTimer == 6){
                setImage("HenriqueDamage1-4.png");  
             }
            if(loseTimer == 8){
                setImage("HenriqueDamage1-5.png");  
                setLocation(getX() - 25, 285);
             }
            if(loseTimer == 10){
                setImage("HenriqueDamage1-6.png");  
                setLocation(getX() - 25, 285);
             }
            if(loseTimer == 12){
                setImage("HenriqueDamage1-7.png");  
             }
            if(loseTimer == 14){
                setImage("HenriqueDamage1-8.png");  
             }
            if(loseTimer == 16){
                setImage("HenriqueDamage1-9.png");  
             }
            if(loseTimer == 18){
                setImage("HenriqueDamage1-10.png");  
             }
             if(loseTimer == 20){
                setImage("HenriqueDamage1-11.png");  
             }
             if(loseTimer == 22){
                setImage("HenriqueDamage1-12.png");  
             }
             if(loseTimer == 24){
                setImage("HenriqueDamage1-13.png");  
             }
             if(loseTimer == 26){
                setImage("HenriqueDamage1-14.png");  
             }
             
             if(loseTimer > 28){
                 moveLeft();
             }
    }
}



