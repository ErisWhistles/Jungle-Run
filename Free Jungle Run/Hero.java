
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Hero here.
 * @author (your name) @version (a version number or a date)
 */
public class Hero extends Players
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    protected GifImage myGif =  new  GifImage("Hero.gif");
    private int speed = 2;
    private static final int EAST = 0;
    private static final int SOUTH = 90;
    private static final int WEST = 180;
    private static final int NORTH = 270;
    private int direction;
    /**
     * 
     */
     public void act()
     {
         setImage(myGif.getCurrentImage());
         move();
         if (isGameWon()){
           transitionToGameWinning();
          }
     }
    
    public void move() {
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+2,getY());
            if (getOneObjectAtOffset(1, 1, MazeBlock.class) != null) {
                setLocation(getX()-2,getY());
            }
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-2,getY());
            if (getOneObjectAtOffset(1, 1, MazeBlock.class) != null) {
                setLocation(getX()+2,getY());
            }
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY()-2);
            if (getOneObjectAtOffset(1, 1, MazeBlock.class) != null) {
               setLocation(getX(),getY()+2);
            }
         }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX(),getY()+2);
            if (getOneObjectAtOffset(1, 1, MazeBlock.class) != null) {
              setLocation(getX(),getY()-2);
            }
        }
    } 
    public boolean isGameWon()
     {
        if (isTouching(TheWinnerEntersHere.class))
        {   
            return true;
        }
        else {
            return false;
        }
    }
  
    public void transitionToGameWinning()
    {
        World mazeWorld = getWorld();
        World gameWinningWorld = new GameWinningWorld();
        gameWinningWorld.started();
        Greenfoot.setWorld(gameWinningWorld);
    }
}

