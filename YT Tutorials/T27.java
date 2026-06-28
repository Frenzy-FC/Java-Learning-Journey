public class T27 {
    public static void main(String[] args){
        // Object Constructor: Logic & Functions

        Student student = new Student("Frenz", 16, 6.2);

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);

        student.study();
    }
}
