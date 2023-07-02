import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOARD3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BOARD3 extends Actor
{
    /**
     * Act - do whatever the BOARD3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public BOARD3()
    {
        int newWidth=getImage().getWidth()/3;
        int newHeight=getImage().getHeight()/2;
        getImage().scale(newWidth,newHeight);
    }
}
