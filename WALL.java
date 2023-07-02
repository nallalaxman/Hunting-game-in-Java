import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WALL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WALL extends Actor
{
    /**
     * Act - do whatever the WALL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public WALL()
    {
        int newWidth=getImage().getWidth()/3;
        int newHeight=getImage().getHeight()/7;
        getImage().scale(newWidth,newHeight);
    }
}
