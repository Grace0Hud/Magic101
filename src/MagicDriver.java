import java.lang.reflect.Array;

public class MagicDriver
{
    public static void main(String[] args)
    {
        //create an object
        Dragon happy = new Dragon("Happy", "green", 20, 200, 5, 12.4, false, true, 60.0);
        Dragon nobody = new Dragon();
        Slime george = new Slime("George", 10, 15, 6, 20.35, true, "blue", true);
        //Slime nobody2 = new Slime();
        Monster drac = new Monster("Drac", 15, 100, 5, 19.45, true, 3, "air");
        Monster nobody3 = new Monster();
        Monster somebody = new Monster(4);
        //System.out.println(nobody3.compareTerrain());
        happy.setWingspan(-5);
        Enemy[] enemies = {happy, george, drac};
        for(Enemy e: enemies)
        {
            System.out.println(e.toString());
            System.out.println();
        }
        //nobody.setName("Sad");
        //print out the object via toString
       // System.out.println(happy.toString());
       // System.out.println(nobody.toString());
        //System.out.println(george.toString());
        //System.out.println(drac.toString());
        //System.out.println(nobody3.toString());
        //System.out.println(somebody.toString());
        //System.out.println("Nobody has been given a name! It's " + nobody.getName());
        //nobody.setMight(10);
        //drac.setLevel(5);
        //System.out.println(drac.toString());
        happy.setHealth(happy.getHealth() - drac.attack(2));
        System.out.println(drac.getName() + " is attacking " + happy.getName() + "! " + happy.getName() + " now has : " + happy.getHealth() + " health");


    }//end main method
}//end driver class
