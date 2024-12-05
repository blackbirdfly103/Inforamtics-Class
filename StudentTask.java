class Students{
    private String name;
    private String lastName;
    private int gradeLevel;
    private double marks;
    private String SchoolName;

    public Students(String name, String lastName, int gradeLevel, double marks, String SchoolName) {
        this.name = name;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.marks = marks;
        this.SchoolName = SchoolName;
    }
    void display(){
        if(isHonorStudent()) {
            System.out.println("Dear " + name + " you are selected as one of the honor students of " + SchoolName + " in class 2023 with the GPA of " + marks + ".");
        }
    }
    private boolean isHonorStudent(){
        return marks > 3.8;
    }
}

public class StudentTask {
    public static void main(String[] args){
        // create an object
        Students stu1 = new Students("Ivan", "Tochev", 11, 3.9, "ACS");
        Students stu2 = new Students("Spas", "Stoimenov",11, 3.0, "ACS");

        stu1.display();
        stu2.display();
    }

}
