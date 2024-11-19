package Courses;

import java.util.ArrayList;

public class Teacher {
    private int id;
    private String name;
    private ArrayList<Course> courses;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public void removeCourse(Course course){
        this.courses.remove(course);
    }

    public ArrayList<Course> getCourses(){
        return this.courses;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }
}
