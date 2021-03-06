import java.util.Scanner;
public abstract class Enemy
{
    //instance variables
    String name;
    int might;
    boolean isHostile;
    int movement;
    double speed;
    int health;
    static double wait;
    static int countEnemies = 0;
    Scanner scan = new Scanner(System.in);
//constructors
    public Enemy(String name, int might, int health, int movement, double speed, boolean isHostile)
    {
        this.name = name;
        this.might = might;
        this.health = health;
        this.movement = movement;
        this.speed = speed;
        wait = speed;
        this.isHostile = isHostile;
        countEnemies++;
    }//end constructor
    public Enemy()
    {
        name= null;
        might = 0;
        health = 0;
        movement = 0;
        speed = 0.0;
        isHostile = true;
        wait = speed;
        countEnemies++;
    }//end default costr

    //getters
    public String getName()
    {
        return name;
    }//returns name
    public int getMight()
    {
        return might;
    }//returns might

    public int getHealth() {
        return health;
    }

    public int getMovement() {
        return movement;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isHostile() {
        return isHostile;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }//sets name

    public void setMight(int might)
    {
        this.might = might;
    }

    public void setHealth(int health) {
        this.health = checkHealth(health);
    }

    public void setHostile(boolean hostile) {
        isHostile = hostile;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //brain methods
    public int attack(int numTimes)
    {
        int damage = 0;
        if((isHostile) && (wait == speed) && (health > 0))
        {
            for(int i = 0; i < numTimes; i++)
            {
                if (might < 2) {
                    damage += damageRoll(0, 2);
                } else {
                    damage += damageRoll(might - 2, might + 2);
                }
            }
            wait = 0;
        }
        else
        {
            System.out.println(name + " is either not hostile or dead.");
        }
        return damage;
    }//returns
    private int checkHealth(int health)
    {
        if(health < 1)
        {
            health = 0;
            System.out.println(name + " is dead.");
        }
        return health;
    }//verifies that it charcaters are dead
    private int damageRoll(int min, int max)
    {
        return (int) ((Math.random() * (max - min)) + min);
    }//rolls for an amount of damage between two
    public String toString()
    {
        String output = "\nName: " + name;
        output += "\nMight: " + might;
        output += "\nHealth: " + health;
        output += "\nMovement: " + movement;
        output += "\nHostile: " + isHostile;
        return output;
    }//end toString
}//end class Enemy
