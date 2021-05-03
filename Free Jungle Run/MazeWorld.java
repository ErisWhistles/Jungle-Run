import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{
    GreenfootSound gfs_mazeWorld;
    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
        gfs_mazeWorld =  new  GreenfootSound("main.wav");

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,0*50,5*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,1*50,5*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,3*50,5*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,4*50,5*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,5*50,5*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,5*50,3*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,5*50,2*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,6*50,3*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,7*50,2*50);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,9*50,2*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,9*50,3*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,9*50,4*50);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,9*50,5*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,10*50,5*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,7*50,3*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,7*50,5*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,7*50,6*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,7*50,7*50);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,9*50,7*50);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,9*50,8*50);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,7*50,8*50);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,8*50,8*50);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,10*50,8*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,10*50,9*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,9*50,9*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,9*50,10*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,8*50,10*50);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,7*50,10*50);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,4*50,6*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,4*50,7*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,1*50,9*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,1*50,8*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,2*50,8*50);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,3*50,8*50);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,3*50,9*50);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,3*50,10*50);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,4*50,10*50);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,5*50,10*50);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,7*50,0*50);
        MazeBlock mazeBlock60 = new MazeBlock();
        mazeBlock60.setLocation(197,400);
        MazeBlock mazeBlock62 = new MazeBlock();
        addObject(mazeBlock62,497,99);
        MazeBlock mazeBlock63 = new MazeBlock();
        addObject(mazeBlock63,544,98);
        MazeBlock mazeBlock65 = new MazeBlock();
        addObject(mazeBlock65,24,130);
        MazeBlock mazeBlock66 = new MazeBlock();
        addObject(mazeBlock66,71,130);
        MazeBlock mazeBlock67 = new MazeBlock();
        addObject(mazeBlock67,118,130);
        mazeBlock44.setLocation(48,444);
        MazeBlock mazeBlock75 = new MazeBlock();
        addObject(mazeBlock75,82,56);
        mazeBlock75.setLocation(84,24);
        MazeBlock mazeBlock76 = new MazeBlock();
        addObject(mazeBlock76,134,24);
        MazeBlock mazeBlock77 = new MazeBlock();
        addObject(mazeBlock77,184,25);
        MazeBlock mazeBlock78 = new MazeBlock();
        addObject(mazeBlock78,499,148);
        MazeBlock mazeBlock79 = new MazeBlock();
        addObject(mazeBlock79,573,572);
        MazeBlock mazeBlock80 = new MazeBlock();
        addObject(mazeBlock80,572,521);
        MazeBlock mazeBlock81 = new MazeBlock();
        addObject(mazeBlock81,27,572);
        MazeBlock mazeBlock82 = new MazeBlock();
        mazeBlock82.setLocation(540,9);
        MazeBlock mazeBlock83 = new MazeBlock();
        addObject(mazeBlock83,200,400);
        EnemyFlyer enemyFlyer = new EnemyFlyer();
        addObject(enemyFlyer,29,190);
        EnemyFlyer enemyFlyer3 = new EnemyFlyer();
        addObject(enemyFlyer3,286,389);
        WalkingEnemy walkingEnemy = new WalkingEnemy(true);
        addObject(walkingEnemy,253,293);
        walkingEnemy.setLocation(249,286);
        WalkingEnemy walkingEnemy2 = new WalkingEnemy(false);
        addObject(walkingEnemy2,28,81);
        walkingEnemy2.setLocation(170,82);
        TheWinnerEntersHere theWinnerEntersHere = new TheWinnerEntersHere();
        addObject(theWinnerEntersHere, 567, 44);
        Hero hero = new Hero();
        addObject(hero,62,499);
        theWinnerEntersHere.setLocation(537,46);
    }

    /**
     * 
     */
    public void started()
    {
        gfs_mazeWorld.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        gfs_mazeWorld.stop();
    }

}
