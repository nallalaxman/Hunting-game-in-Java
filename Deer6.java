import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deer6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deer6 extends Actor
{
    public void act()
    {
      move(2);
      if(getX()==1199)
      {
          setLocation(0,getY());
      }
    }
    public Deer6()
    {
        int newWidth=getImage().getWidth()/6;
        int newHeight=getImage().getHeight()/6;
        getImage().scale(newWidth,newHeight);
    }
}
