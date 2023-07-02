import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LIONDEAD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LIONDEAD extends Actor
{
    /**
     * Act - do whatever the LIONDEAD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public LIONDEAD()
    {
        int newWidth=getImage().getWidth()/4;
        int newHeight=getImage().getHeight()/4;
        getImage().scale(newWidth,newHeight);
    }
}
