import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LION2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LION2 extends Actor
{
    public void act()
    {
        Remove();
        /*int newWidth=getImage().getWidth()/4;
        int newHeight=getImage().getHeight()/4;
        getImage().scale(newWidth,newHeight);*/
         //move(4);
        /*if(getX()==999)
        {
            setLocation(0,getY());
        }*/
    }
   public LION2()
    {
        int newWidth=getImage().getWidth()/9;
        int newHeight=getImage().getHeight()/9;
        getImage().scale(newWidth,newHeight);
    }
    public void Remove()
    {
       if(isTouching(Bullet.class))
       {
           
           getWorld().removeObject(this);
           
       }
    }
}
