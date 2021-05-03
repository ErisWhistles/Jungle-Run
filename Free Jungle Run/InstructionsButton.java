import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionsButton extends Actor
{
  public InstructionsButton()
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
            World instructions = new InstructionsToGame();
            Greenfoot.setWorld(instructions);
    }
  }
}
