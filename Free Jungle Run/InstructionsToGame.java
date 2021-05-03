import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsToGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsToGame extends World
{
    /**
     * Constructor for objects of class InstructionsToGame.
     * 
     */
    public InstructionsToGame()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        showText("Welcome To Our Game Of Temple Escape",getWidth()/2,70);
        showText("The way to play is to avoid the enemies in the dungeon", getWidth()/2, 110);
        showText("The control keys are:", 300, 150);
        showText("W to move Upwards", 300, 190);
        showText("A to move Leftwards", 300, 230);
        showText("S to move Downwards", 300, 270);
        showText("D to move Rightwards", 300, 310);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MenuButton menuButton = new MenuButton();
        addObject(menuButton,269,401);
        menuButton.setLocation(300,400);
    }
}
