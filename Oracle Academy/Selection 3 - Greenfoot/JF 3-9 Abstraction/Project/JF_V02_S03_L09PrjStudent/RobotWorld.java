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
    
    public int currentMaxTurnSpeed = 2;
    public int currentLevel = 1;
    
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
        Home home = new Home();
        addObject(home, 751, 552);
        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel, 71, 554);

        Robot robot = new Robot();
        addObject(robot,41,55);

        Wall wall = new Wall();
        addObject(wall,52,145);
        Wall wall2 = new Wall();
        addObject(wall2,159,145);
        Block block = new Block(2);
        addObject(block,326,144);
        Wall2 wall22 = new Wall2();
        addObject(wall22,464,15);
        Wall2 wall23 = new Wall2();
        addObject(wall23,464,47);
        Wall2 wall24 = new Wall2();
        addObject(wall24,464,78);
        Wall2 wall25 = new Wall2();
        addObject(wall25,464,107);
        Wall2 wall26 = new Wall2();
        addObject(wall26,463,136);
        Wall wall3 = new Wall();
        addObject(wall3,499,144);
        Wall2 wall27 = new Wall2();
        addObject(wall27,463,175);
        Wall2 wall28 = new Wall2();
        addObject(wall28,462,206);
        Wall2 wall29 = new Wall2();
        addObject(wall29,462,235);
        Wall2 wall210 = new Wall2();
        addObject(wall210,462,266);
        wall28.setLocation(462,203);
        wall29.setLocation(460,227);
        wall210.setLocation(459,263);
        Wall wall4 = new Wall();
        addObject(wall4,427,283);
        Wall wall5 = new Wall();
        addObject(wall5,320,283);
        Wall2 wall211 = new Wall2();
        addObject(wall211,284,315);
        Wall2 wall212 = new Wall2();
        addObject(wall212,282,584);
        Wall2 wall213 = new Wall2();
        addObject(wall213,281,552);
        wall213.setLocation(284,547);
        wall212.setLocation(280,572);
        Wall2 wall214 = new Wall2();
        addObject(wall214,282,524);
        wall214.setLocation(288,524);
        Wall2 wall215 = new Wall2();
        addObject(wall215,282,493);
        wall215.setLocation(282,493);
        Wall2 wall216 = new Wall2();
        addObject(wall216,466,583);
        Wall2 wall217 = new Wall2();
        addObject(wall217,464,552);
        wall217.setLocation(469,547);
        Wall2 wall218 = new Wall2();
        addObject(wall218,465,522);
        Wall wall6 = new Wall();
        addObject(wall6,746,162);
        Wall2 wall219 = new Wall2();
        addObject(wall219,676,162);
        Wall2 wall220 = new Wall2();
        addObject(wall220,676,191);
        Wall2 wall221 = new Wall2();
        addObject(wall221,675,222);
        wall221.setLocation(671,224);
        Block block2 = new Block(3);
        addObject(block2,134,378);
        Block block3 = new Block(1);
        addObject(block3,626,73);
        Block block4 = new Block(2);
        addObject(block4,516,387);
        Pizza pizza = new Pizza();
        addObject(pizza,756,210);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,759,29);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,401,47);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,41,320);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,374,563);
        Pizza pizza6 = new Pizza();
        addObject(pizza6,520,271);
        wall210.setLocation(456,251);
        wall29.setLocation(458,229);
        wall214.setLocation(286,516);
        wall213.setLocation(282,549);
        wall212.setLocation(277,576);
        wall212.setLocation(278,551);
        wall212.setLocation(277,590);
        wall217.setLocation(461,550);
        wall216.setLocation(465,582);
        wall221.setLocation(667,225);
    }

    public void setUpLevel()
    {
        if(currentLevel == 2)
        {
            currentMaxTurnSpeed++;
            addObject(new Block(2), 427, 145);
            for(int i =0; i<5; i++)
            {
                int xCoord = Greenfoot.getRandomNumber(this.getWidth());
                int yCoord = Greenfoot.getRandomNumber(this.getHeight());
                
                addObject(new Pizza(), xCoord, yCoord);
            }
            
        } else if(currentLevel == 3){
            currentMaxTurnSpeed++;
            addObject(new Block(2), 427, 145);
            for(int i =0; i<5; i++)
            {
                int xCoord = Greenfoot.getRandomNumber(this.getWidth());
                int yCoord = Greenfoot.getRandomNumber(this.getHeight());
                
                addObject(new Pizza(), xCoord, yCoord);
            }
        } else if(currentLevel == 4){
            currentMaxTurnSpeed++;
            addObject(new Block(2), 427, 145);
            for(int i =0; i<5; i++)
            {
                int xCoord = Greenfoot.getRandomNumber(this.getWidth());
                int yCoord = Greenfoot.getRandomNumber(this.getHeight());
                
                addObject(new Pizza(), xCoord, yCoord);
            }
        }
    }
    public void increaseLevel()
    {
        currentLevel++;
        setUpLevel();
    }
}
