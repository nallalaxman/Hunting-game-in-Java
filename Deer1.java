import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deer1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deer1 extends Actor
{
    /**
     * Act - do whatever the Deer1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /*public void act()
    {
        /*move(1);
        if(getX()==1199)
        {
            setLocation(0,getY());
        }
        
    }*/
    public int movement=7;
    /**
     * Act - do whatever the PinkDevil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    /*public void act()
    {
       setLocation(getX(),getY()+movement);
       if(getY()==1199)
       {
           movement=-7;
       }
       if(getY()==0)
       {
           movement=7;
       }
    }*/
     public void act()
    {
      move(1);
      if(getX()==1199)
      {
          setLocation(0,getY());
      }
    }
    public Deer1()
    {
        int newWidth=getImage().getWidth()/6;
        int newHeight=getImage().getHeight()/6;
        getImage().scale(newWidth,newHeight);
    }
    
}
