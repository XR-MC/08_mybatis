package edu.shifan.pojo;

/**
 * 实体类
 *  基本类型 === 包装类型
 *      int         == Integer
 *      boolean     == Boolean
 */
public class Student {
    private String stuName;
    private Boolean gender;
    private Integer gradeId;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", gender=" + gender +
                ", gradeId=" + gradeId +
                '}';
    }
}
