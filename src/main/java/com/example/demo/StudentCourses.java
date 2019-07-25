package com.example.demo;

import javax.persistence.*;

@Entity
public class StudentCourses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;

    public StudentCourses(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public StudentCourses() {
        student = new Student();
        course = new Course();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
