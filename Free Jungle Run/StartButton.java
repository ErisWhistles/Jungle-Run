import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartButton extends Actor
{

    public StartButton()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = 150;
        int myNewWidth = 90;
        myImage.scale(myNewHeight,myNewWidth);
    }

    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            getWorld().stopped();
            World mazeworld = new MazeWorld();
            mazeworld.started();
            Greenfoot.setWorld(mazeworld);

        }
    }
}
