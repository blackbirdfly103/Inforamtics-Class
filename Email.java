public class Email {
    public static void main(String[] args) {
        // Task 6: Create more objects and test the methods
        Person p1 = new Person("Eda", "eda@gmail.com", "123-456-7890",3);
        p1.print();
        System.out.println();
        Person p2 = new Person("Hannah", "hannah@gmail.com", "404-899-9955",2);
        p2.print();
        System.out.println();

        Person p3 = new Person("Yan", "b@gmail.com", "111",1);
        System.out.println(p3.getEmail());
        System.out.println(p3.getAge());
        System.out.println(p3.getName());
        System.out.println(p3.getPhoneNumber());
        System.out.println();

        Person p4 = new Person("Yan", "b@gmail.com", "111",1);

        p4.update("B", "y.y@gmail.com", "111",1090);
        p4.print();
        // Task 8: Test the updateEmail method

    }
}

// Define the Person class here
class Person {
    // Instance variables
    private String name;
    private String email;
    private String phoneNumber;
    private int age;


    public Person(String initName, String initEmail, String initPhone, Integer initAge) {
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
        age = initAge;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age: " + age);
    }

    // Task 5: Add getter methods to access and return each attribute individually. Here's an example:
    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    // Task 7: Add a method to update the email
    public void update(String newName, String newEmail, String newPhoneNumber, Integer newAge) {
        name = newName;
        email = newEmail;
        phoneNumber = newPhoneNumber;
        age = newAge;
    }
}
