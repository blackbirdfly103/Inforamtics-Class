public class PlanetZoo {
    public static void main(String[] args) {
        Habitat grassland = new Habitat("Grassland", 1000.5, 25.0);
        Habitat desert = new Habitat("Desert", 500.0, 35.0);

        Animal lion = new Animal("Leo", 5, "Lion", grassland);
        Animal snake = new Animal("Slyther", 2, "Snake", desert);

        System.out.println("Animal 1: " + lion.getDetails());
        System.out.println("Animal 2: " + snake.getDetails());

        Zoo myZoo = new Zoo();
        myZoo.addAnimal1();
        myZoo.addAnimal2();

        Staff caretaker = new Staff("Alice", "Caretaker", null);
        caretaker.assignStaff(grassland);

        Staff caretaker1 = new Staff("John", "Caretaker", null);
        caretaker1.assignStaff(desert);

        System.out.println("Staff: " + caretaker.getDetails());
    }
}

class Animal {
    private String name;
    private int age;
    private String species;
    private String habitat;

    public Animal(String name, int age, String species, Habitat habitat) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.habitat = habitat.toString();
    }

    public String getDetails() {
        return "Name: " + name + ", Age: " + age + ", Species: " + species + ", Habitat: " + habitat;
    }
}

class Habitat {
    private String type;
    private double size;
    private double temperature;

    public Habitat(String type, double size, double temperature) {
        this.type = type;
        this.size = size;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Size: " + size + " sq.m, Temperature: " + temperature + "°C";
    }
}

class Zoo {
    private Animal a1;
    private Animal a2;
    private Animal a3;
    private Animal a4;

    void addAnimal1() {
        a1 = new Animal("Bober", 2, "Beaver", new Habitat("Pond", 300.0, 20.0));
        System.out.println("Added Animal 1: " + a1.getDetails());
    }

    void addAnimal2() {
        a2 = new Animal("Porcos", 3, "Pig", new Habitat("Farm", 500.0, 22.0));
        System.out.println("Added Animal 2: " + a2.getDetails());
    }
}

class Staff {
    private String name;
    private String role;
    private Habitat habitat;

    public Staff(String name, String role, Habitat habitat) {
        this.name = name;
        this.role = role;
        this.habitat = habitat;
    }

    public void assignStaff(Habitat habitat) {
        this.habitat = habitat;
    }

    public String getDetails() {
        return "Name: " + name + ", Role: " + role + ", Habitat: " + (habitat != null ? habitat.toString() : "None");
    }
}
