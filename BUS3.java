import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BUS3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BUS3 extends VechileGroup
{
    /**
     * Act - do whatever the BUS3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        if(getX()==1199)
        {
            setLocation(0,getY());
        }
    }
    public BUS3()
    {
        super(5);
        
    }
}
