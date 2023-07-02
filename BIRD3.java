import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BIRD3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BIRD3 extends Actor
{
    /**
     * Act - do whatever the BIRD3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        Remove();
      move(2);
      if(getX()==1199)
      {
          setLocation(0,getY());
      }
    }
    public BIRD3()
    {
        int newWidth=getImage().getWidth()/4;
        int newHeight=getImage().getHeight()/4;
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
