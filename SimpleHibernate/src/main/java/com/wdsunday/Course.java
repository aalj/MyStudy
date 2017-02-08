package com.wdsunday;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liangjun on 2017/1/21.
 */
public class Course {
    private Integer cid ;
    private String couName;
    private Set<Student> students = new HashSet<Student>();

    public Course() {
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
