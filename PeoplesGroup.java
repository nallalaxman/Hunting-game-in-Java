import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroupPeople here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PeoplesGroup extends Actor
{
    /**
     * Act - do whatever the GroupPeople wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public PeoplesGroup(int divisionSize)
    {
        int newWidth=getImage().getWidth()/divisionSize;
        int newHeight=getImage().getHeight()/divisionSize;
        getImage().scale(newWidth,newHeight);
    }
}
