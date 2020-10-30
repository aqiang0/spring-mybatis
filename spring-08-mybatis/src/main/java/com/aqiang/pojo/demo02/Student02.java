package com.aqiang.pojo.demo02;

public class Student02 {
    private int id;
    private String name;
    private int tid;

    @Override
    public String toString() {
        return "Student02{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tid=" + tid +
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

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Student02() {
    }

    public Student02(int id, String name, int tid) {
        this.id = id;
        this.name = name;
        this.tid = tid;
    }
}
