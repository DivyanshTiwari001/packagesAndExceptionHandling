package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {
    public String findGrades(Student s){
        int sum = 0;
        int []marks = s.getMarks();
        for(int mark : marks){
            if(mark < 35)return "F";
            sum += mark;
        }
        if(sum<150)return "C";
        else if(sum<200)return "B";
        else if(sum<250)return "A";
        return "A+";
    }

    public String validate(Student s)
    throws NullNameException,NullMarksArrayException,NullStudentObjectException
    {
        if(s == null)throw new NullStudentObjectException();
        if(s.getName() == null)throw new NullNameException();
        if(s.getMarks() == null)throw new NullMarksArrayException();
        return "VALID";
    }
    
}