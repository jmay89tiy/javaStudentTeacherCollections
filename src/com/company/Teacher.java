package com.company;

public class Teacher extends Student{

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getGrade() {
        return super.getGrade();
    }

    @Override
    public void setGrade(int grade) {
        super.setGrade(grade);
    }

    public Teacher(String firstName, String lastName, int id, int grade) {
        super(firstName, lastName, id, grade);


    }
}
