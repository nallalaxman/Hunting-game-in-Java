import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BUS2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BUS2 extends VechileGroup
{
    /**
     * Act - do whatever the BUS2 wants to do. This method is called whenever
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
    public BUS2()
    {
        super(5);
        
    }
}
