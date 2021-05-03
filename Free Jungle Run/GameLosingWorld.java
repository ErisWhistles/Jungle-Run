import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameLosingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLosingWorld extends World
{
    GreenfootSound gameOver;
    /**
     * Constructor for objects of class GameLosingWorld.
     * 
     */
    public GameLosingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
       
        gameOver =  new  GreenfootSound("gameover.wav");
    }
    
    
    /**
     * 
     */
    public void started()
    {
        gameOver.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        gameOver.stop();
    }
}
