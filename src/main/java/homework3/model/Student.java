package homework3.model;

import homework3.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<String> courses;
    private StudentType studentType;

    public Student(String name, int age, StudentType studentType) {
        super(name, age);
        this.courses = new ArrayList<>();
        this.studentType = studentType;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        String studentToString;
        studentToString = "Student{" + super.toString() + ", has the courses=(";
        for (int i = 0; i < courses.size(); i++) {
            studentToString = studentToString + courses.get(i);
            if (i < courses.size() - 1) {
                studentToString = studentToString + ",";
            }
        }
        studentToString = studentToString + "), studentType=" + studentType + "}";
        return studentToString;
    }
}
