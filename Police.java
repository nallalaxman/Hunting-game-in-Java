import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Police here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Police extends VechileGroup
{
    /**
     * Act - do whatever the Police wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()
    {
        move(2);
        if(getX()==1199)
        {
            setLocation(0,getY());
        }
    }
    public Police()
    {
        super(5);
        
    }
}
