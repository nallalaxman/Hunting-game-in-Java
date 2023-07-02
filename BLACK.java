import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BLACK here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BLACK extends Actor
{
    /**
     * Act - do whatever the BLACK wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public BLACK()
    {
        int newWidth=getImage().getWidth()/15;
        int newHeight=getImage().getHeight()/6;
        getImage().scale(newWidth,newHeight);
    }
}
