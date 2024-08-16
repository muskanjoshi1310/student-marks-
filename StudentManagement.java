import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}

public class StudentManagement {
    
    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("muskan", 85));
        students.add(new Student("tanish", 95));
        students.add(new Student("vikas", 75));
        students.add(new Student("aryan", 80));
        students.add(new Student("om", 90));
        return students;
    }
    
    public static void main(String[] args) {
        List<Student> students = getAllStudents();
        
        // Retrieve students whose names start with 'H'
        System.out.println("Students whose names start with 'H':");
        for (Student student : students) {
            if (student.getName().startsWith("H")) {
                System.out.println(student);
            }
        }
        
        // Calculate the average of all marks
        int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        double averageMarks = (double) totalMarks / students.size();
        System.out.println("Average marks of all students: " + averageMarks);
        
        // Remove students whose names start with 'B'
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().startsWith("B")) {
                iterator.remove();
            }
        }
    }
}
        
     
