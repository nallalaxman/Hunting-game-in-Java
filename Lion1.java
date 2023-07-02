import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lion1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lion1 extends Actor
{
    /**
     * Act - do whatever the Lion1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
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
   public Lion1()
    {
        int newWidth=getImage().getWidth()/4;
        int newHeight=getImage().getHeight()/4;
        getImage().scale(newWidth,newHeight);
    }
    public void Remove()
    {
       if(isTouching(Bullet.class))
       {
           //setImage("LIONDEAD.png");
           getWorld().removeObject(this);
           
       }
    }
    
        
    
}
