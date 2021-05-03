import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsWorld extends World
{

    /**
     * Constructor for objects of class CreditsWorld.
     * 
     */
    public CreditsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 

        showText("Temple Escape Was Created and Developed By:",300,120);
        showText("Fiacre Byiringiro",300,180);
        showText("Ethan Degani",300,240);
        showText("Jiamin Yuan",300,300);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MenuButton menuButton = new MenuButton();
        addObject(menuButton,255,400);
        menuButton.setLocation(300,400);
    }
}
