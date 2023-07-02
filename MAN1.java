import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MAN1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MAN1 extends PeoplesGroup
{
    /**
     * Act - do whatever the MAN1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        if(getX()==850)
        {
            setLocation(0,getY());
        }
    }
    public MAN1()
    {
        super(7);
        
    }
}
