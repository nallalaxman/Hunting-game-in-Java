import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoconutTree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoconutTree extends Actor
{
    /**
     * Act - do whatever the CoconutTree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
     public CoconutTree()
    {
        int newWidth=getImage().getWidth()/3;
        int newHeight=getImage().getHeight()/3;
        getImage().scale(newWidth,newHeight);
    }
}
