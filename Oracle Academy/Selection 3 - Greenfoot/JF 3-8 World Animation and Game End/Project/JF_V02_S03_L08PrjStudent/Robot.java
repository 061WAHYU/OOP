import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    private GreenfootImage robotimage3;
    
    public int lives = 3;
    public int pizzaEaten = 0;
    public int score = 0;
    
    public Robot()
    {
        robotimage1= new GreenfootImage("man01.png");
        robotimage2= new GreenfootImage("man02.png");
        robotimage3= new GreenfootImage("gameover.png");
    }
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        showStatus();
    }
    public void robotMovement()
    {
        if(Greenfoot.isKeyDown("Up")){
            setLocation(getX(), getY() - 2);
        }
        if(Greenfoot.isKeyDown("Down")){
            setLocation(getX(), getY() + 2);
        }
        if(Greenfoot.isKeyDown("Left")){
            setLocation(getX() - 2, getY());
            animate();
        }
        if(Greenfoot.isKeyDown("Right")){
            setLocation(getX() + 2, getY());
            animate();
        }
        
    }
    public void detectWallCollision()
    {
        if(isTouching(Wall.class)){
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    public void detectBlockCollision() 
    {
        if(isTouching(Block.class)){
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
        
    }
    public void detectHome()
    {
        if(isTouching(Home.class) && pizzaEaten >= 5){
            increaseScore();
            Greenfoot.playSound("yipee.wav");
            pizzaEaten = 0;
            Greenfoot.stop();
        }
    }
    public void eatPizza()
    {
        if(isTouching(Pizza.class))
        {
            showStatus();
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
        }
    }
    public void animate()
    {
        if(getImage()==robotimage1)
        {
            setImage(robotimage2);
        }else{
            setImage(robotimage1);
        }
    }
    public void removeLife()
    {
        lives--;
        testEndGame();
        showStatus();
    }
    public void testEndGame()
    {
        if(lives == 0 && lives < 1){
            setImage(robotimage3);
            setLocation(400, 300);
            Greenfoot.stop();
        }
    }
    public void increaseScore()
    {
        score++;
        showStatus();
    }
    public void showStatus()
    {
        getWorld().showText("Score : "+score, 71, 530);
        getWorld().showText("Pizza : "+pizzaEaten, 71, 550);
        getWorld().showText("Lives : "+lives, 71, 570);
    }
}
