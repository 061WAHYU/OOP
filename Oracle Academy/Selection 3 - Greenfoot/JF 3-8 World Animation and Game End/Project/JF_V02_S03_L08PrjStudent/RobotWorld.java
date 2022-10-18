import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (Komang Wahyu Kusuma Wardana) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Robot robot = new Robot();
        addObject(robot,48,50);
        Wall brick = new Wall();
        addObject(brick, 48, 147);
        Wall brick2 = new Wall();
        addObject(brick2, 52, 147);
        Wall brick3 = new Wall();
        addObject(brick3, 159, 147);
        Wall brick4 = new Wall();
        addObject(brick4, 266, 147);
        Wall brick5 = new Wall();
        addObject(brick5, 587, 147);
        Wall brick6 = new Wall();
        addObject(brick6, 692, 147);
        Wall brick7 = new Wall();
        addObject(brick7, 791, 147);
        Block greenBlock = new Block();
        addObject(greenBlock,427, 145);
        Home home = new Home();
        addObject(home, 751, 552);
        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel, 71, 554);
        Pizza pizza = new Pizza();
        addObject(pizza, 720, 46);
        Pizza pizza2 = new Pizza();
        addObject(pizza2, 433, 38);
        Pizza pizza3 = new Pizza();
        addObject(pizza3, 183, 302);
        Pizza pizza4 = new Pizza();
        addObject(pizza4, 682, 312);
        Pizza pizza5 = new Pizza();
        addObject(pizza5, 417, 537);
        
    }
}
