import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Under here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Under extends Actor
{
     public Under()
    {
        int newWidth=getImage().getWidth()/5;
        int newHeight=getImage().getHeight()/5;
        getImage().scale(newWidth,newHeight);
    }
    /**
     * Act - do whatever the Under wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
