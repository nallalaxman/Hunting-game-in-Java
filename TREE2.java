import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TREE2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TREE2 extends Actor
{
    /**
     * Act - do whatever the TREE2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
     public TREE2()
    {
        int newWidth=getImage().getWidth()/4;
        int newHeight=getImage().getHeight()/3;
        getImage().scale(newWidth,newHeight);
    }
}
