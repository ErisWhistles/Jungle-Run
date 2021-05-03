
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WalkingEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkingEnemy extends Enemies
{
    boolean upDown;
    //int speed =2;
    /**
     * Act - do whatever the WalkingEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WalkingEnemy(boolean upAndDown)
    {
        getImage().scale((getImage().getWidth()/2), getImage().getHeight()/2);
        upDown = upAndDown;
    }
    
    public void act() 
    {
        moveAround();
        WalkingEnemyHitWalls();
        isAtEdge();
        if (isGameLose()){
            transitionToGameLose();
        }
    }
    
    public void WalkingEnemyHitWalls()
    {
        if (hitWalls()|| isAtEdge())
        {
            speed = - speed;
        }
    }
    
    private void moveAround()
    {
        int x = getX();
        int y = getY();
        setLocation(x,y);
        if (upDown)
        {
            setLocation(x,y + speed);
        }
        else if (!upDown)
        {
            setLocation(x+speed, y);
        }
    }
    
    public boolean isGameLose()
    {
        if (isTouching(Hero.class))
        {   
            return true;
        }
        else {
            return false;
        }
    }
    
    public void transitionToGameLose()
    {
        World mazeWorld = getWorld();
        mazeWorld.stopped();
        World gameLosingWorld = new GameLosingWorld();
        gameLosingWorld.started();
        Greenfoot.setWorld(gameLosingWorld);
    }
}
