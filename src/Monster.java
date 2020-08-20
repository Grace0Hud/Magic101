public class Monster extends Enemy
{
    //intstance variable
    int level;
    String terrain;
    //constructors
    public Monster(String name, int might, int health, int movement, double speed, boolean isHostile, int level, String terrain)
    {
        super(name, might, health, movement, speed, isHostile);
        this.level = level;
        this.terrain = terrain;
    }//end full constructor

    public Monster(int level)
    {
        super();
        scale(level);
        this.terrain = "land";
        this.level = level;
    }//creates default monster but scales up to level
    public Monster()
    {
        super();
        this.terrain = "land";
        level = 0;
    }//end default constructor

    //getter

    public int getLevel() {
        return level;
    }

    //setter

    public void setLevel(int level)
    {
        scale(level);
        this.level = level;
    }

    //brain methods

    public void scale(int level)
    {
        if(this.level < level)
        {
            for(int i = 0; i < (level - this.level); i++)
            {
                might += 3;
                health +=10;
            }//end inner for
        }//end if level is greater
        else if(this.level > level)
        {
            for(int i = 0; i < (this.level - level); i++)
            {
                might -= 3;
                health -=10;
            }//end inner for
        }//end if level is less
        //nothing happens if they are the same.
    }//end scale method

    public String mightReact()
    {
        if(might < 10)
        {
            return "Weakling!";
        }
        else if(might >= 10 && might < 20)
        {
            return "Be warry...";
        }
        else //(might > 20)
        {
            return "OHHO... best stay away from that one..";
        }
    }//end might react

    public String compareTerrain()
    {
        if(terrain.equalsIgnoreCase("land"))
        {
            return "You can run away";
        }
        else if(terrain.equalsIgnoreCase("water"))
        {
            return "You can swim away";
        }
        else if(terrain.equalsIgnoreCase("air"))
        {
            return "Bummer for you....";
        }
        else
        {
            return "invalid input";
        }
    }//compareTerrain
    //toString
    public String toString()
    {
        String output = "---- MONSTER ----";
        output += "\n Level: " + level;
        output += super.toString();
        return output;
    }
}
