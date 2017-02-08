package com.wdsunday;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liangjun on 2017/1/21.
 */
public class Student {
    private Integer sid;
    private String stuname ;
    private Set<Course>  courses = new HashSet<Course>();

    public Student() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
