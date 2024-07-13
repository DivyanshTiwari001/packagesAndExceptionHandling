package com.mile1.service;

import com.mile1.bean.Student;


public class StudentService {
     public int findNumberOfNullMarksArray(Student s[]){
        try{
            int c = 0;
            for(Student st : s){
                if(st==null)continue;
                if(st.getMarks()==null)c++;
            }
            return c;

        }catch(NullPointerException e){
            System.out.println("Students array s is null");
            return -1;
        }
     }
     public int findNumberOfNullName(Student s[]){
        try{
            int c = 0;
            for(Student st : s){
                if(st==null)continue;
                if(st.getName()==null)c++;
            }
            return c;

        }catch(NullPointerException e){
            System.out.println("Students array s is null");
            return -1;
        }
     }
     public int findNumberOfNullObjects(Student []s){
        try{
            int c = 0; 
            for(Student st : s){
                if(st==null)c++;
            }
            return c;
        }catch(NullPointerException e){
            System.out.println("Students array s is null");
            return -1;
        }
     }
}
