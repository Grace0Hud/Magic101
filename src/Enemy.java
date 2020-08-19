public abstract class Enemy
{
    //instance variables
    String name;
    int might;
    boolean isHostile;

    public Enemy(String name, int might, boolean isHostile)
    {
        this.name = name;
        this.might = might;
        this.isHostile = isHostile;
    }//end constructor
    public Enemy()
    {
        name= null;
        might = 0;
        isHostile = true;
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

    //setters
    public void setName(String name)
    {
        this.name = name;
    }//sets dragon name to a new value

    public void setMight(int might)
    {
        this.might = might;
    }

    public String toString()
    {
        String output = "\nName: " + name;
        output += "\nMight: " + might;
        output += "\nHostile: " + isHostile;
        return output;
    }//end toString
}//end class Enemy
