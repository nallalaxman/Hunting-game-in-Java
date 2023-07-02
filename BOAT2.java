import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOAT2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BOAT2 extends Actor
{
    /**
     * Act - do whatever the BOAT2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        if(getX()==762)
        {
            setLocation(0,getY());
        }
    }
    /*public void act()
    {
      move(1);
      if(getX()==780)
      {
          setLocation(0,getY());
      }
    }*/
    public BOAT2()
    {
        int newWidth=getImage().getWidth()/4;
        int newHeight=getImage().getHeight()/4;
        getImage().scale(newWidth,newHeight);
    }
     
}
