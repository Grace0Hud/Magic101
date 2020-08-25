import java.lang.reflect.Array;
import java.util.ArrayList;
public class MagicDriver
{
    public static void main(String[] args)
    {
        //create an object
        Dragon happy = new Dragon("Happy", "chromatic", 20, 200, 5, 12.4, false, true, 60.0);
        //Dragon nobody = new Dragon();
        Slime george = new Slime("George", 10, 15, 6, 20.35, true, "blue", true);
        //Slime nobody2 = new Slime();
        Monster drac = new Monster("Drac", 15, 100, 5, 19.45, true, 3, "air");
        //Monster beast = new Monster("beast", 10, 30, 4, 7, true, 4, "land");
        //Monster nobody3 = new Monster();
        //Monster somebody = new Monster(4);
        Sorcerer me = new Sorcerer("Me", 10, 20, 200, 4, false, "dagger");
        Sorcerer healer = new Sorcerer(true, "staff");
        Sorcerer nobody4 = new Sorcerer();
        //System.out.println(nobody3.compareTerrain());
        //happy.setWingspan(-5);

        //System.out.printf("Watch out, there are %d enemies attacking %n%n", Enemy.countEnemies);
        //creating array lists
/*
        ArrayList<Enemy> enemyList = new ArrayList<>();
        enemyList.add(happy);
        enemyList.add(george);
        enemyList.add(beast);
        enemyList.add(nobody);

        for(int i = 0; i < enemyList.size(); i++)
        {
            System.out.println(enemyList.get(i));
        }

 */
        //Enemy[] enemies = {happy, george, beast};
  /*      for(Enemy e: enemies)
        {
            System.out.println(e.toString());
            System.out.println();
        }

   */
        //nobody.setName("Sad");


        //print out the object via toString
       // System.out.println(happy.toString());
       // System.out.println(nobody.toString());
        System.out.println(george.toString());
        //System.out.println(drac.toString());
        //System.out.println(nobody3.toString());
        //System.out.println(somebody.toString());
        //System.out.println("Nobody has been given a name! It's " + nobody.getName());
        //System.out.println(me.toString());
       // System.out.println(healer.toString());
        //System.out.println(nobody4.toString());

        //nobody.setMight(10);
        //drac.setLevel(5);
        //System.out.println(drac.toString());
        //george.setColor("purple");
        happy.setColor("green");
        //testing attack mechanic

       // happy.setHealth(happy.getHealth() - me.attack(1, "magic"));
       // System.out.println(me.getName() + " is attacking " + happy.getName() + "! " + happy.getName() + " now has : " + happy.getHealth() + " health");

        System.out.println("There are " + Enemy.countEnemies + " enemies total.");
        System.out.println("Dragons: " + Dragon.dragonCount);
        System.out.println("Slimes: " + Slime.slimeCount);
        System.out.println("Monsters: " + Monster.monsterCount);

        System.out.println("There are " + Sorcerer.playerCount + " players to resist them.");

    }//end main method
}//end driver class
