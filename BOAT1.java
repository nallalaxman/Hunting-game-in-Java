import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOAT1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BOAT1 extends Actor
{
    /**
     * Act - do whatever the BOAT1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //public int movement=7;
    public void act()
    {
      move(1);
      if(getX()==778)
      {
          setLocation(0,getY());
      }
    }
    public BOAT1()
    {
        int newWidth=getImage().getWidth()/3;
        int newHeight=getImage().getHeight()/3;
        getImage().scale(newWidth,newHeight);
    }
}
