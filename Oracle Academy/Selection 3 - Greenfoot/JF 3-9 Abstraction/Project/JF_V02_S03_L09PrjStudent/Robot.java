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
    private int lives;
    private int pizzaEaten;
    private int score;
    private int timer;
    private final int MAXTIMER = 1000;
    
    public Robot()
    {
        robotimage1= new GreenfootImage("man01.png");
        robotimage2= new GreenfootImage("man02.png");
        robotimage3= new GreenfootImage("gameover.png");
        lives = 3;
        pizzaEaten = 0;
        timer = MAXTIMER;
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
        updateTimer();
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
            resetPosition();
            removeTouching(Wall.class);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    public void detectBlockCollision() 
    {
        if(isTouching(Block.class)){
            resetPosition();
            removeTouching(Block.class);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
        
    }
    public void detectHome()
    {
        if(isTouching(Home.class) && pizzaEaten >= 5){
            resetPosition();
            removeTouching(Home.class);
            Greenfoot.playSound("yipee.wav");
            pizzaEaten = 0;
            Greenfoot.stop();
            RobotWorld myworld = (RobotWorld)getWorld();
            myworld.increaseLevel();
            increaseScore();
            resetTimer();
        }
    }
    public void eatPizza()
    {
        if(isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
            timer = timer + 200;
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
        showStatus();
        testEndGame();
    }
    public void testEndGame()
    {
        if(lives == 0){
            Greenfoot.stop();
            setImage(robotimage3);
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
    public void updateTimer()
    {
        getWorld().showText("Time Left", 48, 10);
        if(timer == 0){
            removeLife();
            resetTimer();
        }
    }
    public void resetPosition()
    {
        setLocation(48,50);
    }
    public void resetTimer()
    {
        timer = MAXTIMER;    
    }
}
