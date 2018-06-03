package cn.sxt.vo;

import java.io.Serializable;

public class Dept implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private String deptName;

    private String teacherName;

    public Dept() {
    }

    public Dept(String deptName, String teacherName) {
        this.deptName = deptName;
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }
}