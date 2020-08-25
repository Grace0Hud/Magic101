import java.lang.reflect.Array;
import java.util.ArrayList;
public class MagicDriver
{
    public static void main(String[] args)
    {
        //create an object
        Dragon happy = new Dragon("Happy", "chromatic", 20, 200, 5, 12.4, false, true, 60.0);
        Dragon nobody = new Dragon();
        Slime george = new Slime("George", 10, 15, 6, 20.35, true, "blue", true);
        //Slime nobody2 = new Slime();
        Monster drac = new Monster("Drac", 15, 100, 5, 19.45, true, 3, "air");
        Monster beast = new Monster("beast", 10, 30, 4, 7, true, 4, "land");
        //Monster nobody3 = new Monster();
        //Monster somebody = new Monster(4);
        Sorcerer me = new Sorcerer("Me", 10, 20, 200, 4, false, "dagger");
        Sorcerer healer = new Sorcerer(true, "staff");
        Sorcerer nobody4 = new Sorcerer();
        //System.out.println(nobody3.compareTerrain());
        //happy.setWingspan(-5);

        //System.out.printf("Watch out, there are %d enemies attacking %n%n", Enemy.countEnemies);

        //Array list practice

        System.out.println("_____________Array List Practice____________\n");
        ArrayList<Enemy> enemyList = new ArrayList<>();
        enemyList.add(happy);
        enemyList.add(george);
        enemyList.add(beast);
        enemyList.add(nobody);

        for(int i = 0; i < enemyList.size(); i++)
        {
            System.out.println(enemyList.get(i));
        }

        System.out.println();


    //Array practice

        System.out.println("________________Array Practice______________\n");
        Enemy[] enemies = {happy, george, drac};
        for(Enemy e: enemies)
        {
            System.out.println(e.toString());
        }

        System.out.println();
        //nobody.setName("Sad");


        //print out the object via toString (Decided not to uncomment these due to printing most of them in arrays

       // System.out.println(happy.toString());
       // System.out.println(nobody.toString());
       // System.out.println(george.toString());
       // System.out.println(drac.toString());
        //System.out.println(nobody3.toString());
        //System.out.println(somebody.toString());
        //System.out.println("Nobody has been given a name! It's " + nobody.getName());
        // System.out.println(me.toString());
        //System.out.println(healer.toString());
        //System.out.println(nobody4.toString());

        //nobody.setMight(10);
        System.out.println("Drac is increasing in level!");
        drac.setLevel(5);
        System.out.println("These are his new stats! ");
        System.out.println(drac.toString());

        System.out.println();

        //testing color validation
        //george.setColor("purple");
        //happy.setColor("green");

        //testing attack mechanic

        System.out.println("_________________ Testing Attack Mechanics ___________________\n");
        System.out.println();

        nobody.setHealth(nobody.getHealth() - me.attack(1, "magic"));
        System.out.println(me.getName() + " is attacking " + nobody.getName() + "! " + nobody.getName() + " now has : " + nobody.getHealth() + " health");
        System.out.println();

        me.setHealth(me.getHealth() - nobody.fireBreath(1));
        System.out.println(nobody.getName() + " is attacking " + me.getName() + "! " + me.getName() + " now has : " + me.getHealth() + " health");
        System.out.println();

        george.setHealth(george.getHealth() - me.attack(1, "magic"));
        System.out.println(me.getName() + " is attacking " + george.getName() + "! " + george.getName() + " now has : " + george.getHealth() + " health");
        System.out.println();

        me.setHealth(me.getHealth() - george.poisonAttack(1));
        System.out.println(george.getName() + " is attacking " + me.getName() + "! " + me.getName() + " now has : " + me.getHealth() + " health");
        System.out.println();

        //Testing heal mechanic
        me.setHealth(me.getHealth() + me.heal(2));
        System.out.println("Me's health: " + me.getHealth());
        System.out.println();

        System.out.println("Healer's current health ; " + healer.getHealth());
        healer.setHealth(healer.getHealth() + healer.heal(1));
        System.out.println("Healer's health after healing themself: " + healer.getHealth());
        System.out.println();

        //start of getter/setter tests

        System.out.println("______________ Testing Getters/Setters________________\n");

        System.out.println("Happy is a " + happy.getColor() + " dragon");
        System.out.println("George has " + george.getMight() + " might");
        System.out.println("Is he poisonous? " + george.isPoisonous());
        System.out.println("Well, Drac travels on the " + drac.getTerrain());
        System.out.println(drac.compareTerrain());
        drac.setTerrain("land");
        System.out.println("Now you'll have better chances - he ain't a bat no more");
        System.out.println(drac.compareTerrain());

        System.out.println("Happy has a sore throat.");
        happy.setHasFire(false);
        System.out.println("Does happy still have his fire breath? " + happy.getHasFire());
        System.out.println("That doesn't mean you shouldn't be afraid of him! He has a friend named beast!");
        System.out.println(beast.mightReact());

        System.out.println("Can me heal? " + me.hasHeal());
        System.out.println("But look! Me is still magical! MP: " + me.getMagicPower());

        System.out.println("Happy also has some physical strength: " + happy.getMight());

        System.out.println("I hope that's enough testing! If not we can do more~");

        System.out.println();

        //testing static variables

        System.out.println("____________ Static Variable Outputs ______________\n");
        System.out.println("There are " + Enemy.countEnemies + " enemies total.");
        System.out.println("Dragons: " + Dragon.dragonCount);
        System.out.println("Slimes: " + Slime.slimeCount);
        System.out.println("Monsters: " + Monster.monsterCount);

        System.out.println("There are " + Sorcerer.playerCount + " players to resist them.");

    }//end main method
}//end driver class
