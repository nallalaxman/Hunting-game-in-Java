import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambulance extends VechileGroup
{
    /**
     * Act - do whatever the Ambulance wants to do. This method is called whenever
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
    public Ambulance()
    {
        super(6);
        
    }
}
