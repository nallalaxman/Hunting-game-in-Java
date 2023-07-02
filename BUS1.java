import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BUS1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BUS1 extends VechileGroup
{

    /**
     * Act - do whatever the BUS1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        if(getX()==1199)
        {
            setLocation(0,getY());
        }
    }
    public BUS1()
    {
        super(5);
        
    }
}
