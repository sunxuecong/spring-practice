package com.atguigu.spring6.iocxml.ditest;

//员工类
public class Emp {

    //表示员工输入某个部门
    private Dept dept;

    private  String ename;
    private  Integer age;

    public  void  work () {
        System.out.println(ename+"emp weorking..."+"年龄是"+age);
        dept.info();
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
