package com.personnel.pojo;

public class EnterpriseTalent {
    private long id;//人才编号
    private String name;//人才姓名
    private long workingLife;//工作年限
    private String workExperience;//工作经历
    private String personalProfile;//个人简介
    private long departmentId;//所属部门
    private String graduateSchool;//毕业学校

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWorkingLife() {
        return workingLife;
    }

    public void setWorkingLife(long workingLife) {
        this.workingLife = workingLife;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(String personalProfile) {
        this.personalProfile = personalProfile;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }
}
