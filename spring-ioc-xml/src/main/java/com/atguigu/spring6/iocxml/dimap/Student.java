package com.atguigu.spring6.iocxml.dimap;

import java.util.Map;

public class Student {
    private String sid;
    private  String sname;


    private Map<String,Teacher> teacherMap;

    public void  run () {
        System.out.println("学生编号: "+ sid + "学生的name" + sname);
        System.out.println(teacherMap);
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacherMap=" + teacherMap +
                '}';
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
