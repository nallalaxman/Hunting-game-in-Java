import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GRASS3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GRASS3 extends Actor
{
    /**
     * Act - do whatever the GRASS3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public GRASS3()
    {
        int newWidth=getImage().getWidth()/1;
        int newHeight=getImage().getHeight()/6;
        getImage().scale(newWidth,newHeight);
    }
}
