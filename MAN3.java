import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MAN3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MAN3 extends PeoplesGroup
{
    /**
     * Act - do whatever the MAN3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()
    {
        move(0);
        if(getX()==850)
        {
            setLocation(0,getY());
        }
    }
    public MAN3()
    {
        super(7);
        
    }
}
