import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWinningWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWinningWorld extends World
{
    GreenfootSound gameWon;
    /**
     * Constructor for objects of class GameWinningWorld.
     * 
     */
    public GameWinningWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        gameWon =  new  GreenfootSound("win.wav");
    }
    
     
    /**
     * 
     */
    public void started()
    {
        gameWon.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        gameWon.stop();
    }

}
