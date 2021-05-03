import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CreditsButton extends Actor
{
  public CreditsButton()
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
            World credits = new CreditsWorld();
            Greenfoot.setWorld(credits);
    }
  }
}
