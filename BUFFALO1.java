import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BUFFALO1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BUFFALO1 extends Actor
{
    /**
     * Act - do whatever the BUFFALO1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Remove();
        // Add your action code here.
    }
    public BUFFALO1()
    {
        int newWidth=getImage().getWidth()/5;
        int newHeight=getImage().getHeight()/5;
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
