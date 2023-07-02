import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CAR3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CAR3 extends VechileGroup
{
    /**
     * Act - do whatever the CAR3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act()
    {
        move(-1);
        if(getX()==0)
        {
            setLocation(1200,getY());
        }
    }
    public CAR3()
    {
        super(8);
        
    }
}
