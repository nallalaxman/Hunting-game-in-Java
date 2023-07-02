import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZEBRA2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZEBRA2 extends Actor
{
    /**
     * Act - do whatever the ZEBRA2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Remove();
      /*move(2);
      if(getX()==1199)
      {
          setLocation(0,getY());
      }*/
    }
    public ZEBRA2()
    {
        int newWidth=getImage().getWidth()/8;
        int newHeight=getImage().getHeight()/8;
        getImage().scale(newWidth,newHeight);
    }
    public void Remove()
    {
       if(isTouching(Bullet.class))
       {
           
           getWorld().removeObject(this);
           
       }
    }
}
