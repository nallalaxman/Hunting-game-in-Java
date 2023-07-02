import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VechileGroup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VechileGroup extends Actor
{
    /**
     * Act - do whatever the VechileGroup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public VechileGroup(int divisionSize)
    {
        int newWidth=getImage().getWidth()/divisionSize;
        int newHeight=getImage().getHeight()/divisionSize;
        getImage().scale(newWidth,newHeight);
    }
}
