package com.example.demo;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String title;

    @NotNull
    private String instructor;

    @NotNull
    @Min(3)
    private int credit;

    @OneToMany(mappedBy = "course")
    private Set<StudentCourses>studentCourses;

    public Course() {
        studentCourses= new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Set<StudentCourses> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Set<StudentCourses> studentCourses) {
        this.studentCourses = studentCourses;
    }
}
