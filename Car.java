import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hunter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Car extends Actor
{
     public int movement;
    /**
     * Act - do whatever the Hunter1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=9;
    public void act()
    {
        Navigation();
        Bullet();
        turnAround();
        moveAround();
        fireProjectile();    
        int newWidth=getImage().getWidth()/4;
        int newHeight=getImage().getHeight()/4;
        getImage().scale(newWidth,newHeight);
    
        
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("y"))
        setLocation(getX(),getY()-speed);
        if(Greenfoot.isKeyDown("g"))
        setLocation(getX()-speed,getY());
        if(Greenfoot.isKeyDown("b"))
        setLocation(getX(),getY()+speed);
        if(Greenfoot.isKeyDown("h"))
        setLocation(getX()+speed,getY());
        
        
    }
    public void Navigation()
    {
      
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            setImage("Forward.png");

        }
        else
        {
            setImage("Hunter1.png");
        }
        if(Greenfoot.isKeyDown("left"))
        {
           move(-5);
           setImage("Backword.png");
        }
        setLocation(getX(),getY()+movement);
        if(Greenfoot.isKeyDown("up"))
        {
            //move(5);
            movement=-2;
           //setRotation(getRotation()-5);
           setImage("Front.png");
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            //move(-5);
            movement=2;
           //setRotation(getRotation()+5);
           setImage("Back.png");
        }
        
      /* if(getY()==599)
       {
           movement=-7;
       }
       if(getY()==0)
       {
           movement=7;
       }*/
      
    }
    public void turnAround()
    {
        if(Greenfoot.getMouseInfo() !=null)
        turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());
        
    }
    /*public void fireProjectile()
    {
        if(Greenfoot.mousePressed(null)){
        Projectile projectile=new Projectile();
        getWorld().addObject(projectile,getX(),getY());
        projectile.setRotation(getRotation());
    }*/
    
    public void Bullet()
    {
        if(Greenfoot.isKeyDown("K"))
        {
            Bullet bullet=new Bullet();
            getWorld().addObject(bullet,getX(),getY());
            bullet.setRotation(getRotation());
        }
    }
    public void fireProjectile()
    {
        if(Greenfoot.mousePressed(null)){
        Bullet bullet=new Bullet();
        getWorld().addObject(bullet,getX(),getY());
        bullet.setRotation(getRotation());
    
}
}
}

