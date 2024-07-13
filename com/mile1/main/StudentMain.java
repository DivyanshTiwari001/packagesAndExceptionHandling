package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
    static Student[] data = new Student[4];

    static {
        // for(int i=0;i<data.length;i++){
        //     data[i] = new Student();
        // }
        data[0] = new Student("Sekar", new int[] { 85, 75, 95 });
        data[1] = new Student(null, new int[] { 11, 22, 33 });
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String []args){
        StudentReport st = new StudentReport();
        for(Student s : data){
            try{
                if(st.validate(s)=="VALID"){
                    System.out.println(st.findGrades(s));
                }
            }catch(NullNameException e){
                e.printStackTrace();
            }catch(NullMarksArrayException e){
                e.printStackTrace();
            }catch(NullStudentObjectException e){
                e.printStackTrace();
            }
        }

        StudentService sv = new StudentService();
        System.out.println("NumberOfNULLMarks"+sv.findNumberOfNullMarksArray(data));
        System.out.println("NumberOfName"+sv.findNumberOfNullName(data));
        System.out.println("NumberOfNULLObjects"+sv.findNumberOfNullObjects(data));
    }
}
