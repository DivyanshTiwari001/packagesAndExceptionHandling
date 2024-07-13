package com.mile1.bean;

import java.util.Arrays;

public class Student{
    private String name;
    private int []marks;
    private String grade;


    // constructors
    
    public Student(){
        this.name = "Student";
        this.marks = new int[]{0,0,0,0};
        this.grade = "";
    }

    public Student(String grade, int []marks,String name){
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    public Student(String name,int[]marks){
        this.name = name;
        this.marks = marks;
        this.grade = null;
    }

    // setters for properties
    public void setName(String name){
        this.name = name;
    }
    public void setMarks(int [] marks){
        this.marks = marks;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }

    // getters for properties
    public String getName(){
        return name;
    }
    public int[] getMarks(){
        if(marks==null)return null;
        return Arrays.copyOf(marks, marks.length);
    }
    public String getGrade(){
        return grade;
    }
}




