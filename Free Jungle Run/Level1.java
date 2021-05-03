import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    GreenfootSound gfs_level1;
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
        gfs_level1 =  new  GreenfootSound("main.wav");

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,25,25);
        MazeBlock mazeBlock1 = new MazeBlock();
        addObject(mazeBlock1,25,75);
        MazeBlock mazeBlock2= new MazeBlock();
        addObject(mazeBlock2,75,75);
        MazeBlock mazeBlock3= new MazeBlock();
        addObject(mazeBlock3,75,125);
        MazeBlock mazeBlock4= new MazeBlock();
        addObject(mazeBlock4,125,125);
        MazeBlock mazeBlock5= new MazeBlock();
        addObject(mazeBlock5,175,125);
        MazeBlock mazeBlock6= new MazeBlock();
        addObject(mazeBlock6,225,125);
        MazeBlock mazeBlock7= new MazeBlock();
        addObject(mazeBlock7,275,125);
        MazeBlock mazeBlock8= new MazeBlock();
        addObject(mazeBlock8,275,175);
        MazeBlock mazeBlock9= new MazeBlock();
        addObject(mazeBlock9,275,225);
        MazeBlock mazeBlock10= new MazeBlock();
        addObject(mazeBlock10,275,275);
        MazeBlock mazeBlock11= new MazeBlock();
        addObject(mazeBlock11,275,325);
        MazeBlock mazeBlock12= new MazeBlock();
        addObject(mazeBlock12,325,325);
        MazeBlock mazeBlock13= new MazeBlock();
        addObject(mazeBlock13,375,325);
        MazeBlock mazeBlock14= new MazeBlock();
        addObject(mazeBlock14,425,275);
        MazeBlock mazeBlock15= new MazeBlock();
        addObject(mazeBlock15,475,275);
        MazeBlock mazeBlock16= new MazeBlock();
        addObject(mazeBlock16,125,325);
        MazeBlock mazeBlock17= new MazeBlock();
        addObject(mazeBlock17,125,375);
        MazeBlock mazeBlock18= new MazeBlock();
        addObject(mazeBlock18,125,425);
        MazeBlock mazeBlock19= new MazeBlock();
        addObject(mazeBlock19,175,425);
        MazeBlock mazeBlock20= new MazeBlock();
        addObject(mazeBlock20,225,425);

        EnemyFlyer enemyFlyer = new EnemyFlyer();
        addObject(enemyFlyer,29,190);
        EnemyFlyer enemyFlyer3 = new EnemyFlyer();
        addObject(enemyFlyer3,286,389);
        WalkingEnemy walkingEnemy = new WalkingEnemy(true);
        addObject(walkingEnemy,253,293);
        walkingEnemy.setLocation(125,275);
        WalkingEnemy walkingEnemy2 = new WalkingEnemy(false);
        addObject(walkingEnemy2,28,81);
        walkingEnemy2.setLocation(170,82);
        FinalLevel finalLevel = new FinalLevel();
        addObject(finalLevel, 508, 45);
        Hero hero = new Hero();
        addObject(hero,62,499);
    }

    /**
     * 
     */
    public void started()
    {
        gfs_level1.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        gfs_level1.stop();
    }

}
