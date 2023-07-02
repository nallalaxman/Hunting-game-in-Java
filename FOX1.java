import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FOX1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FOX1 extends Actor
{
    /**
     * Act - do whatever the FOX1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Remove();
        // Add your action code here.
    }
    public FOX1()
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
