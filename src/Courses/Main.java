package Courses;

import javax.print.attribute.standard.JobName;
import java.util.ArrayList;

public class Main {

    public static void register_student(Course c, Student s){
        s.addCourse(c);
    }

    public static void register_teacher(Course c, Teacher t){
        t.addCourse(c);
    }

    public static void get_course_teachers(Course c, ArrayList<Teacher> teachers){
        for (Teacher teacher : teachers) {
            if (teacher.getCourses().contains(c)) {
                System.out.println(teacher.getId() + " : " + teacher.getName());
            }
        }
    }

    public static void get_course_students(Course c, ArrayList<Student> students){
        for (Student student : students) {
            if (student.getCourses().contains(c)) {
                System.out.println(student.getId() + " : " + student.getName());
            }
        }
    }

    public static void main(String[] args) {

        Course portuguese = new Course(1, "portuguese", "16 hours");
        Course math = new Course(2, "math", "20 hours");
        Course science = new Course(3, "science", "12 hours");

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(portuguese);
        courses.add(math);
        courses.add(science);

        Teacher Thomas = new Teacher(1, "Thomas");
        Teacher John = new Teacher(2, "John");
        Teacher Michael = new Teacher(3, "Michael");

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(Thomas);
        teachers.add(John);
        teachers.add(Michael);

        Student abraham = new Student(1, "Abraham");
        Student bob = new Student(2, "Bob");
        Student charlie = new Student(3, "Charlie");

        ArrayList<Student> students = new ArrayList<>();
        students.add(abraham);
        students.add(bob);
        students.add(charlie);


        register_teacher(portuguese, Thomas);
        register_teacher(math, Thomas);
        register_teacher(science, Thomas);

        register_teacher(science, John);

        register_teacher(math, Michael);

        System.out.println("Teachers in math");
        get_course_teachers(math, teachers);

        register_student(portuguese, abraham);
        register_student(portuguese, bob);
        register_student(portuguese, charlie);

        register_student(math, charlie);
        register_student(math, abraham);

        register_student(science, charlie);

        System.out.println("Students in math");
        get_course_students(math, students);

    }
}