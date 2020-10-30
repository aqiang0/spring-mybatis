package com.aqiang.pojo.demo02;

import java.util.List;

public class Teacher02 {
    private int id;
    private String name;
    private List<Student02> student02s;

    @Override
    public String toString() {
        return "Teacher02{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student02s=" + student02s +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student02> getStudent02s() {
        return student02s;
    }

    public void setStudent02s(List<Student02> student02s) {
        this.student02s = student02s;
    }

    public Teacher02(int id, String name, List<Student02> student02s) {
        this.id = id;
        this.name = name;
        this.student02s = student02s;
    }

    public Teacher02() {
    }
}
