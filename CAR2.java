import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CAR2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CAR2 extends VechileGroup
{
    /**
     * Act - do whatever the CAR2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act()
    {
        move(-2);
        if(getX()==0)
        {
            setLocation(1200,getY());
        }
    }
    public CAR2()
    {
        super(6);
        
    }
}
