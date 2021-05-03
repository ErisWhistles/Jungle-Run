import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    GreenfootSound background;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        prepare();

        background =  new  GreenfootSound("openingSound.wav");

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartButton startButton = new StartButton();
        addObject(startButton,300,125);
        startButton.setLocation(300,120);
        InstructionsButton instructionsButton = new InstructionsButton();
        addObject(instructionsButton,325,300);
        instructionsButton.setLocation(300,210);
        CreditsButton creditsButton = new CreditsButton();
        addObject(creditsButton,310,313);
        creditsButton.setLocation(300,300);
    }

    /**
     * 
     */
    public void started()
    {
        background.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        background.stop();
    }
}

