import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TREE4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TREE4 extends Actor
{
    /**
     * Act - do whatever the TREE4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public TREE4()
    {
        int newWidth=getImage().getWidth()/4;
        int newHeight=getImage().getHeight()/4;
        getImage().scale(newWidth,newHeight);
    }
}
