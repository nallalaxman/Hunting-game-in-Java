import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trafic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trafic extends Actor
{
    /**
     * Act - do whatever the Trafic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Trafic()
    {
        int newWidth=getImage().getWidth()/4;
        int newHeight=getImage().getHeight()/4;
        getImage().scale(newWidth,newHeight);
    }
    public void act()
    {
        // Add your action code here.
    }
}
