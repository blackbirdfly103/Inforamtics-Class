public class rpj {

    public static void main(String[] args){
        Wizard wizard = new Wizard("Merlin",100, 10,5);
        Warrior warrior = new Warrior("Ragnar",100,7,10);
        Archer archer = new Archer("Bob",100,5,6);
        // Task 5: Create an object/instance of your new character's class.

        System.out.println(wizard.getName() + "'s health: " + wizard.getHealth());
        System.out.println(warrior.getName()+"'s health: " + warrior.getHealth());
        System.out.println("Game is starting...");
        wizard.setHealthWar(warrior);
        System.out.println( warrior.getName()+" attacks " + wizard.getName() + ". Health updated: " + wizard.getHealth());

        // Task 6: make the wizard attack your new character.
        System.out.println(archer.getName()+ "'s health: " + archer.getHealth());
        archer.setHealthWiz(wizard);
        System.out.println( wizard.getName()+" attacks " + archer.getName() + ". Health updated: " + archer.getHealth());

        // Task 7: display the new stats


        // CHALLENGE: Update your program for all the characters to be able to attack each other.
    }
}


class Wizard {
    private String name;
    private int health;
    private int darkMagic;
    private int wizardArmor;

    public Wizard(String name, int health, int darkMagic, int wizardArmor){
        this.name = name;
        this.health = health;
        this.darkMagic = darkMagic;
        this.wizardArmor = wizardArmor;
    }

    public String getName() {
        return name;
    }

    public int getDarkMagic(){
        return darkMagic;
    }

    public void setHealthWar(Warrior attack) {
        health = health - (attack.getSword() - wizardArmor);
    }

    public void setHealthArch(Archer attack) {
        health = health - (attack.getArcherShot() - wizardArmor);
    }

    public int getHealth() {
        return health;
    }

}

class Warrior {
    private String name;
    private int health;
    private int sword;
    private int metalArmor;

    public Warrior(String name, int health, int sword, int metalArmor){
        this.name = name;
        this.health = health;
        this.sword = sword;
        this.metalArmor = metalArmor;
    }

    public String getName() {
        return name;
    }

    public int getSword() {
        return sword;
    }

    public int getHealth() {
        return health;
    }

    public void setHealthWiz(Wizard attack) {
        health = health - (attack.getDarkMagic() - metalArmor);
    }

    public void setHealthArch(Archer attack) {
        health = health - (attack.getArcherShot() - metalArmor);
    }

}

class Archer {
    private String name;
    private int health;
    private int archerShot;
    private int archerArmor;

    public Archer(String name, int health, int archerShot, int archerArmor){
        this.name = name;
        this.health = health;
        this.archerShot = archerShot;
        this.archerArmor = archerArmor;
    }

    public String getName() {
        return name;
    }

    public int getArcherShot(){
        return archerShot;
    }

    public void setHealthWiz(Wizard attack) {
        health = health - (attack.getDarkMagic() - archerArmor);
    }

    public void setHealthWar(Warrior attack) {
        health = health - (attack.getSword() - archerArmor);
    }

    public int getHealth() {
        return health;
    }

}

// Task 1: Write another class here for a different type of character (e.g. archer)

// Task 2: Write instance variables

// Task 3: Write the constructor

// Task 4: Write the necessary getter(accessor) and setter(modifier) methods.