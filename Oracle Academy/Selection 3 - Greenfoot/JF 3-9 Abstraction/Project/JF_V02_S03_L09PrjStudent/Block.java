import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int turnspeed;
    
    public void act()
    {
        turn(turnspeed);
    }
    public Block(int maxturnspeed)
    {
        turnspeed = (Greenfoot.getRandomNumber(maxturnspeed)+ maxturnspeed);
        if(turnspeed == 0)
        {
            turnspeed++;
        }
    }  
    }
