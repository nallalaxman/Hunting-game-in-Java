import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOARD2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BOARD2 extends Actor
{
    /**
     * Act - do whatever the BOARD2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public BOARD2()
    {
        int newWidth=getImage().getWidth()/2;
        int newHeight=getImage().getHeight()/3;
        getImage().scale(newWidth,newHeight);
    }
}
