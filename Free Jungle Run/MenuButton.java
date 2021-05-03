import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MenuButton extends Actor
{
  public MenuButton()
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
            World menuworld = new Menu();
            Greenfoot.setWorld(menuworld);
    }
  }
}