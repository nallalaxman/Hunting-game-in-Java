import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(52);
        disapper();
    }
    public Bullet()
    {
        int newWidth=getImage().getWidth()/15;
        int newHeight=getImage().getHeight()/15;
        getImage().scale(newWidth,newHeight);
    }
    public void disapper()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
