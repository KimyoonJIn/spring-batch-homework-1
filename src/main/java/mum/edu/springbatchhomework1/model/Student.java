package mum.edu.springbatchhomework1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String first;
    private String last;
    private Double gpa;
    private Integer age;

    public Student() {}

    public Student(Integer id, String first, String last, Double gpa, Integer age) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.gpa = gpa;
        this.age = age;
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
}
