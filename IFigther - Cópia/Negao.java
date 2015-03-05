import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Neg‹o here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Negao extends Fighters
{
    public int punch1Timer = 0;
    public int punch2Timer = 0;
    public int kick1Timer = 0;
    public int kick2Timer = 0;
    public int specialTimer = 0;
    public int idleTimer = 0;
    public int hitTimer = 0;
    public int defenseTimer = 0;
    public int walkTimer = 0;
    public int damageTimer = 0;
    public int delay = 0;
    
    public int random1;
    public int randomTimer = 0;
    
    public boolean defending = false;
    
    public void act()  
    {        
                
        Fight();
        if(!Global.pause){
            keys(); 
        }
        Global.Player2X = getX();
        if (touching(Henrique.class)) {      
             Global.Contact = true;
        } 
        else
             Global.Contact = false;
    }      
    
    public void keys(){ 
        if (!Greenfoot.isKeyDown("m") && !Greenfoot.isKeyDown("n") && 
            !Greenfoot.isKeyDown("j") && !Greenfoot.isKeyDown("k") && 
            !Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right") &&
            !Greenfoot.isKeyDown("down") &&  !Global.player2Damage){
                idleAnimation();
            }
        
        if (Greenfoot.isKeyDown("j") ){            
            punch1();
        } 
        else 
            punch1Timer = 0;
            
        if (Greenfoot.isKeyDown("k")){
            punch2();
        } 
        else 
            punch2Timer = 0;
        
        if (Greenfoot.isKeyDown("n")){
            kick1();
        } 
        else kick1Timer = 0;
        
        if (Greenfoot.isKeyDown("m")){
            kick2();
        } 
        else 
            kick2Timer = 0;            
        
        if (Greenfoot.isKeyDown("right") && !Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("m") && !Greenfoot.isKeyDown("j") && !Greenfoot.isKeyDown("k")&& !defending){
            moveRight();  
            walkTimer ++;      
            if(walkTimer == 2){
                setImage("Neg‹oWalk1-5.png");
            }
            if(walkTimer == 6){
                setImage("Neg‹oWalk1-4.png");
            }
            if(walkTimer == 10){
                setImage("Neg‹oWalk1-3.png");
            }
            if(walkTimer == 14){
                setImage("Neg‹oWalk1-2.png");
            }
            if(walkTimer == 18){
                setImage("Neg‹oWalk1-1.png");
            }    
            if(walkTimer > 22){
                walkTimer = 0;
            }         
        }
        
        if (Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("n") && !Greenfoot.isKeyDown("m") && !Greenfoot.isKeyDown("j") && !Greenfoot.isKeyDown("k")&& !defending){
            moveLeft();
            walkTimer ++;      
            if(walkTimer == 2){
                setImage("Neg‹oWalk1-1.png");
            }
            if(walkTimer == 6){
                setImage("Neg‹oWalk1-2.png");
            }
            if(walkTimer == 10){
                setImage("Neg‹oWalk1-3.png");
            }
            if(walkTimer == 14){
                setImage("Neg‹oWalk1-4.png");
            }
            if(walkTimer == 18){
                setImage("Neg‹oWalk1-5.png");
            }    
            if(walkTimer > 22){
                walkTimer = 0;
            }         
            } 
            else {
                defending = false;
            }
        
        if (Greenfoot.isKeyDown("down") && !Greenfoot.isKeyDown("j") && !Greenfoot.isKeyDown("k") && !Greenfoot.isKeyDown("m") && !Greenfoot.isKeyDown("n") ){            
                defense();
            }       
        else{
            Global.player2Defense = false;
            defenseTimer = 0;
        }
        
        if(Global.Contact){
            if(Greenfoot.isKeyDown("c") || Greenfoot.isKeyDown("v") || Greenfoot.isKeyDown("f") || Greenfoot.isKeyDown("g")){
                damageTimer++;
                Global.player2Damage = true;
            }
            else{
                damageTimer = 0;
                Global.player2Damage = false;
            }
                
            if(Greenfoot.isKeyDown("c")){
                delay = 12;  
                damage();                
            }         
            if(Greenfoot.isKeyDown("v")){
                delay = 15;   
                damage();                
            }            
            if(Greenfoot.isKeyDown("f")){
                delay = 6;
                damage();                
            }            
            if(Greenfoot.isKeyDown("g")){
                delay = 12;
                damage();                
            }            
            }
        }
         
    
    public void punch1(){
        punch1Timer ++;        
        if(punch1Timer == 3)
                setImage("Neg‹oPunch2-1.png");
                
        if(punch1Timer == 6){
            Global.player2Punch1 = true;
            setImage("Neg‹oPunch2-2.png");   
        }
        else 
            Global.player2Punch1 = false;
            
        if(punch1Timer > 14){
                setImage("Neg‹oIdle2.png");
            }        
    }

    public void punch2 (){
        punch2Timer ++;
        if(punch2Timer == 3)
            setImage("Neg‹oPunch1-3.png");   
        if(punch2Timer == 6)
            setImage("Neg‹oPunch1-4.png");  
        if(punch2Timer == 9)
            setImage("Neg‹oPunch1-5.png");   
        if(punch2Timer == 12){
            Global.player2Punch2 = true;
            setImage("Neg‹oPunch1-6.png");   
        }
        else
            Global.player2Punch2 = false;
        if(punch2Timer > 20)
                setImage("Neg‹oIdle2.png");                   
    }
    
    public void kick1 (){
        kick1Timer ++;       
        if(kick1Timer == 3)
                setImage("Neg‹oKick1-1.png");
        if(kick1Timer == 6)
                setImage("Neg‹oKick1-2.png");
        if(kick1Timer == 9)
                setImage("Neg‹oKick1-3.png");
        if(kick1Timer == 12){
            Global.player2Kick1 = true;
            setImage("Neg‹oKick1-4.png");
            }
        if(kick1Timer == 12 && Global.Contact){
            Global.player2Kick1 = true;
            setImage("Neg‹oKick1-4.png");
            
            }    
        else
            Global.player2Kick1 = false;
        if(kick1Timer > 20)
                setImage("Neg‹oIdle2.png");                                     
    }
    
    public void kick2 (){
        kick2Timer ++;        
        if(kick2Timer == 3)
                setImage("Neg‹oKick2-1.png");
                
        if(kick2Timer == 6)
                setImage("Neg‹oKick2-2.png");
                
        if(kick2Timer == 9){
            Global.player2Kick2 = true;
            setImage("Neg‹oKick2-3.png");
            }
        else 
            Global.player2Kick2 = false;          
            
        if(kick2Timer > 17)
                setImage("Neg‹oIdle2.png");
    }
    
    public void damage(){
            if(damageTimer == delay){
                setImage("Neg‹oDamage1-1.png");
            }
            if(damageTimer == delay+2){
                setImage("Neg‹oDamage1-2.png");
            }
            if(damageTimer == delay+4){
                setImage("Neg‹oDamage1-3.png");
            }
            if(damageTimer == delay+6){
                setImage("Neg‹oDamage1-4.png");
            }
            if(damageTimer > delay+8){
                Global.player2Damage = true;
                idleAnimation();  
            } 
        }
        
    
    public void defense (){        
        defenseTimer ++;        
        if(defenseTimer == 2){            
            setImage("Neg‹oDefense1-1.png");
        }
        if(defenseTimer == 4){
            setImage("Neg‹oDefense1-2.png");
        }
        defending = true;
        Global.player2Defense = true;
    }
    
    public void moveRight(){    
        turn(-360);
        move();
        turn(360);
              
    }
    
    public void moveLeft(){         
        if(!Global.Contact){ 
            turn(180);
            move();
            turn(-180);            
        }
        else        
             setImage("Neg‹oIdle2.png");
            
    }
    
    public void hitAnimation(){
        idleTimer ++;
        if(idleTimer >0 && idleTimer <8)
            setImage("Neg‹oDamage2-1.png");
        if(idleTimer > 8 && idleTimer < 16){
            setImage("Neg‹oDamage2-2.png");  
         }
        if(idleTimer > 16 && idleTimer < 24){
            setImage("Neg‹oDamage2-3.png");  
         }
        if(idleTimer > 24 ){
            idleTimer = 0;
         }
    }
    
    public void idleAnimation(){
        idleTimer ++;
        if(idleTimer == 3 )
            setImage("Neg‹oIdle1.png");
        if(idleTimer == 6){
            setImage("Neg‹oIdle2.png");  
         }
        if(idleTimer == 9){
            setImage("Neg‹oIdle3.png");  
         }
        if(idleTimer == 12){
            setImage("Neg‹oIdle4.png");  
        }
        if(idleTimer == 15){
            setImage("Neg‹oIdle5.png");  
        }
        if(idleTimer == 18){
            setImage("Neg‹oIdle6.png");  
        }
        if(idleTimer == 21){
            setImage("Neg‹oIdle7.png");  
        }         
        if(idleTimer > 22)        
            idleTimer = 0;        
    }
    
    public void walkFrontAnimation(){
        
    }
    public void Fight(){
        if(Global.Contact){
            if(Global.player2Kick2 && !Global.player1Defense){
                Global.Player1HP -= 10;
                Global.Player1Hits ++;
            }
            if(Global.player2Kick1 && !Global.player1Defense){
                Global.Player1HP -= 15;
            }
            if(Global.player2Punch1 && !Global.player1Defense){
                Global.Player1HP -= 5;
            }
            if(Global.player2Punch2 && !Global.player1Defense){
                Global.Player1HP -= 10;
            }                      
        }
    }
}    

