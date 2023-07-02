import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ROAD1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ROAD1 extends Actor
{
    /**
     * Act - do whatever the ROAD1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
           
    }
    public ROAD1()
    {
        int newWidth=getImage().getWidth()/1;
        int newHeight=getImage().getHeight()/1;
        getImage().scale(newWidth,newHeight);
    }
}
