import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CHEETAH1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CHEETAH1 extends Actor
{
    /**
     * Act - do whatever the CHEETAH1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Remove();
        // Add your action code here.
    }
    public CHEETAH1()
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
