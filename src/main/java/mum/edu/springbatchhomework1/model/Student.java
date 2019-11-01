package mum.edu.springbatchhomework1.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Student {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String first;
    private String last;
    private Double gpa;

    @Transient
    private Integer age;

    private LocalDate dob;
    public Student() {}

    public Student(String first, String last, Double gpa, Integer age, LocalDate dob) {
        this.first = first;
        this.last = last;
        this.gpa = gpa;
        this.age = age;
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", gpa=" + gpa +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
