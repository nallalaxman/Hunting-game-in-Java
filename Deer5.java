import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deer5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deer5 extends Actor
{
    public void act()
    {
      move(1);
      if(getX()==1199)
      {
          setLocation(0,getY());
      }
    }
    public Deer5()
    {
        int newWidth=getImage().getWidth()/6;
        int newHeight=getImage().getHeight()/6;
        getImage().scale(newWidth,newHeight);
    }
}
