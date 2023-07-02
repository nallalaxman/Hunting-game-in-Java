import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Divider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Divider extends Actor
{
    /**
     * Act - do whatever the Divider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Divider()
    {
        int newWidth=getImage().getWidth()/9;
        int newHeight=getImage().getHeight()/9;
        getImage().scale(newWidth,newHeight);
    }
}
